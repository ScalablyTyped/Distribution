package typings.primereact.calendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSettings extends js.Object {
  var clear: String
  var dayNames: js.Array[String]
  var dayNamesMin: js.Array[String]
  var dayNamesShort: js.Array[String]
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var monthNames: js.Array[String]
  var monthNamesShort: js.Array[String]
  var today: String
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
    today: String,
    firstDayOfWeek: Int | Double = null
  ): LocaleSettings = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesMin = dayNamesMin.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSettings]
  }
}

