package typings
package promDashClientLib.promDashClientMod.CounterNs

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
  def inc(): scala.Unit = js.native
  def inc(value: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
}

