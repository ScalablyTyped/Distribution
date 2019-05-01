package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Counter")
@js.native
class Counter protected () extends Metric {
  /**
  	 * @param configuration Configuration when creating a Counter metric. Name and Help is required.
  	 */
  def this(configuration: CounterConfiguration) = this()
  /**
  	 * @param name The name of the metric
  	 * @param help Help description
  	 * @param labels Label keys
  	 * @deprecated
  	 */
  def this(name: java.lang.String, help: java.lang.String) = this()
  def this(name: java.lang.String, help: java.lang.String, labels: js.Array[java.lang.String]) = this()
  /**
  	 * Increment with value
  	 * @param value The value to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(): scala.Unit = js.native
  /**
  	 * Increment for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The number to increment with
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
  	 * @return Configured counter with given labels
  	 */
  def labels(values: java.lang.String*): promDashClientLib.promDashClientMod.CounterNs.Internal = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: java.lang.String*): scala.Unit = js.native
  /**
  	 * Reset counter values
  	 */
  def reset(): scala.Unit = js.native
}

