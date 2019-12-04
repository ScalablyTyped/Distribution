package typings.rrule

import typings.rrule.distEsmSrcDatetimeMod.Time
import typings.rrule.distEsmSrcIterinfoMod.DaySet
import typings.rrule.distEsmSrcIterinfoMod.Iterinfo
import typings.rrule.distEsmSrcIterinfoMonthinfoMod.MonthInfo
import typings.rrule.distEsmSrcIterinfoYearinfoMod.YearInfo
import typings.rrule.distEsmSrcTypesMod.Frequency
import typings.rrule.distEsmSrcTypesMod.Frequency.HOURLY
import typings.rrule.distEsmSrcTypesMod.Frequency.MINUTELY
import typings.rrule.distEsmSrcTypesMod.Frequency.SECONDLY
import typings.rrule.distEsmSrcTypesMod.ParsedOptions
import typings.rrule.rruleNumbers.`365`
import typings.rrule.rruleNumbers.`366`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterinfo", JSImport.Namespace)
@js.native
object distEsmSrcIterinfoMod extends js.Object {
  @js.native
  trait Iterinfo extends js.Object {
    var eastermask: js.Array[Double] | Null = js.native
    val lastmonth: Double | Null = js.native
    val lastyear: Double | Null = js.native
    val mdaymask: js.Array[Double] = js.native
    val mmask: js.Array[Double] = js.native
    var monthinfo: MonthInfo = js.native
    val mrange: js.Array[Double] = js.native
    val nextyearlen: `366` | `365` = js.native
    val nmdaymask: js.Array[Double] = js.native
    val nwdaymask: js.Array[Double] = js.native
    var options: js.Any = js.native
    val wdaymask: js.Array[Double] = js.native
    val wnomask: js.Array[Double] | Null = js.native
    var yearinfo: YearInfo = js.native
    val yearlen: `366` | `365` = js.native
    val yearordinal: Double = js.native
    def ddayset(year: Double, month: Double, day: Double): js.Array[Double | (js.Array[Double | Null])] = js.native
    def getdayset(freq: Frequency): js.Function3[/* y */ Double, /* m */ Double, /* d */ Double, DaySet] = js.native
    def gettimeset(freq: HOURLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: MINUTELY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def gettimeset(freq: SECONDLY): js.Function4[/* h */ Double, /* m */ Double, /* s */ Double, /* ms */ Double, js.Array[Time]] = js.native
    def htimeset(hour: Double, `_`: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    def mdayset(`_`: js.Any, month: Double, __ : js.Any): js.Array[Double | (js.Array[Double | (js.Array[Double | Null]) | Null])] = js.native
    def mtimeset(hour: Double, minute: Double, `_`: Double, millisecond: Double): js.Array[Time] = js.native
    def rebuild(year: Double, month: Double): Unit = js.native
    def stimeset(hour: Double, minute: Double, second: Double, millisecond: Double): js.Array[Time] = js.native
    def wdayset(year: Double, month: Double, day: Double): js.Array[Double | (js.Array[Double | (js.Array[Double | Null]) | Null])] = js.native
    def ydayset(): js.Array[Double | js.Array[Double]] = js.native
  }
  
  @js.native
  class default protected () extends Iterinfo {
    def this(options: ParsedOptions) = this()
  }
  
  type DaySet = js.Tuple3[js.Array[Double | Null], Double, Double]
  type GetDayset = js.Function0[DaySet]
}

