package typings.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeFormat extends js.Object {
  var long: String = js.native
  var medium: String = js.native
  var mediumLong: String = js.native
  var short: String = js.native
}

object TimeFormat {
  @scala.inline
  def apply(long: String, medium: String, mediumLong: String, short: String): TimeFormat = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumLong = mediumLong.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFormat]
  }
  @scala.inline
  implicit class TimeFormatOps[Self <: TimeFormat] (val x: Self) extends AnyVal {
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
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumLong(value: String): Self = this.set("mediumLong", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

