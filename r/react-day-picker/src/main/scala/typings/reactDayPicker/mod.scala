package typings.reactDayPicker

import typings.reactDayPicker.dateUtilsMod.DateUtils
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.reactDayPicker.modifiersMod.Modifier
import typings.reactDayPicker.modifiersMod.Modifiers
import typings.reactDayPicker.modifiersMod.ModifiersUtils
import typings.reactDayPicker.modifiersMod.RangeModifier
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-day-picker", JSImport.Default)
  @js.native
  class default ()
    extends typings.reactDayPicker.dayPickerMod.default
  /* static members */
  object default {
    
    @JSImport("react-day-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-day-picker", "default.DateUtils")
    @js.native
    def DateUtils: typings.reactDayPicker.dateUtilsMod.DateUtils = js.native
    @scala.inline
    def DateUtils_=(x: DateUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.DayModifiers")
    @js.native
    def DayModifiers: typings.reactDayPicker.modifiersMod.DayModifiers = js.native
    @scala.inline
    def DayModifiers_=(x: DayModifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayModifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.LocaleUtils")
    @js.native
    def LocaleUtils: typings.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    @scala.inline
    def LocaleUtils_=(x: LocaleUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocaleUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.Modifiers")
    @js.native
    def Modifiers: typings.reactDayPicker.modifiersMod.Modifiers = js.native
    
    @JSImport("react-day-picker", "default.ModifiersUtils")
    @js.native
    def ModifiersUtils: typings.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    @scala.inline
    def ModifiersUtils_=(x: ModifiersUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModifiersUtils")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Modifiers_=(x: Modifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  object DateUtils {
    
    @JSImport("react-day-picker", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = (^.asInstanceOf[js.Dynamic].applyDynamic("addDayToRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[RangeModifier]
    
    @scala.inline
    def addMonths(d: Date, n: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(d.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @scala.inline
    def clone_(d: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(d.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def isDate(d: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayAfter(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayAfter")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayBefore(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayBefore")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayBetween")(day.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isDayInRange(day: Date, range: RangeModifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDayInRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isFutureDay(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureDay")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isPastDay(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPastDay")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSameDay(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isSameMonth(day1: Date, day2: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameMonth")(day1.asInstanceOf[js.Any], day2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object LocaleUtils {
    
    @JSImport("react-day-picker", "LocaleUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def formatDate(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatDate(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def formatDate(date: Date, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def formatDate(date: Date, format: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def formatDate(date: Date, format: js.Array[String], locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def formatDate(date: Date, format: Unit, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def formatDay(day: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatDay(day: Date, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def formatMonthTitle(month: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthTitle")(month.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatMonthTitle(month: Date, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthTitle")(month.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def formatWeekdayLong(weekday: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayLong")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatWeekdayLong(weekday: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayLong")(weekday.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def formatWeekdayShort(weekday: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayShort")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatWeekdayShort(weekday: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayShort")(weekday.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getFirstDayOfWeek(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[Double]
    @scala.inline
    def getFirstDayOfWeek(locale: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")(locale.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonths")().asInstanceOf[js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]]
    @scala.inline
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonths")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]]
    
    @scala.inline
    def parseDate(str: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def parseDate(str: String, format: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def parseDate(str: String, format: String, locale: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def parseDate(str: String, format: Unit, locale: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Date]
  }
  
  object ModifiersUtils {
    
    @JSImport("react-day-picker", "ModifiersUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dayMatchesModifier(day: Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dayMatchesModifier")(day.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifiersForDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
}
