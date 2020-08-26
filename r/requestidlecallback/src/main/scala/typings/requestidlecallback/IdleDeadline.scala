package typings.requestidlecallback

import typings.std.DOMHighResTimeStamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleDeadline extends js.Object {
  val didTimeout: Boolean = js.native
  def timeRemaining(): DOMHighResTimeStamp = js.native
}

object IdleDeadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[IdleDeadline]
  }
  @scala.inline
  implicit class IdleDeadlineOps[Self <: IdleDeadline] (val x: Self) extends AnyVal {
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
    def setTimeRemaining(value: () => DOMHighResTimeStamp): Self = this.set("timeRemaining", js.Any.fromFunction0(value))
  }
  
}

