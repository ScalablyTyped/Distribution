package typings.reactInfiniteCalendar.anon

import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blank extends js.Object {
  var blank: js.UndefOr[String] = js.undefined
  var headerFormat: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[DistanceInWords] = js.undefined
  var todayLabel: js.UndefOr[Long] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
}

object Blank {
  @scala.inline
  def apply(
    blank: String = null,
    headerFormat: String = null,
    locale: DistanceInWords = null,
    todayLabel: Long = null,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    weekdays: js.Array[String] = null
  ): Blank = {
    val __obj = js.Dynamic.literal()
    if (blank != null) __obj.updateDynamic("blank")(blank.asInstanceOf[js.Any])
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (todayLabel != null) __obj.updateDynamic("todayLabel")(todayLabel.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blank]
  }
}

