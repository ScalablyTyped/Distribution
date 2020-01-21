package typings.reactToolbox.libDatePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerLocale extends js.Object {
  /**
    * Month names.
    */
  var months: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Month short names.
    */
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Day names starting from Sunday.
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Day letters starting from Sunday.
    */
  var weekdaysLetter: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Day short names starting from Sunday.
    */
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object DatePickerLocale {
  @scala.inline
  def apply(
    months: js.Array[String] = null,
    monthsShort: js.Array[String] = null,
    weekdays: js.Array[String] = null,
    weekdaysLetter: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): DatePickerLocale = {
    val __obj = js.Dynamic.literal()
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysLetter != null) __obj.updateDynamic("weekdaysLetter")(weekdaysLetter.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerLocale]
  }
}

