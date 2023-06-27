package typings.smithyTypes

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransferMod {
  
  @js.native
  sealed trait RequestHandlerProtocol extends StObject
  @JSImport("@smithy/types/dist-types/transfer", "RequestHandlerProtocol")
  @js.native
  object RequestHandlerProtocol extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RequestHandlerProtocol & String] = js.native
    
    @js.native
    sealed trait HTTP_0_9
      extends StObject
         with RequestHandlerProtocol
    /* "http/0.9" */ val HTTP_0_9: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_0_9 & String = js.native
    
    @js.native
    sealed trait HTTP_1_0
      extends StObject
         with RequestHandlerProtocol
    /* "http/1.0" */ val HTTP_1_0: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_1_0 & String = js.native
    
    @js.native
    sealed trait TDS_8_0
      extends StObject
         with RequestHandlerProtocol
    /* "tds/8.0" */ val TDS_8_0: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.TDS_8_0 & String = js.native
  }
  
  trait RequestContext extends StObject {
    
    var destination: URL
  }
  object RequestContext {
    
    inline def apply(destination: URL): RequestContext = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestContext] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: URL): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestHandler[RequestType, ResponseType, HandlerOptions] extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    def handle(request: RequestType): js.Promise[RequestHandlerOutput[ResponseType]] = js.native
    def handle(request: RequestType, handlerOptions: HandlerOptions): js.Promise[RequestHandlerOutput[ResponseType]] = js.native
    
    /**
      * metadata contains information of a handler. For example
      * 'h2' refers this handler is for handling HTTP/2 requests,
      * whereas 'h1' refers handling HTTP1 requests
      */
    var metadata: js.UndefOr[RequestHandlerMetadata] = js.native
  }
  
  trait RequestHandlerMetadata extends StObject {
    
    var handlerProtocol: RequestHandlerProtocol | String
  }
  object RequestHandlerMetadata {
    
    inline def apply(handlerProtocol: RequestHandlerProtocol | String): RequestHandlerMetadata = {
      val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHandlerMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHandlerMetadata] (val x: Self) extends AnyVal {
      
      inline def setHandlerProtocol(value: RequestHandlerProtocol | String): Self = StObject.set(x, "handlerProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestHandlerOutput[ResponseType] extends StObject {
    
    var response: ResponseType
  }
  object RequestHandlerOutput {
    
    inline def apply[ResponseType](response: ResponseType): RequestHandlerOutput[ResponseType] = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHandlerOutput[ResponseType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHandlerOutput[?], ResponseType] (val x: Self & RequestHandlerOutput[ResponseType]) extends AnyVal {
      
      inline def setResponse(value: ResponseType): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
