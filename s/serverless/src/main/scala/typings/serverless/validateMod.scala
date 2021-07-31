package typings.serverless

import typings.serverless.anon.Authorizer
import typings.serverless.anon.Http
import typings.serverless.anon.Method
import typings.serverless.anon.MethodString
import typings.serverless.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getHttp[T /* <: js.Object */](event: Http[T], functionName: String): Method | T = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttp")(event.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Method | T]
  
  @scala.inline
  def getHttpMethod(http: MethodString, functionName: String): HttpMethod = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpMethod")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[HttpMethod]
  
  @scala.inline
  def getHttpPath(http: Path, functionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpPath")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ApiGatewayEvent extends StObject {
    
    var http: String | Authorizer
  }
  object ApiGatewayEvent {
    
    @scala.inline
    def apply(http: String | Authorizer): ApiGatewayEvent = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiGatewayEvent]
    }
    
    @scala.inline
    implicit class ApiGatewayEventMutableBuilder[Self <: ApiGatewayEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: String | Authorizer): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.serverless.serverlessStrings.get
    - typings.serverless.serverlessStrings.post
    - typings.serverless.serverlessStrings.put
    - typings.serverless.serverlessStrings.patch
    - typings.serverless.serverlessStrings.options
    - typings.serverless.serverlessStrings.head
    - typings.serverless.serverlessStrings.delete
    - typings.serverless.serverlessStrings.any
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def any: typings.serverless.serverlessStrings.any = "any".asInstanceOf[typings.serverless.serverlessStrings.any]
    
    @scala.inline
    def delete: typings.serverless.serverlessStrings.delete = "delete".asInstanceOf[typings.serverless.serverlessStrings.delete]
    
    @scala.inline
    def get: typings.serverless.serverlessStrings.get = "get".asInstanceOf[typings.serverless.serverlessStrings.get]
    
    @scala.inline
    def head: typings.serverless.serverlessStrings.head = "head".asInstanceOf[typings.serverless.serverlessStrings.head]
    
    @scala.inline
    def options: typings.serverless.serverlessStrings.options = "options".asInstanceOf[typings.serverless.serverlessStrings.options]
    
    @scala.inline
    def patch: typings.serverless.serverlessStrings.patch = "patch".asInstanceOf[typings.serverless.serverlessStrings.patch]
    
    @scala.inline
    def post: typings.serverless.serverlessStrings.post = "post".asInstanceOf[typings.serverless.serverlessStrings.post]
    
    @scala.inline
    def put: typings.serverless.serverlessStrings.put = "put".asInstanceOf[typings.serverless.serverlessStrings.put]
  }
}
