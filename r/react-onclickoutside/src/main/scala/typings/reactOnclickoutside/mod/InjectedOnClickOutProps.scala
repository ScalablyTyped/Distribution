package typings.reactOnclickoutside.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectedOnClickOutProps extends js.Object {
  
  def disableOnClickOutside(): Unit = js.native
  
  def enableOnClickOutside(): Unit = js.native
}
object InjectedOnClickOutProps {
  
  @scala.inline
  def apply(disableOnClickOutside: () => Unit, enableOnClickOutside: () => Unit): InjectedOnClickOutProps = {
    val __obj = js.Dynamic.literal(disableOnClickOutside = js.Any.fromFunction0(disableOnClickOutside), enableOnClickOutside = js.Any.fromFunction0(enableOnClickOutside))
    __obj.asInstanceOf[InjectedOnClickOutProps]
  }
  
  @scala.inline
  implicit class InjectedOnClickOutPropsOps[Self <: InjectedOnClickOutProps] (val x: Self) extends AnyVal {
    
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
    def setDisableOnClickOutside(value: () => Unit): Self = this.set("disableOnClickOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableOnClickOutside(value: () => Unit): Self = this.set("enableOnClickOutside", js.Any.fromFunction0(value))
  }
}
