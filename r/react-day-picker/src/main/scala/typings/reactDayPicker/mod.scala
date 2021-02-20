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
import scala.scalajs.js.`|`
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
    
    @JSImport("react-day-picker", "DateUtils.addDayToRange")
    @js.native
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = js.native
    
    @JSImport("react-day-picker", "DateUtils.addMonths")
    @js.native
    def addMonths(d: Date, n: Double): Date = js.native
    
    @JSImport("react-day-picker", "DateUtils.clone")
    @js.native
    def clone_(d: Date): Date = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDate")
    @js.native
    def isDate(d: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayAfter")
    @js.native
    def isDayAfter(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayBefore")
    @js.native
    def isDayBefore(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayBetween")
    @js.native
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(day: Date, range: RangeModifier): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isFutureDay")
    @js.native
    def isFutureDay(day: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isPastDay")
    @js.native
    def isPastDay(day: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isSameDay")
    @js.native
    def isSameDay(day1: Date, day2: Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isSameMonth")
    @js.native
    def isSameMonth(day1: Date, day2: Date): Boolean = js.native
  }
  
  object LocaleUtils {
    
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: Date, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: Date, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(): Double = js.native
    @JSImport("react-day-picker", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.getMonths")
    @js.native
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    @JSImport("react-day-picker", "LocaleUtils.getMonths")
    @js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String): Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String): Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
  }
  
  object ModifiersUtils {
    
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: Date): Boolean = js.native
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
    
    @JSImport("react-day-picker", "ModifiersUtils.getModifiersForDay")
    @js.native
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
}
