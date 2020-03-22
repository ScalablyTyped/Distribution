package typings.sinonjsFakeTimers.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sinonjs/fake-timers", "createClock")
@js.native
object createClock extends js.Object {
  def apply(): Clock = js.native
  def apply(now: Double): Clock = js.native
  def apply(now: Double, loopLimit: Double): Clock = js.native
  def apply(now: Date): Clock = js.native
  def apply(now: Date, loopLimit: Double): Clock = js.native
}

