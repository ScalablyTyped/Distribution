package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeResult extends js.Object {
  def get_value(): Date = js.native
}

object DateTimeResult {
  @scala.inline
  def apply(get_value: () => Date): DateTimeResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DateTimeResult]
  }
  @scala.inline
  implicit class DateTimeResultOps[Self <: DateTimeResult] (val x: Self) extends AnyVal {
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
    def setGet_value(value: () => Date): Self = this.set("get_value", js.Any.fromFunction0(value))
  }
  
}

