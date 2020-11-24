package typings.reactNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushUpdates extends js.Object {
  
  def flushUpdates(): Unit = js.native
  
  def scheduleUpdate(callback: js.Function0[Unit]): Unit = js.native
}
object FlushUpdates {
  
  @scala.inline
  def apply(flushUpdates: () => Unit, scheduleUpdate: js.Function0[Unit] => Unit): FlushUpdates = {
    val __obj = js.Dynamic.literal(flushUpdates = js.Any.fromFunction0(flushUpdates), scheduleUpdate = js.Any.fromFunction1(scheduleUpdate))
    __obj.asInstanceOf[FlushUpdates]
  }
  
  @scala.inline
  implicit class FlushUpdatesOps[Self <: FlushUpdates] (val x: Self) extends AnyVal {
    
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
    def setFlushUpdates(value: () => Unit): Self = this.set("flushUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScheduleUpdate(value: js.Function0[Unit] => Unit): Self = this.set("scheduleUpdate", js.Any.fromFunction1(value))
  }
}
