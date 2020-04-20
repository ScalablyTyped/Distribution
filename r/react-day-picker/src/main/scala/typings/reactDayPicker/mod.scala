package typings.reactDayPicker

import typings.reactDayPicker.modifiersMod.Modifier
import typings.reactDayPicker.modifiersMod.RangeModifier
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typings.reactDayPicker.dayPickerMod.default
  
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
  
  @js.native
  object LocaleUtils extends js.Object {
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, format: String): String = js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    def formatDay(day: Date): String = js.native
    def formatDay(day: Date, locale: String): String = js.native
    def formatMonthTitle(month: Date): String = js.native
    def formatMonthTitle(month: Date, locale: String): String = js.native
    def formatWeekdayLong(weekday: Double): String = js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    def formatWeekdayShort(weekday: Double): String = js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    def getFirstDayOfWeek(): Double = js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    def parseDate(str: String): Date = js.native
    def parseDate(str: String, format: String): Date = js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
  }
  
  @js.native
  object ModifiersUtils extends js.Object {
    def dayMatchesModifier(day: Date): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: typings.reactDayPicker.dateUtilsMod.DateUtils = js.native
    var DayModifiers: typings.reactDayPicker.modifiersMod.DayModifiers = js.native
    var LocaleUtils: typings.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    var Modifiers: typings.reactDayPicker.modifiersMod.Modifiers = js.native
    var ModifiersUtils: typings.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    var VERSION: String = js.native
  }
  
}

