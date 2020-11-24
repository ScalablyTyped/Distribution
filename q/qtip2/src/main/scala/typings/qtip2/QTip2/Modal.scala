package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal extends js.Object {
  
  var blur: js.UndefOr[Boolean] = js.native
  
  var effect: js.UndefOr[Boolean | (js.Function1[/* state */ js.Any, Unit])] = js.native
  
  var escape: js.UndefOr[Boolean] = js.native
  
  var on: js.UndefOr[Boolean] = js.native
  
  var stealfocus: js.UndefOr[Boolean] = js.native
}
object Modal {
  
  @scala.inline
  def apply(): Modal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modal]
  }
  
  @scala.inline
  implicit class ModalOps[Self <: Modal] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: Boolean): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setEffectFunction1(value: /* state */ js.Any => Unit): Self = this.set("effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffect(value: Boolean | (js.Function1[/* state */ js.Any, Unit])): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setStealfocus(value: Boolean): Self = this.set("stealfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStealfocus: Self = this.set("stealfocus", js.undefined)
  }
}
