package typings.rrule

import typings.rrule.datetimeMod.Time
import typings.rrule.monthinfoMod.MonthInfo
import typings.rrule.rruleNumbers.`365`
import typings.rrule.rruleNumbers.`366`
import typings.rrule.typesMod.Frequency
import typings.rrule.typesMod.Frequency.HOURLY
import typings.rrule.typesMod.Frequency.MINUTELY
import typings.rrule.typesMod.Frequency.SECONDLY
import typings.rrule.typesMod.ParsedOptions
import typings.rrule.yearinfoMod.YearInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/iterinfo", JSImport.Namespace)
@js.native
object iterinfoMod extends js.Object {
  
  @js.native
  trait Iterinfo extends js.Object {
    
    def ddayset(year: Double, month: Double, day: Double): js.Array[Double | (js.Array[Double | Null])] = js.native
    
    var eastermask: js.Array[Double] | Null = js.native
    
    def getdayset(freq: Frequency): js.Function3[/* y */ Double, /* m */ Double, /* d */ Double, DaySet] = js.native
    
    def gettimeset(freq: HOURLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: MINUTELY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: SECONDLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    
    def htimeset(hour: Double, _underscore: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    
    def lastmonth: Double | Null = js.native
    
    def lastyear: Double | Null = js.native
    
    def mdaymask: js.Array[Double] = js.native
    
    def mdayset(_underscore: js.Any, month: Double, __ : js.Any): js.Array[Double | (js.Array[Double | (js.Array[Double | Null]) | Null])] = js.native
    
    def mmask: js.Array[Double] = js.native
    
    var monthinfo: MonthInfo = js.native
    
    def mrange: js.Array[Double] = js.native
    
    def mtimeset(hour: Double, minute: Double, _underscore: Double, millisecond: Double): js.Array[Time] = js.native
    
    def nextyearlen: `366` | `365` = js.native
    
    def nmdaymask: js.Array[Double] = js.native
    
    def nwdaymask: js.Array[Double] = js.native
    
    var options: js.Any = js.native
    
    def rebuild(year: Double, month: Double): Unit = js.native
    
    def stimeset(hour: Double, minute: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    
    def wdaymask: js.Array[Double] = js.native
    
    def wdayset(year: Double, month: Double, day: Double): js.Array[Double | (js.Array[Double | (js.Array[Double | Null]) | Null])] = js.native
    
    def wnomask: js.Array[Double] | Null = js.native
    
    def ydayset(): js.Array[Double | js.Array[Double]] = js.native
    
    var yearinfo: YearInfo = js.native
    
    def yearlen: `366` | `365` = js.native
    
    def yearordinal: Double = js.native
  }
  
  @js.native
  class default protected () extends Iterinfo {
    def this(options: ParsedOptions) = this()
  }
  
  type DaySet = js.Tuple3[js.Array[Double | Null], Double, Double]
  
  type GetDayset = js.Function0[DaySet]
}
