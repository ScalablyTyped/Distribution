package typings.smithyTypes

import typings.smithyTypes.distTypesEventStreamMod.Message
import typings.smithyTypes.distTypesHttpMod.HttpRequest
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSignatureMod {
  
  type DateInput = Double | String | js.Date
  
  trait EventSigner extends StObject {
    
    /**
      * Sign the individual event of the event stream.
      */
    def sign(event: FormattedEvent, options: EventSigningArguments): js.Promise[String]
  }
  object EventSigner {
    
    inline def apply(sign: (FormattedEvent, EventSigningArguments) => js.Promise[String]): EventSigner = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign))
      __obj.asInstanceOf[EventSigner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSigner] (val x: Self) extends AnyVal {
      
      inline def setSign(value: (FormattedEvent, EventSigningArguments) => js.Promise[String]): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
    }
  }
  
  trait EventSigningArguments
    extends StObject
       with SigningArguments {
    
    var priorSignature: String
  }
  object EventSigningArguments {
    
    inline def apply(priorSignature: String): EventSigningArguments = {
      val __obj = js.Dynamic.literal(priorSignature = priorSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSigningArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSigningArguments] (val x: Self) extends AnyVal {
      
      inline def setPriorSignature(value: String): Self = StObject.set(x, "priorSignature", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormattedEvent extends StObject {
    
    var headers: js.typedarray.Uint8Array
    
    var payload: js.typedarray.Uint8Array
  }
  object FormattedEvent {
    
    inline def apply(headers: js.typedarray.Uint8Array, payload: js.typedarray.Uint8Array): FormattedEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedEvent] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.typedarray.Uint8Array): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageSigner extends StObject {
    
    def sign(event: SignableMessage, options: SigningArguments): js.Promise[SignedMessage]
    
    def signMessage(message: SignableMessage, args: SigningArguments): js.Promise[SignedMessage]
  }
  object MessageSigner {
    
    inline def apply(
      sign: (SignableMessage, SigningArguments) => js.Promise[SignedMessage],
      signMessage: (SignableMessage, SigningArguments) => js.Promise[SignedMessage]
    ): MessageSigner = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), signMessage = js.Any.fromFunction2(signMessage))
      __obj.asInstanceOf[MessageSigner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageSigner] (val x: Self) extends AnyVal {
      
      inline def setSign(value: (SignableMessage, SigningArguments) => js.Promise[SignedMessage]): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setSignMessage(value: (SignableMessage, SigningArguments) => js.Promise[SignedMessage]): Self = StObject.set(x, "signMessage", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RequestPresigner extends StObject {
    
    /**
      * Signs a request for future use.
      *
      * The request will be valid until either the provided `expiration` time has
      * passed or the underlying credentials have expired.
      *
      * @param requestToSign - The request that should be signed.
      * @param options - Additional signing options.
      */
    def presign(requestToSign: HttpRequest): js.Promise[HttpRequest] = js.native
    def presign(requestToSign: HttpRequest, options: RequestPresigningArguments): js.Promise[HttpRequest] = js.native
  }
  
  trait RequestPresigningArguments
    extends StObject
       with RequestSigningArguments {
    
    /**
      * The number of seconds before the presigned URL expires
      */
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    /**
      * A set of strings whose representing headers that should not be hoisted
      * to presigned request's query string. If not supplied, the presigner
      * moves all the AWS-specific headers (starting with `x-amz-`) to the request
      * query string. If supplied, these headers remain in the presigned request's
      * header.
      * All headers in the provided request will have their names converted to
      * lower case and then checked for existence in the unhoistableHeaders set.
      */
    var unhoistableHeaders: js.UndefOr[Set[String]] = js.undefined
  }
  object RequestPresigningArguments {
    
    inline def apply(): RequestPresigningArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestPresigningArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPresigningArguments] (val x: Self) extends AnyVal {
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setUnhoistableHeaders(value: Set[String]): Self = StObject.set(x, "unhoistableHeaders", value.asInstanceOf[js.Any])
      
      inline def setUnhoistableHeadersUndefined: Self = StObject.set(x, "unhoistableHeaders", js.undefined)
    }
  }
  
  @js.native
  trait RequestSigner extends StObject {
    
    /**
      * Sign the provided request for immediate dispatch.
      */
    def sign(requestToSign: HttpRequest): js.Promise[HttpRequest] = js.native
    def sign(requestToSign: HttpRequest, options: RequestSigningArguments): js.Promise[HttpRequest] = js.native
  }
  
  trait RequestSigningArguments
    extends StObject
       with SigningArguments {
    
    /**
      * A set of strings whose members represents headers that should be signed.
      * Any values passed here will override those provided via unsignableHeaders,
      * allowing them to be signed.
      *
      * All headers in the provided request will have their names converted to
      * lower case before signing.
      */
    var signableHeaders: js.UndefOr[Set[String]] = js.undefined
    
    /**
      * A set of strings whose members represents headers that cannot be signed.
      * All headers in the provided request will have their names converted to
      * lower case and then checked for existence in the unsignableHeaders set.
      */
    var unsignableHeaders: js.UndefOr[Set[String]] = js.undefined
  }
  object RequestSigningArguments {
    
    inline def apply(): RequestSigningArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestSigningArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestSigningArguments] (val x: Self) extends AnyVal {
      
      inline def setSignableHeaders(value: Set[String]): Self = StObject.set(x, "signableHeaders", value.asInstanceOf[js.Any])
      
      inline def setSignableHeadersUndefined: Self = StObject.set(x, "signableHeaders", js.undefined)
      
      inline def setUnsignableHeaders(value: Set[String]): Self = StObject.set(x, "unsignableHeaders", value.asInstanceOf[js.Any])
      
      inline def setUnsignableHeadersUndefined: Self = StObject.set(x, "unsignableHeaders", js.undefined)
    }
  }
  
  trait SignableMessage extends StObject {
    
    var message: Message
    
    var priorSignature: String
  }
  object SignableMessage {
    
    inline def apply(message: Message, priorSignature: String): SignableMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], priorSignature = priorSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignableMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignableMessage] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPriorSignature(value: String): Self = StObject.set(x, "priorSignature", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedMessage extends StObject {
    
    var message: Message
    
    var signature: String
  }
  object SignedMessage {
    
    inline def apply(message: Message, signature: String): SignedMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignedMessage] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait SigningArguments extends StObject {
    
    /**
      * The date and time to be used as signature metadata. This value should be
      * a Date object, a unix (epoch) timestamp, or a string that can be
      * understood by the JavaScript `Date` constructor.If not supplied, the
      * value returned by `new Date()` will be used.
      */
    var signingDate: js.UndefOr[DateInput] = js.undefined
    
    /**
      * The region name to sign the request. It will override the signing region of the
      * signer in current invocation
      */
    var signingRegion: js.UndefOr[String] = js.undefined
    
    /**
      * The service signing name. It will override the service name of the signer
      * in current invocation
      */
    var signingService: js.UndefOr[String] = js.undefined
  }
  object SigningArguments {
    
    inline def apply(): SigningArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigningArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SigningArguments] (val x: Self) extends AnyVal {
      
      inline def setSigningDate(value: DateInput): Self = StObject.set(x, "signingDate", value.asInstanceOf[js.Any])
      
      inline def setSigningDateUndefined: Self = StObject.set(x, "signingDate", js.undefined)
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      inline def setSigningServiceUndefined: Self = StObject.set(x, "signingService", js.undefined)
    }
  }
  
  @js.native
  trait StringSigner extends StObject {
    
    /**
      * Sign the provided `stringToSign` for use outside of the context of
      * request signing. Typical uses include signed policy generation.
      */
    def sign(stringToSign: String): js.Promise[String] = js.native
    def sign(stringToSign: String, options: SigningArguments): js.Promise[String] = js.native
  }
}
