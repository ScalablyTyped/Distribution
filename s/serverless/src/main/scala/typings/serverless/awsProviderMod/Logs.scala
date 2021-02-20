package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logs extends StObject {
  
  var frameworkLambda: js.UndefOr[Boolean] = js.native
  
  var httpApi: js.UndefOr[Boolean | HttpApiLogs] = js.native
  
  var restApi: js.UndefOr[RestApiLogs] = js.native
  
  var websocket: js.UndefOr[WebsocketLogs] = js.native
}
object Logs {
  
  @scala.inline
  def apply(): Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logs]
  }
  
  @scala.inline
  implicit class LogsMutableBuilder[Self <: Logs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameworkLambda(value: Boolean): Self = StObject.set(x, "frameworkLambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkLambdaUndefined: Self = StObject.set(x, "frameworkLambda", js.undefined)
    
    @scala.inline
    def setHttpApi(value: Boolean | HttpApiLogs): Self = StObject.set(x, "httpApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpApiUndefined: Self = StObject.set(x, "httpApi", js.undefined)
    
    @scala.inline
    def setRestApi(value: RestApiLogs): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    
    @scala.inline
    def setWebsocket(value: WebsocketLogs): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
  }
}
