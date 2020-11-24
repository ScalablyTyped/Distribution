package typings.rrule.weekdayMod

import typings.rrule.typesMod._ByWeekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/weekday", "Weekday")
@js.native
class Weekday protected () extends _ByWeekday {
  def this(weekday: Double) = this()
  def this(weekday: Double, n: Double) = this()
  
  def equals(other: Weekday): Boolean = js.native
  
  def getJsWeekday(): Double = js.native
  
  val n: js.UndefOr[Double] = js.native
  
  def nth(n: Double): Weekday = js.native
  
  val weekday: Double = js.native
}
/* static members */
@JSImport("rrule/dist/esm/src/weekday", "Weekday")
@js.native
object Weekday extends js.Object {
  
  def fromStr(str: WeekdayStr): Weekday = js.native
}
