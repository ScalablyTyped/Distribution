package typings.reactDayPicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeUtilsMod {
  
  @js.native
  trait LocaleUtils extends StObject {
    
    def formatDate(date: Date): String = js.native
    def formatDate(date: Date, format: String): String = js.native
    def formatDate(date: Date, format: String, locale: String): String = js.native
    def formatDate(date: Date, format: js.Array[String]): String = js.native
    def formatDate(date: Date, format: js.Array[String], locale: String): String = js.native
    def formatDate(date: Date, format: Unit, locale: String): String = js.native
    
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
    def parseDate(str: String, format: Unit, locale: String): Date = js.native
  }
  object LocaleUtils {
    
    @JSImport("react-day-picker/types/LocaleUtils", "LocaleUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatDate(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatDate(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Date, format: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Date, format: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Date, format: js.Array[String], locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Date, format: Unit, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatDay(day: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatDay(day: Date, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatMonthTitle(month: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthTitle")(month.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatMonthTitle(month: Date, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthTitle")(month.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatWeekdayLong(weekday: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayLong")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatWeekdayLong(weekday: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayLong")(weekday.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatWeekdayShort(weekday: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayShort")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatWeekdayShort(weekday: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayShort")(weekday.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getFirstDayOfWeek(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[Double]
    inline def getFirstDayOfWeek(locale: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")(locale.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonths")().asInstanceOf[js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]]
    inline def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonths")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]]
    
    inline def parseDate(str: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def parseDate(str: String, format: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def parseDate(str: String, format: String, locale: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def parseDate(str: String, format: Unit, locale: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Date]
  }
}
