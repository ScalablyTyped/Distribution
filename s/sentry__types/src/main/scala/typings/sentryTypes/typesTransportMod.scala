package typings.sentryTypes

import typings.sentryTypes.anon.Dictkey
import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportMod {
  
  trait BaseTransportOptions
    extends StObject
       with InternalBaseTransportOptions {
    
    var url: String
  }
  object BaseTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit,
      url: String
    ): BaseTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalBaseTransportOptions extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    def recordDroppedEvent(reason: EventDropReason, dataCategory: DataCategory): Unit
    def recordDroppedEvent(reason: EventDropReason, dataCategory: DataCategory, event: Event): Unit
    @JSName("recordDroppedEvent")
    var recordDroppedEvent_Original: js.Function3[
        /* reason */ EventDropReason, 
        /* dataCategory */ DataCategory, 
        /* event */ js.UndefOr[Event], 
        Unit
      ]
    
    var textEncoder: js.UndefOr[TextEncoderInternal] = js.undefined
  }
  object InternalBaseTransportOptions {
    
    inline def apply(
      recordDroppedEvent: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit
    ): InternalBaseTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction3(recordDroppedEvent))
      __obj.asInstanceOf[InternalBaseTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalBaseTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setRecordDroppedEvent(
        value: (/* reason */ EventDropReason, /* dataCategory */ DataCategory, /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "recordDroppedEvent", js.Any.fromFunction3(value))
      
      inline def setTextEncoder(value: TextEncoderInternal): Self = StObject.set(x, "textEncoder", value.asInstanceOf[js.Any])
      
      inline def setTextEncoderUndefined: Self = StObject.set(x, "textEncoder", js.undefined)
    }
  }
  
  @js.native
  trait Transport extends StObject {
    
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    def send(request: Envelope): PromiseLike[Unit | TransportMakeRequestResponse] = js.native
  }
  
  trait TransportMakeRequestResponse extends StObject {
    
    var headers: js.UndefOr[Dictkey] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object TransportMakeRequestResponse {
    
    inline def apply(): TransportMakeRequestResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportMakeRequestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportMakeRequestResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait TransportRequest extends StObject {
    
    var body: String | js.typedarray.Uint8Array
  }
  object TransportRequest {
    
    inline def apply(body: String | js.typedarray.Uint8Array): TransportRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportRequest] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  type TransportRequestExecutor = js.Function1[/* request */ TransportRequest, PromiseLike[TransportMakeRequestResponse]]
}
