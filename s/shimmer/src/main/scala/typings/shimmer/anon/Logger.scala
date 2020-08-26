package typings.shimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
}

object Logger {
  @scala.inline
  def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setLogger(value: /* msg */ String => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
  
}

