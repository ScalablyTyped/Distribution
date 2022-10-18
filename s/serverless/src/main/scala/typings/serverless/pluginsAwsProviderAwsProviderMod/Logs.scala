package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logs extends StObject {
  
  var frameworkLambda: js.UndefOr[Boolean] = js.undefined
  
  var httpApi: js.UndefOr[Boolean | HttpApiLogs] = js.undefined
  
  var restApi: js.UndefOr[`true` | RestApiLogs] = js.undefined
  
  var websocket: js.UndefOr[WebsocketLogs] = js.undefined
}
object Logs {
  
  inline def apply(): Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logs]
  }
  
  extension [Self <: Logs](x: Self) {
    
    inline def setFrameworkLambda(value: Boolean): Self = StObject.set(x, "frameworkLambda", value.asInstanceOf[js.Any])
    
    inline def setFrameworkLambdaUndefined: Self = StObject.set(x, "frameworkLambda", js.undefined)
    
    inline def setHttpApi(value: Boolean | HttpApiLogs): Self = StObject.set(x, "httpApi", value.asInstanceOf[js.Any])
    
    inline def setHttpApiUndefined: Self = StObject.set(x, "httpApi", js.undefined)
    
    inline def setRestApi(value: `true` | RestApiLogs): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    
    inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    
    inline def setWebsocket(value: WebsocketLogs): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
  }
}
