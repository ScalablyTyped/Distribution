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
    addDayToRange: js.Function2[
      stdLib.Date, 
      reactDashDayDashPickerLib.typesCommonMod.RangeModifier, 
      reactDashDayDashPickerLib.typesCommonMod.RangeModifier
    ],
    addMonths: js.Function2[stdLib.Date, scala.Double, stdLib.Date],
    clone: js.Function1[stdLib.Date, stdLib.Date],
    isDate: js.Function1[stdLib.Date, scala.Boolean],
    isDayAfter: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    isDayBefore: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    isDayBetween: js.Function3[stdLib.Date, stdLib.Date, stdLib.Date, scala.Boolean],
    isDayInRange: js.Function2[stdLib.Date, reactDashDayDashPickerLib.typesCommonMod.RangeModifier, scala.Boolean],
    isFutureDay: js.Function1[stdLib.Date, scala.Boolean],
    isPastDay: js.Function1[stdLib.Date, scala.Boolean],
    isSameDay: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    isSameMonth: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean]
  ): DateUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDayToRange")(addDayToRange)
    __obj.updateDynamic("addMonths")(addMonths)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("isDate")(isDate)
    __obj.updateDynamic("isDayAfter")(isDayAfter)
    __obj.updateDynamic("isDayBefore")(isDayBefore)
    __obj.updateDynamic("isDayBetween")(isDayBetween)
    __obj.updateDynamic("isDayInRange")(isDayInRange)
    __obj.updateDynamic("isFutureDay")(isFutureDay)
    __obj.updateDynamic("isPastDay")(isPastDay)
    __obj.updateDynamic("isSameDay")(isSameDay)
    __obj.updateDynamic("isSameMonth")(isSameMonth)
    __obj.asInstanceOf[DateUtils]
  }
}

