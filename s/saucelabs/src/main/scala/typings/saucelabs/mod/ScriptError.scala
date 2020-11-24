package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptError
  extends /* key */ StringDictionary[js.Any] {
  
  var info: js.UndefOr[StringDictionary[String]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
}
object ScriptError {
  
  @scala.inline
  def apply(): ScriptError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptError]
  }
  
  @scala.inline
  implicit class ScriptErrorOps[Self <: ScriptError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfo(value: StringDictionary[String]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
