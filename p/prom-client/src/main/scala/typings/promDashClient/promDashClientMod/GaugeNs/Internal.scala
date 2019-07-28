package typings.promDashClient.promDashClientMod.GaugeNs

import typings.promDashClient.promDashClientMod.labelValues
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Internal extends js.Object {
  /**
  		 * Decrement with value
  		 * @param value The value to decrement with
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def dec(): Unit = js.native
  def dec(value: Double): Unit = js.native
  def dec(value: Double, timestamp: Double): Unit = js.native
  def dec(value: Double, timestamp: Date): Unit = js.native
  /**
  		 * Increment gauge with value
  		 * @param value The value to increment with
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def inc(): Unit = js.native
  def inc(value: Double): Unit = js.native
  def inc(value: Double, timestamp: Double): Unit = js.native
  def inc(value: Double, timestamp: Date): Unit = js.native
  /**
  		 * Set gauges value
  		 * @param value The value to set
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def set(value: Double): Unit = js.native
  def set(value: Double, timestamp: Double): Unit = js.native
  def set(value: Double, timestamp: Date): Unit = js.native
  /**
  		 * Set gauge value to current epoch time in ms
  		 */
  def setToCurrentTime(): Unit = js.native
  /**
  		 * Start a timer where the gauges value will be the duration in seconds
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
}

