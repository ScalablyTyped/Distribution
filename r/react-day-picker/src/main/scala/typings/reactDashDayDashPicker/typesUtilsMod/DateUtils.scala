package typings.reactDashDayDashPicker.typesUtilsMod

import typings.reactDashDayDashPicker.typesCommonMod.RangeModifier
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateUtils extends js.Object {
  def addDayToRange(day: Date, range: RangeModifier): RangeModifier
  def addMonths(d: Date, n: Double): Date
  def clone(d: Date): Date
  def isDate(d: Date): Boolean
  def isDayAfter(day1: Date, day2: Date): Boolean
  def isDayBefore(day1: Date, day2: Date): Boolean
  def isDayBetween(day: Date, begin: Date, end: Date): Boolean
  def isDayInRange(day: Date, range: RangeModifier): Boolean
  def isFutureDay(day: Date): Boolean
  def isPastDay(day: Date): Boolean
  def isSameDay(day1: Date, day2: Date): Boolean
  def isSameMonth(day1: Date, day2: Date): Boolean
}

object DateUtils {
  @scala.inline
  def apply(
    addDayToRange: (Date, RangeModifier) => RangeModifier,
    addMonths: (Date, Double) => Date,
    clone: Date => Date,
    isDate: Date => Boolean,
    isDayAfter: (Date, Date) => Boolean,
    isDayBefore: (Date, Date) => Boolean,
    isDayBetween: (Date, Date, Date) => Boolean,
    isDayInRange: (Date, RangeModifier) => Boolean,
    isFutureDay: Date => Boolean,
    isPastDay: Date => Boolean,
    isSameDay: (Date, Date) => Boolean,
    isSameMonth: (Date, Date) => Boolean
  ): DateUtils = {
    val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), clone = js.Any.fromFunction1(clone), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
  
    __obj.asInstanceOf[DateUtils]
  }
}

