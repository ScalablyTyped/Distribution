package typings
package reactDashDayDashPickerLib.typesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateUtils extends js.Object {
  def addDayToRange(day: stdLib.Date, range: reactDashDayDashPickerLib.typesCommonMod.RangeModifier): reactDashDayDashPickerLib.typesCommonMod.RangeModifier
  def addMonths(d: stdLib.Date, n: scala.Double): stdLib.Date
  def clone(d: stdLib.Date): stdLib.Date
  def isDate(d: stdLib.Date): scala.Boolean
  def isDayAfter(day1: stdLib.Date, day2: stdLib.Date): scala.Boolean
  def isDayBefore(day1: stdLib.Date, day2: stdLib.Date): scala.Boolean
  def isDayBetween(day: stdLib.Date, begin: stdLib.Date, end: stdLib.Date): scala.Boolean
  def isDayInRange(day: stdLib.Date, range: reactDashDayDashPickerLib.typesCommonMod.RangeModifier): scala.Boolean
  def isFutureDay(day: stdLib.Date): scala.Boolean
  def isPastDay(day: stdLib.Date): scala.Boolean
  def isSameDay(day1: stdLib.Date, day2: stdLib.Date): scala.Boolean
  def isSameMonth(day1: stdLib.Date, day2: stdLib.Date): scala.Boolean
}

object DateUtils {
  @scala.inline
  def apply(
    addDayToRange: (stdLib.Date, reactDashDayDashPickerLib.typesCommonMod.RangeModifier) => reactDashDayDashPickerLib.typesCommonMod.RangeModifier,
    addMonths: (stdLib.Date, scala.Double) => stdLib.Date,
    clone: stdLib.Date => stdLib.Date,
    isDate: stdLib.Date => scala.Boolean,
    isDayAfter: (stdLib.Date, stdLib.Date) => scala.Boolean,
    isDayBefore: (stdLib.Date, stdLib.Date) => scala.Boolean,
    isDayBetween: (stdLib.Date, stdLib.Date, stdLib.Date) => scala.Boolean,
    isDayInRange: (stdLib.Date, reactDashDayDashPickerLib.typesCommonMod.RangeModifier) => scala.Boolean,
    isFutureDay: stdLib.Date => scala.Boolean,
    isPastDay: stdLib.Date => scala.Boolean,
    isSameDay: (stdLib.Date, stdLib.Date) => scala.Boolean,
    isSameMonth: (stdLib.Date, stdLib.Date) => scala.Boolean
  ): DateUtils = {
    val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), clone = js.Any.fromFunction1(clone), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
  
    __obj.asInstanceOf[DateUtils]
  }
}

