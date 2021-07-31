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
  
  @scala.inline
  def apply(): ScriptWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptWarning]
  }
  
  @scala.inline
  implicit class ScriptWarningMutableBuilder[Self <: ScriptWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: StringDictionary[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
