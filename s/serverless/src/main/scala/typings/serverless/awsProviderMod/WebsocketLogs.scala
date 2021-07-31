package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsocketLogs extends StObject {
  
  var level: js.UndefOr[String] = js.undefined
}
object WebsocketLogs {
  
  @scala.inline
  def apply(): WebsocketLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketLogs]
  }
  
  @scala.inline
  implicit class WebsocketLogsMutableBuilder[Self <: WebsocketLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
