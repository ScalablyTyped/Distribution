package typings.primereact.calendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSettings extends js.Object {
  var clear: String = js.native
  var dayNames: js.Array[String] = js.native
  var dayNamesMin: js.Array[String] = js.native
  var dayNamesShort: js.Array[String] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var monthNames: js.Array[String] = js.native
  var monthNamesShort: js.Array[String] = js.native
  var today: String = js.native
}

object LocaleSettings {
  @scala.inline
  def apply(
    clear: String,
    dayNames: js.Array[String],
    dayNamesMin: js.Array[String],
    dayNamesShort: js.Array[String],
    monthNames: js.Array[String],
    monthNamesShort: js.Array[String],
    today: String
  ): LocaleSettings = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesMin = dayNamesMin.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSettings]
  }
  @scala.inline
  implicit class LocaleSettingsOps[Self <: LocaleSettings] (val x: Self) extends AnyVal {
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNamesMinVarargs(value: String*): Self = this.set("dayNamesMin", js.Array(value :_*))
    @scala.inline
    def setDayNamesMin(value: js.Array[String]): Self = this.set("dayNamesMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = this.set("dayNamesShort", js.Array(value :_*))
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = this.set("monthNamesShort", js.Array(value :_*))
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
  }
  
}

