package typings.serverless

import typings.serverless.anon.Authorizer
import typings.serverless.anon.Http
import typings.serverless.anon.Method
import typings.serverless.anon.MethodString
import typings.serverless.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsAwsPackageCompileEventsApiGatewayLibValidateMod {
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHttp[T /* <: js.Object */](event: Http[T], functionName: String): Method | T = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttp")(event.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Method | T]
  
  inline def getHttpMethod(http: MethodString, functionName: String): HttpMethod = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpMethod")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[HttpMethod]
  
  inline def getHttpPath(http: Path, functionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpPath")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ApiGatewayEvent extends StObject {
    
    var http: String | Authorizer
  }
  object ApiGatewayEvent {
    
    inline def apply(http: String | Authorizer): ApiGatewayEvent = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiGatewayEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiGatewayEvent] (val x: Self) extends AnyVal {
      
      inline def setHttp(value: String | Authorizer): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
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
    
    inline def any: typings.serverless.serverlessStrings.any = "any".asInstanceOf[typings.serverless.serverlessStrings.any]
    
    inline def delete: typings.serverless.serverlessStrings.delete = "delete".asInstanceOf[typings.serverless.serverlessStrings.delete]
    
    inline def get: typings.serverless.serverlessStrings.get = "get".asInstanceOf[typings.serverless.serverlessStrings.get]
    
    inline def head: typings.serverless.serverlessStrings.head = "head".asInstanceOf[typings.serverless.serverlessStrings.head]
    
    inline def options: typings.serverless.serverlessStrings.options = "options".asInstanceOf[typings.serverless.serverlessStrings.options]
    
    inline def patch: typings.serverless.serverlessStrings.patch = "patch".asInstanceOf[typings.serverless.serverlessStrings.patch]
    
    inline def post: typings.serverless.serverlessStrings.post = "post".asInstanceOf[typings.serverless.serverlessStrings.post]
    
    inline def put: typings.serverless.serverlessStrings.put = "put".asInstanceOf[typings.serverless.serverlessStrings.put]
  }
}
