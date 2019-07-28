package typings.promDashClient.promDashClientMod.CounterNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Internal extends js.Object {
  /**
  		 * Increment with value
  		 * @param value The value to increment with
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def inc(): Unit = js.native
  def inc(value: Double): Unit = js.native
  def inc(value: Double, timestamp: Double): Unit = js.native
  def inc(value: Double, timestamp: Date): Unit = js.native
}

