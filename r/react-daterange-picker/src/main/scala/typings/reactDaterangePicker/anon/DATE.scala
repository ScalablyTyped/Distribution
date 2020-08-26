package typings.reactDaterangePicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DATE extends js.Object {
  var DATE: String = js.native
  var DATETIME_LOCAL: String = js.native
  var DATETIME_LOCAL_MS: String = js.native
  var DATETIME_LOCAL_SECONDS: String = js.native
  var MONTH: String = js.native
  var TIME: String = js.native
  var TIME_MS: String = js.native
  var TIME_SECONDS: String = js.native
  var WEEK: String = js.native
}

object DATE {
  @scala.inline
  def apply(
    DATE: String,
    DATETIME_LOCAL: String,
    DATETIME_LOCAL_MS: String,
    DATETIME_LOCAL_SECONDS: String,
    MONTH: String,
    TIME: String,
    TIME_MS: String,
    TIME_SECONDS: String,
    WEEK: String
  ): DATE = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], DATETIME_LOCAL = DATETIME_LOCAL.asInstanceOf[js.Any], DATETIME_LOCAL_MS = DATETIME_LOCAL_MS.asInstanceOf[js.Any], DATETIME_LOCAL_SECONDS = DATETIME_LOCAL_SECONDS.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], TIME = TIME.asInstanceOf[js.Any], TIME_MS = TIME_MS.asInstanceOf[js.Any], TIME_SECONDS = TIME_SECONDS.asInstanceOf[js.Any], WEEK = WEEK.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATE]
  }
  @scala.inline
  implicit class DATEOps[Self <: DATE] (val x: Self) extends AnyVal {
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
    def setDATE(value: String): Self = this.set("DATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATETIME_LOCAL(value: String): Self = this.set("DATETIME_LOCAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATETIME_LOCAL_MS(value: String): Self = this.set("DATETIME_LOCAL_MS", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATETIME_LOCAL_SECONDS(value: String): Self = this.set("DATETIME_LOCAL_SECONDS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMONTH(value: String): Self = this.set("MONTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIME(value: String): Self = this.set("TIME", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIME_MS(value: String): Self = this.set("TIME_MS", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIME_SECONDS(value: String): Self = this.set("TIME_SECONDS", value.asInstanceOf[js.Any])
    @scala.inline
    def setWEEK(value: String): Self = this.set("WEEK", value.asInstanceOf[js.Any])
  }
  
}

