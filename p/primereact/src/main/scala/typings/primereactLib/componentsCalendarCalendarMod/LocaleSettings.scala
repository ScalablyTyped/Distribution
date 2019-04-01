package typings
package primereactLib.componentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSettings extends js.Object {
  var clear: java.lang.String
  var dayNames: js.Array[java.lang.String]
  var dayNamesMin: js.Array[java.lang.String]
  var dayNamesShort: js.Array[java.lang.String]
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var monthNames: js.Array[java.lang.String]
  var monthNamesShort: js.Array[java.lang.String]
  var today: java.lang.String
}

object LocaleSettings {
  @scala.inline
  def apply(
    clear: java.lang.String,
    dayNames: js.Array[java.lang.String],
    dayNamesMin: js.Array[java.lang.String],
    dayNamesShort: js.Array[java.lang.String],
    monthNames: js.Array[java.lang.String],
    monthNamesShort: js.Array[java.lang.String],
    today: java.lang.String,
    firstDayOfWeek: scala.Int | scala.Double = null
  ): LocaleSettings = {
    val __obj = js.Dynamic.literal(clear = clear, dayNames = dayNames, dayNamesMin = dayNamesMin, dayNamesShort = dayNamesShort, monthNames = monthNames, monthNamesShort = monthNamesShort, today = today)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSettings]
  }
}

