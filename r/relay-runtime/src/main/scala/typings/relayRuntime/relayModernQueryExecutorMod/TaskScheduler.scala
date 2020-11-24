package typings.relayRuntime.relayModernQueryExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskScheduler extends js.Object {
  
  def cancel(id: String): Unit = js.native
  
  def schedule(fn: js.Function0[Unit]): String = js.native
}
object TaskScheduler {
  
  @scala.inline
  def apply(cancel: String => Unit, schedule: js.Function0[Unit] => String): TaskScheduler = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), schedule = js.Any.fromFunction1(schedule))
    __obj.asInstanceOf[TaskScheduler]
  }
  
  @scala.inline
  implicit class TaskSchedulerOps[Self <: TaskScheduler] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: String => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchedule(value: js.Function0[Unit] => String): Self = this.set("schedule", js.Any.fromFunction1(value))
  }
}
