package typings.reactDayPicker.dateUtilsMod

import typings.reactDayPicker.modifiersMod.RangeModifier
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

@JSImport("react-day-picker/types/DateUtils", "DateUtils")
@js.native
object DateUtils extends js.Object {
  def addDayToRange(day: Date, range: RangeModifier): RangeModifier = js.native
  def addMonths(d: Date, n: Double): Date = js.native
  def clone(d: Date): Date = js.native
  def isDate(d: Date): Boolean = js.native
  def isDayAfter(day1: Date, day2: Date): Boolean = js.native
  def isDayBefore(day1: Date, day2: Date): Boolean = js.native
  def isDayBetween(day: Date, begin: Date, end: Date): Boolean = js.native
  def isDayInRange(day: Date, range: RangeModifier): Boolean = js.native
  def isFutureDay(day: Date): Boolean = js.native
  def isPastDay(day: Date): Boolean = js.native
  def isSameDay(day1: Date, day2: Date): Boolean = js.native
  def isSameMonth(day1: Date, day2: Date): Boolean = js.native
}

