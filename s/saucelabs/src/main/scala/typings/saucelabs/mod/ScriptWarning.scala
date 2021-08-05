package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptWarning
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var info: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object ScriptWarning {
  
  inline def apply(): ScriptWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptWarning]
  }
  
  extension [Self <: ScriptWarning](x: Self) {
    
    inline def setInfo(value: StringDictionary[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
