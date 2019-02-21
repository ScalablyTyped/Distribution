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

