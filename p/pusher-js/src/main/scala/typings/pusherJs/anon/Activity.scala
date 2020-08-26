package typings.pusherJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  def activity(): Unit = js.native
  def closed(): Unit = js.native
  def error(error: js.Any): Unit = js.native
  def message(message: String): Unit = js.native
  def ping(): Unit = js.native
}

object Activity {
  @scala.inline
  def apply(
    activity: () => Unit,
    closed: () => Unit,
    error: js.Any => Unit,
    message: String => Unit,
    ping: () => Unit
  ): Activity = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
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
    def setActivity(value: () => Unit): Self = this.set("activity", js.Any.fromFunction0(value))
    @scala.inline
    def setClosed(value: () => Unit): Self = this.set("closed", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setMessage(value: String => Unit): Self = this.set("message", js.Any.fromFunction1(value))
    @scala.inline
    def setPing(value: () => Unit): Self = this.set("ping", js.Any.fromFunction0(value))
  }
  
}

