package typings.protooClient

import typings.node.httpMod.OutgoingHttpHeaders
import typings.protooClient.mod.ProtooResponse
import typings.protooClient.protooClientBooleans.`false`
import typings.protooClient.protooClientBooleans.`true`
import typings.retry.mod.OperationOptions
import typings.websocket.mod.IClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClientConfig extends StObject {
    
    var clientConfig: js.UndefOr[IClientConfig] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var protocols: js.UndefOr[String | js.Array[String]] = js.native
    
    var requestOptions: js.UndefOr[js.Object] = js.native
    
    var retry: js.UndefOr[OperationOptions] = js.native
  }
  object ClientConfig {
    
    @scala.inline
    def apply(): ClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientConfig(value: IClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setRequestOptions(value: js.Object): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setRetry(value: OperationOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
  
  @js.native
  trait Data extends ProtooResponse {
    
    var data: js.Any = js.native
    
    var id: Double = js.native
    
    var ok: `true` = js.native
    
    var response: `true` = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, id: Double, ok: `true`, response: `true`): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: `true`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorCode extends ProtooResponse {
    
    var errorCode: Double = js.native
    
    var errorReason: String = js.native
    
    var id: Double = js.native
    
    var ok: `false` = js.native
    
    var response: `true` = js.native
  }
  object ErrorCode {
    
    @scala.inline
    def apply(errorCode: Double, errorReason: String, id: Double, ok: `false`, response: `true`): ErrorCode = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCode]
    }
    
    @scala.inline
    implicit class ErrorCodeMutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: `true`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
