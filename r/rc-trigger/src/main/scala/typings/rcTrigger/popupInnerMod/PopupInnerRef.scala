package typings.rcTrigger.popupInnerMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupInnerRef extends js.Object {
  
  def forceAlign(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
}
object PopupInnerRef {
  
  @scala.inline
  def apply(forceAlign: () => Unit, getElement: () => HTMLElement): PopupInnerRef = {
    val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign), getElement = js.Any.fromFunction0(getElement))
    __obj.asInstanceOf[PopupInnerRef]
  }
  
  @scala.inline
  implicit class PopupInnerRefOps[Self <: PopupInnerRef] (val x: Self) extends AnyVal {
    
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
    def setForceAlign(value: () => Unit): Self = this.set("forceAlign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
  }
}
