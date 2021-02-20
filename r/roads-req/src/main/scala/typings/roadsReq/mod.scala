package typings.roadsReq

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.roadsReq.anon.Encoding
import typings.roadsReq.anon.Pw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roads-req", JSImport.Default)
  @js.native
  def default(options: RoadsReqOptions): js.Promise[RoadsRequestResponse] = js.native
  
  @js.native
  trait RoadsReqOptions extends StObject {
    
    var basicAuth: js.UndefOr[Pw] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var request: RequestOptions | typings.node.httpsMod.RequestOptions = js.native
    
    var requestBody: js.UndefOr[String] = js.native
    
    var response: js.UndefOr[Encoding] = js.native
  }
  object RoadsReqOptions {
    
    @scala.inline
    def apply(request: RequestOptions | typings.node.httpsMod.RequestOptions): RoadsReqOptions = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoadsReqOptions]
    }
    
    @scala.inline
    implicit class RoadsReqOptionsMutableBuilder[Self <: RoadsReqOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasicAuth(value: Pw): Self = StObject.set(x, "basicAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicAuthUndefined: Self = StObject.set(x, "basicAuth", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBody(value: String): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      @scala.inline
      def setResponse(value: Encoding): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  @js.native
  trait RoadsRequestResponse extends StObject {
    
    var body: String = js.native
    
    var response: IncomingMessage = js.native
  }
  object RoadsRequestResponse {
    
    @scala.inline
    def apply(body: String, response: IncomingMessage): RoadsRequestResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoadsRequestResponse]
    }
    
    @scala.inline
    implicit class RoadsRequestResponseMutableBuilder[Self <: RoadsRequestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
