package typings.promClient.mod

import typings.promClient.mod.Counter.Internal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Counter")
@js.native
class Counter protected () extends _Metric_ {
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
  def this(name: String, help: String) = this()
  def this(name: String, help: String, labels: js.Array[String]) = this()
  /**
  	 * Increment with value
  	 * @param value The value to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(): Unit = js.native
  /**
  	 * Increment for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The number to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(labels: labelValues): Unit = js.native
  def inc(labels: labelValues, value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def inc(labels: labelValues, value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
  def inc(labels: labelValues, value: Double): Unit = js.native
  def inc(labels: labelValues, value: Double, timestamp: Double): Unit = js.native
  def inc(labels: labelValues, value: Double, timestamp: Date): Unit = js.native
  def inc(value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def inc(value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
  def inc(value: Double): Unit = js.native
  def inc(value: Double, timestamp: Double): Unit = js.native
  def inc(value: Double, timestamp: Date): Unit = js.native
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured counter with given labels
  	 */
  def labels(values: String*): Internal = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  /**
  	 * Reset counter values
  	 */
  def reset(): Unit = js.native
}

@JSImport("prom-client", "Counter")
@js.native
object Counter extends js.Object {
  @js.native
  trait Internal extends js.Object {
    /**
    		 * Increment with value
    		 * @param value The value to increment with
    		 * @param timestamp Timestamp to associate the time series with
    		 */
    def inc(): Unit = js.native
    def inc(value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def inc(value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
    def inc(value: Double): Unit = js.native
    def inc(value: Double, timestamp: Double): Unit = js.native
    def inc(value: Double, timestamp: Date): Unit = js.native
  }
  
}

