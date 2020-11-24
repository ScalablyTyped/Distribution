package typings.rx.Rx.internals

import typings.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulePeriodicRecursive extends js.Object {
  
  def start(): IDisposable = js.native
}
object SchedulePeriodicRecursive {
  
  @scala.inline
  def apply(start: () => IDisposable): SchedulePeriodicRecursive = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[SchedulePeriodicRecursive]
  }
  
  @scala.inline
  implicit class SchedulePeriodicRecursiveOps[Self <: SchedulePeriodicRecursive] (val x: Self) extends AnyVal {
    
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
    def setStart(value: () => IDisposable): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
