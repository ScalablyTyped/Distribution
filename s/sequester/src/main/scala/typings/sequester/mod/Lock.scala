package typings.sequester.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lock extends js.Object {
  
  var count: Double = js.native
  
  def dispose(): Unit = js.native
  
  def downgrade(): Unit = js.native
  
  def exclude(cb: Callback): Unit = js.native
  
  def share(cb: Callback): Unit = js.native
  
  def unlock(): Unit = js.native
}
object Lock {
  
  @scala.inline
  def apply(
    count: Double,
    dispose: () => Unit,
    downgrade: () => Unit,
    exclude: Callback => Unit,
    share: Callback => Unit,
    unlock: () => Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), downgrade = js.Any.fromFunction0(downgrade), exclude = js.Any.fromFunction1(exclude), share = js.Any.fromFunction1(share), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[Lock]
  }
  
  @scala.inline
  implicit class LockOps[Self <: Lock] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDowngrade(value: () => Unit): Self = this.set("downgrade", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExclude(value: Callback => Unit): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShare(value: Callback => Unit): Self = this.set("share", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = this.set("unlock", js.Any.fromFunction0(value))
  }
}
