package typings.schedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deadline extends js.Object {
  var didTimeout: Boolean = js.native
  def timeRemaining(): Double = js.native
}

object Deadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: () => Double): Deadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[Deadline]
  }
  @scala.inline
  implicit class DeadlineOps[Self <: Deadline] (val x: Self) extends AnyVal {
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
    def setDidTimeout(value: Boolean): Self = this.set("didTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeRemaining(value: () => Double): Self = this.set("timeRemaining", js.Any.fromFunction0(value))
  }
  
}

