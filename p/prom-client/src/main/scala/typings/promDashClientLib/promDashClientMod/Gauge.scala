package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Gauge")
@js.native
class Gauge protected () extends Metric {
  /**
  	 * @param configuration Configuration when creating a Gauge metric. Name and Help is mandatory
  	 */
  def this(configuration: GaugeConfiguration) = this()
  /**
  	 * @param name The name of the metric
  	 * @param help Help description
  	 * @param labels Label keys
  	 * @deprecated
  	 */
  def this(name: java.lang.String, help: java.lang.String) = this()
  def this(name: java.lang.String, help: java.lang.String, labels: js.Array[java.lang.String]) = this()
  /**
  	 * Decrement gauge
  	 * @param value The value to decrement with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def dec(): scala.Unit = js.native
  /**
  	 * Decrement gauge
  	 * @param labels Object with label keys and values
  	 * @param value Value to decrement with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def dec(labels: labelValues): scala.Unit = js.native
  def dec(labels: labelValues, value: scala.Double): scala.Unit = js.native
  def dec(labels: labelValues, value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def dec(labels: labelValues, value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  def dec(value: scala.Double): scala.Unit = js.native
  def dec(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def dec(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  	 * Increment gauge
  	 * @param value The value to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(): scala.Unit = js.native
  /**
  	 * Increment gauge for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(labels: labelValues): scala.Unit = js.native
  def inc(labels: labelValues, value: scala.Double): scala.Unit = js.native
  def inc(labels: labelValues, value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def inc(labels: labelValues, value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  def inc(value: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def inc(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured gauge with given labels
  	 */
  def labels(values: java.lang.String*): promDashClientLib.promDashClientMod.GaugeNs.Internal = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: java.lang.String*): scala.Unit = js.native
  /**
  	 * Reset gauge values
  	 */
  def reset(): scala.Unit = js.native
  /**
  	 * Set gauge value for labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to set
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def set(labels: labelValues, value: scala.Double): scala.Unit = js.native
  def set(labels: labelValues, value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def set(labels: labelValues, value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  	 * Set gauge value
  	 * @param value The value to set
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def set(value: scala.Double): scala.Unit = js.native
  def set(value: scala.Double, timestamp: scala.Double): scala.Unit = js.native
  def set(value: scala.Double, timestamp: stdLib.Date): scala.Unit = js.native
  /**
  	 * Set gauge value to current epoch time in ms
  	 * @param labels Object with label keys and values
  	 */
  def setToCurrentTime(): scala.Unit = js.native
  def setToCurrentTime(labels: labelValues): scala.Unit = js.native
  /**
  	 * Start a timer where the gauges value will be the duration in seconds
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], scala.Unit] = js.native
  def startTimer(labels: labelValues): js.Function1[/* labels */ js.UndefOr[labelValues], scala.Unit] = js.native
}

