package typings.requireHacker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unmount extends js.Object {
  
  /** Unmount this `require` hook from the system. */
  def unmount(): Unit = js.native
}
object Unmount {
  
  @scala.inline
  def apply(unmount: () => Unit): Unmount = {
    val __obj = js.Dynamic.literal(unmount = js.Any.fromFunction0(unmount))
    __obj.asInstanceOf[Unmount]
  }
  
  @scala.inline
  implicit class UnmountOps[Self <: Unmount] (val x: Self) extends AnyVal {
    
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
    def setUnmount(value: () => Unit): Self = this.set("unmount", js.Any.fromFunction0(value))
  }
}
