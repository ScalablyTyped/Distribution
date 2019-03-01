package typings
package reactDashToolboxLib.libDateUnderscorePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerLocale extends js.Object {
  /**
    * Month names.
    */
  var months: js.UndefOr[coreDashJsLib.Array[java.lang.String]] = js.undefined
  /**
    * Month short names.
    */
  var monthsShort: js.UndefOr[coreDashJsLib.Array[java.lang.String]] = js.undefined
  /**
    * Day names starting from Sunday.
    */
  var weekdays: js.UndefOr[coreDashJsLib.Array[java.lang.String]] = js.undefined
  /**
    * Day letters starting from Sunday.
    */
  var weekdaysLetter: js.UndefOr[coreDashJsLib.Array[java.lang.String]] = js.undefined
  /**
    * Day short names starting from Sunday.
    */
  var weekdaysShort: js.UndefOr[coreDashJsLib.Array[java.lang.String]] = js.undefined
}

object DatePickerLocale {
  @scala.inline
  def apply(
    months: coreDashJsLib.Array[java.lang.String] = null,
    monthsShort: coreDashJsLib.Array[java.lang.String] = null,
    weekdays: coreDashJsLib.Array[java.lang.String] = null,
    weekdaysLetter: coreDashJsLib.Array[java.lang.String] = null,
    weekdaysShort: coreDashJsLib.Array[java.lang.String] = null
  ): DatePickerLocale = {
    val __obj = js.Dynamic.literal()
    if (months != null) __obj.updateDynamic("months")(months)
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort)
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays)
    if (weekdaysLetter != null) __obj.updateDynamic("weekdaysLetter")(weekdaysLetter)
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[DatePickerLocale]
  }
}

