package typings.rrule

import typings.rrule.typesMod.ParsedOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("rrule/dist/esm/src/datetime", "DateTime")
  @js.native
  class DateTime protected () extends Time {
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Double
    ) = this()
    
    def add(options: ParsedOptions, filtered: Boolean): Unit = js.native
    
    def addDaily(days: Double): Unit = js.native
    
    def addHours(hours: Double, filtered: Boolean, byhour: js.Array[Double]): Unit = js.native
    
    def addMinutes(minutes: Double, filtered: Boolean, byhour: js.Array[Double], byminute: js.Array[Double]): Unit = js.native
    
    def addMonths(months: Double): Unit = js.native
    
    def addSeconds(
      seconds: Double,
      filtered: Boolean,
      byhour: js.Array[Double],
      byminute: js.Array[Double],
      bysecond: js.Array[Double]
    ): Unit = js.native
    
    def addWeekly(days: Double, wkst: Double): Unit = js.native
    
    def addYears(years: Double): Unit = js.native
    
    var day: Double = js.native
    
    def fixDay(): Unit = js.native
    
    def getDay(): Double = js.native
    
    def getMonth(): Double = js.native
    
    def getWeekday(): Double = js.native
    
    def getYear(): Double = js.native
    
    var month: Double = js.native
    
    var year: Double = js.native
  }
  /* static members */
  object DateTime {
    
    @JSImport("rrule/dist/esm/src/datetime", "DateTime")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromDate(date: Date): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  }
  
  @JSImport("rrule/dist/esm/src/datetime", "Time")
  @js.native
  class Time protected () extends StObject {
    def this(hour: Double, minute: Double, second: Double, millisecond: Double) = this()
    
    def getHours(): Double = js.native
    
    def getMilliseconds(): Double = js.native
    
    def getMinutes(): Double = js.native
    
    def getSeconds(): Double = js.native
    
    def getTime(): Double = js.native
    
    var hour: Double = js.native
    
    var millisecond: Double = js.native
    
    var minute: Double = js.native
    
    var second: Double = js.native
  }
}
