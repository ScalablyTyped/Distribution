package typings.sipJs

import typings.sipJs.bodyMod.Body
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outgoingRequestMod {
  
  @js.native
  trait OutgoingRequest extends StObject {
    
    /**
      * Sends a CANCEL message targeting this request to the UAS.
      * @param reason - Reason for canceling request.
      * @param options - Request options bucket.
      */
    def cancel(): Unit = js.native
    def cancel(reason: js.UndefOr[scala.Nothing], options: RequestOptions): Unit = js.native
    def cancel(reason: String): Unit = js.native
    def cancel(reason: String, options: RequestOptions): Unit = js.native
    
    /** Delegate providing custom handling of this outgoing request. */
    var delegate: js.UndefOr[OutgoingRequestDelegate] = js.native
    
    /**
      * Destroy request.
      */
    def dispose(): Unit = js.native
    
    /** The outgoing message. */
    val message: OutgoingRequestMessage = js.native
  }
  
  @js.native
  trait OutgoingRequestDelegate extends StObject {
    
    /**
      * Received a 2xx positive final response to this request.
      * @param response - Incoming response.
      */
    var onAccept: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
    
    /**
      * Received a 1xx provisional response to this request. Excluding 100 responses.
      * @param response - Incoming response.
      */
    var onProgress: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
    
    /**
      * Received a 3xx negative final response to this request.
      * @param response - Incoming response.
      */
    var onRedirect: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
    
    /**
      * Received a 4xx, 5xx, or 6xx negative final response to this request.
      * @param response - Incoming response.
      */
    var onReject: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
    
    /**
      * Received a 100 provisional response.
      * @param response - Incoming response.
      */
    var onTrying: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  }
  object OutgoingRequestDelegate {
    
    @scala.inline
    def apply(): OutgoingRequestDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingRequestDelegate]
    }
    
    @scala.inline
    implicit class OutgoingRequestDelegateMutableBuilder[Self <: OutgoingRequestDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAccept(value: /* response */ IncomingResponse => Unit): Self = StObject.set(x, "onAccept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAcceptUndefined: Self = StObject.set(x, "onAccept", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* response */ IncomingResponse => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRedirect(value: /* response */ IncomingResponse => Unit): Self = StObject.set(x, "onRedirect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRedirectUndefined: Self = StObject.set(x, "onRedirect", js.undefined)
      
      @scala.inline
      def setOnReject(value: /* response */ IncomingResponse => Unit): Self = StObject.set(x, "onReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRejectUndefined: Self = StObject.set(x, "onReject", js.undefined)
      
      @scala.inline
      def setOnTrying(value: /* response */ IncomingResponse => Unit): Self = StObject.set(x, "onTrying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTryingUndefined: Self = StObject.set(x, "onTrying", js.undefined)
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    /** Body to include in the message. */
    var body: js.UndefOr[Body] = js.native
    
    /** Extra headers to include in the message. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    }
  }
}
