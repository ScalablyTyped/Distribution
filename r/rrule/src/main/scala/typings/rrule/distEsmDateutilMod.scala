package typings.rrule

import typings.rrule.distEsmDatetimeMod.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmDateutilMod {
  
  @JSImport("rrule/dist/esm/dateutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rrule/dist/esm/dateutil", "MAXYEAR")
  @js.native
  val MAXYEAR: /* 9999 */ Double = js.native
  
  @JSImport("rrule/dist/esm/dateutil", "MONTH_DAYS")
  @js.native
  val MONTH_DAYS: js.Array[Double] = js.native
  
  @JSImport("rrule/dist/esm/dateutil", "ONE_DAY")
  @js.native
  val ONE_DAY: Double = js.native
  
  @JSImport("rrule/dist/esm/dateutil", "ORDINAL_BASE")
  @js.native
  val ORDINAL_BASE: js.Date = js.native
  
  @JSImport("rrule/dist/esm/dateutil", "PY_WEEKDAYS")
  @js.native
  val PY_WEEKDAYS: js.Array[Double] = js.native
  
  inline def cloneDates(dates: js.Array[js.Date | Time]): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDates")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def clone_(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def clone_(date: Time): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def combine(date: js.Date, time: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def combine(date: js.Date, time: Time): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def dateInTimeZone(date: js.Date, timeZone: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dateInTimeZone")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def datetime(y: Double, m: Double, d: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Double, i: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Double, i: Double, s: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Double, i: Unit, s: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Unit, i: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Unit, i: Double, s: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def datetime(y: Double, m: Double, d: Double, h: Unit, i: Unit, s: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(y.asInstanceOf[js.Any], m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any], i.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def daysBetween(date1: js.Date, date2: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysBetween")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromOrdinal(ordinal: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrdinal")(ordinal.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMonthDays(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDays")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getWeekday(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekday")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getYearDay(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def monthRange(year: Double, month: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthRange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def sort[T /* <: Datelike */](dates: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(dates.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeToUntilString(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def timeToUntilString(time: Double, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toOrdinal(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tzOffset(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def untilStringToDate(until: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("untilStringToDate")(until.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /* Inlined std.Pick<std.Date, 'getTime'> */
  trait Datelike extends StObject {
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
  }
  object Datelike {
    
    inline def apply(getTime: () => Double): Datelike = {
      val __obj = js.Dynamic.literal(getTime = js.Any.fromFunction0(getTime))
      __obj.asInstanceOf[Datelike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datelike] (val x: Self) extends AnyVal {
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    }
  }
}
