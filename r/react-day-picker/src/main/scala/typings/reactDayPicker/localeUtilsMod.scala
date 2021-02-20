package typings.reactDayPicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeUtilsMod {
  
  @js.native
  trait LocaleUtils extends StObject {
    
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
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
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): Date = js.native
    def parseDate(str: String, format: String): Date = js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
  }
  object LocaleUtils {
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: String): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: Date): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: Date, locale: String): String = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: Date): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: Date, locale: String): String = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double): String = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(): Double = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.getMonths")
    @js.native
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.getMonths")
    @js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String): Date = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): Date = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String): Date = js.native
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String, locale: String): Date = js.native
  }
}
