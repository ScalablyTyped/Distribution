package typings.rrule

import typings.rrule.distEsmSrcTypesMod._ByWeekday
import typings.rrule.distEsmSrcWeekdayMod.Weekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/weekday", JSImport.Namespace)
@js.native
object distEsmSrcWeekdayMod extends js.Object {
  @js.native
  class Weekday protected () extends _ByWeekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
    val n: js.UndefOr[Double] = js.native
    val weekday: Double = js.native
    def equals(other: Weekday): Boolean = js.native
    def getJsWeekday(): Double = js.native
    def nth(n: Double): Weekday = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrule.rruleStrings.MO
    - typings.rrule.rruleStrings.TU
    - typings.rrule.rruleStrings.WE
    - typings.rrule.rruleStrings.TH
    - typings.rrule.rruleStrings.FR
    - typings.rrule.rruleStrings.SA
    - typings.rrule.rruleStrings.SU
  */
  trait WeekdayStr extends _ByWeekday
  
}

