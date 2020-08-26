package typings.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverStatic extends js.Object {
  /**
    * Schedules the invocation of observer methods on the given scheduler.
    * @param scheduler Scheduler to schedule observer messages on.
    * @returns Observer whose messages are scheduled on the given scheduler.
    */
  def notifyOn[T](scheduler: IScheduler): Observer[T] = js.native
}

object ObserverStatic {
  @scala.inline
  def apply(notifyOn: IScheduler => Observer[js.Any]): ObserverStatic = {
    val __obj = js.Dynamic.literal(notifyOn = js.Any.fromFunction1(notifyOn))
    __obj.asInstanceOf[ObserverStatic]
  }
  @scala.inline
  implicit class ObserverStaticOps[Self <: ObserverStatic] (val x: Self) extends AnyVal {
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
    def setNotifyOn(value: IScheduler => Observer[js.Any]): Self = this.set("notifyOn", js.Any.fromFunction1(value))
  }
  
}

