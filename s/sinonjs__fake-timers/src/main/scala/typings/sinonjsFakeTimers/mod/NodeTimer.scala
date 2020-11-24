package typings.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTimer extends js.Object {
  
  /**
    * Stub method call. Does nothing.
    */
  def ref(): Unit = js.native
  
  /**
    * Stub method call. Does nothing.
    */
  def unref(): Unit = js.native
}
object NodeTimer {
  
  @scala.inline
  def apply(ref: () => Unit, unref: () => Unit): NodeTimer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[NodeTimer]
  }
  
  @scala.inline
  implicit class NodeTimerOps[Self <: NodeTimer] (val x: Self) extends AnyVal {
    
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
    def setRef(value: () => Unit): Self = this.set("ref", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnref(value: () => Unit): Self = this.set("unref", js.Any.fromFunction0(value))
  }
}
