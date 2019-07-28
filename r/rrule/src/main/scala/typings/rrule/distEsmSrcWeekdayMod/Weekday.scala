package typings.rrule.distEsmSrcWeekdayMod

import typings.rrule.distEsmSrcTypesMod._ByWeekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/weekday", "Weekday")
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

