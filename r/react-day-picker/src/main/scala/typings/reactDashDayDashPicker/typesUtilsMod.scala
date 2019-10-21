package typings.reactDashDayDashPicker

import typings.reactDashDayDashPicker.typesCommonMod.Modifier
import typings.reactDashDayDashPicker.typesCommonMod.RangeModifier
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/utils", JSImport.Namespace)
@js.native
object typesUtilsMod extends js.Object {
  @js.native
  trait LocaleUtils extends js.Object {
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
  object ModifiersUtils extends js.Object {
    def dayMatchesModifier(day: Date): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
}

