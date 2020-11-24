package typings.restartHooks.useFocusManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusController extends js.Object {
  
  def onBlur(event: js.Any): Unit = js.native
  
  def onFocus(event: js.Any): Unit = js.native
}
object FocusController {
  
  @scala.inline
  def apply(onBlur: js.Any => Unit, onFocus: js.Any => Unit): FocusController = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[FocusController]
  }
  
  @scala.inline
  implicit class FocusControllerOps[Self <: FocusController] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(value: js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
  }
}
