package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.ERROR
import typings.serverless.serverlessStrings.INFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsocketLogs extends StObject {
  
  var level: js.UndefOr[INFO | ERROR] = js.undefined
}
object WebsocketLogs {
  
  inline def apply(): WebsocketLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketLogs]
  }
  
  extension [Self <: WebsocketLogs](x: Self) {
    
    inline def setLevel(value: INFO | ERROR): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
