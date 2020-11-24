package typings.reactNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Register extends js.Object {
  
  def register(key: String): Unit = js.native
  
  def unregister(key: String): Unit = js.native
}
object Register {
  
  @scala.inline
  def apply(register: String => Unit, unregister: String => Unit): Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[Register]
  }
  
  @scala.inline
  implicit class RegisterOps[Self <: Register] (val x: Self) extends AnyVal {
    
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
    def setRegister(value: String => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: String => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
