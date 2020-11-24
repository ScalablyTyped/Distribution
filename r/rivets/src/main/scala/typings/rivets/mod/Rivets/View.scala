package typings.rivets.mod.Rivets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  def bind(): Unit = js.native
  
  def build(): Unit = js.native
  
  def unbind(): Unit = js.native
}
object View {
  
  @scala.inline
  def apply(bind: () => Unit, build: () => Unit, unbind: () => Unit): View = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), build = js.Any.fromFunction0(build), unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    
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
    def setBind(value: () => Unit): Self = this.set("bind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => Unit): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = this.set("unbind", js.Any.fromFunction0(value))
  }
}
