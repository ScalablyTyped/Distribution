package typings.rbx.navbarContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavbarContextValue extends js.Object {
  
  var active: Boolean = js.native
  
  def setActive(value: Boolean): Unit = js.native
}
object NavbarContextValue {
  
  @scala.inline
  def apply(active: Boolean, setActive: Boolean => Unit): NavbarContextValue = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[NavbarContextValue]
  }
  
  @scala.inline
  implicit class NavbarContextValueOps[Self <: NavbarContextValue] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActive(value: Boolean => Unit): Self = this.set("setActive", js.Any.fromFunction1(value))
  }
}
