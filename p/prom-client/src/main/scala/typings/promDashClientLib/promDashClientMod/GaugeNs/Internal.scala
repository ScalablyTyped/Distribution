package typings
package promDashClientLib.promDashClientMod.GaugeNs

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
  def dec(): scala.Unit = js.native
  def dec(value: scala.Double): scala.Unit = js.native
  def dec(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def dec(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  		 * Increment gauge with value
  		 * @param value The value to increment with
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def inc(): scala.Unit = js.native
  def inc(value: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  		 * Set gauges value
  		 * @param value The value to set
  		 * @param timestamp Timestamp to associate the time series with
  		 */
  def set(value: scala.Double): scala.Unit = js.native
  def set(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def set(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  		 * Set gauge value to current epoch time in ms
  		 */
  def setToCurrentTime(): scala.Unit = js.native
  /**
  		 * Start a timer where the gauges value will be the duration in seconds
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[
    /* labels */ js.UndefOr[promDashClientLib.promDashClientMod.labelValues], 
    scala.Unit
  ] = js.native
}

