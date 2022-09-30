package typings.rrule

import typings.rrule.datetimeMod.Time
import typings.rrule.monthinfoMod.MonthInfo
import typings.rrule.rruleInts.`365`
import typings.rrule.rruleInts.`366`
import typings.rrule.typesMod.Frequency
import typings.rrule.typesMod.Frequency.HOURLY
import typings.rrule.typesMod.Frequency.MINUTELY
import typings.rrule.typesMod.Frequency.SECONDLY
import typings.rrule.typesMod.ParsedOptions
import typings.rrule.yearinfoMod.YearInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterinfoMod {
  
  @JSImport("rrule/dist/esm/iterinfo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Iterinfo {
    def this(options: ParsedOptions) = this()
  }
  
  type DaySet = js.Tuple3[js.Array[Double | Null], Double, Double]
  
  type GetDayset = js.Function0[DaySet]
  
  @js.native
  trait Iterinfo extends StObject {
    
    def ddayset(year: Double, month: Double, day: Double): js.Array[Double | js.Array[Double]] = js.native
    
    var eastermask: js.Array[Double] | Null = js.native
    
    def getdayset(freq: Frequency): js.Function3[/* y */ Double, /* m */ Double, /* d */ Double, DaySet] = js.native
    
    def gettimeset(freq: HOURLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: MINUTELY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: SECONDLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    
    def htimeset(hour: Double, _underscore: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    
    def lastmonth: Double = js.native
    
    def lastyear: Double = js.native
    
    def mdaymask: js.Array[Double] = js.native
    
    def mdayset(_underscore: Any, month: Double): js.Array[Double | (js.Array[Double | js.Array[Double]])] = js.native
    
    def mmask: js.Array[Double] = js.native
    
    var monthinfo: MonthInfo = js.native
    
    def mrange: js.Array[Double] = js.native
    
    def mtimeset(hour: Double, minute: Double, _underscore: Double, millisecond: Double): js.Array[Time] = js.native
    
    def nextyearlen: `366` | `365` = js.native
    
    def nmdaymask: js.Array[Double] = js.native
    
    def nwdaymask: js.Array[Double] = js.native
    
    /* private */ var options: Any = js.native
    
    def rebuild(year: Double, month: Double): Unit = js.native
    
    def stimeset(hour: Double, minute: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    
    def wdaymask: js.Array[Double] = js.native
    
    def wdayset(year: Double, month: Double, day: Double): js.Array[Double | (js.Array[Double | js.Array[Double]])] = js.native
    
    def wnomask: js.Array[Double] = js.native
    
    def ydayset(): js.Array[Double | js.Array[Double]] = js.native
    
    var yearinfo: YearInfo = js.native
    
    def yearlen: `366` | `365` = js.native
    
    def yearordinal: Double = js.native
  }
}
