package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeartbeatEvent extends SimperiumEvent {
  def beat(count: Double): Unit = js.native
  def timeout(): Unit = js.native
}

object HeartbeatEvent {
  @scala.inline
  def apply(beat: Double => Unit, timeout: () => Unit): HeartbeatEvent = {
    val __obj = js.Dynamic.literal(beat = js.Any.fromFunction1(beat), timeout = js.Any.fromFunction0(timeout))
    __obj.asInstanceOf[HeartbeatEvent]
  }
  @scala.inline
  implicit class HeartbeatEventOps[Self <: HeartbeatEvent] (val x: Self) extends AnyVal {
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
    def setBeat(value: Double => Unit): Self = this.set("beat", js.Any.fromFunction1(value))
    @scala.inline
    def setTimeout(value: () => Unit): Self = this.set("timeout", js.Any.fromFunction0(value))
  }
  
}

