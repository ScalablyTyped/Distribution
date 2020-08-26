package typings.promClient.mod

import typings.promClient.mod.Gauge.Internal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Gauge")
@js.native
class Gauge protected () extends _Metric_ {
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
  def this(name: String, help: String) = this()
  def this(name: String, help: String, labels: js.Array[String]) = this()
  /**
  	 * Decrement gauge
  	 * @param value The value to decrement with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def dec(): Unit = js.native
  /**
  	 * Decrement gauge
  	 * @param labels Object with label keys and values
  	 * @param value Value to decrement with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def dec(labels: labelValues): Unit = js.native
  def dec(labels: labelValues, value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def dec(labels: labelValues, value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
  def dec(labels: labelValues, value: Double): Unit = js.native
  def dec(labels: labelValues, value: Double, timestamp: Double): Unit = js.native
  def dec(labels: labelValues, value: Double, timestamp: Date): Unit = js.native
  def dec(value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def dec(value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
  def dec(value: Double): Unit = js.native
  def dec(value: Double, timestamp: Double): Unit = js.native
  def dec(value: Double, timestamp: Date): Unit = js.native
  /**
  	 * Increment gauge
  	 * @param value The value to increment with
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def inc(): Unit = js.native
  /**
  	 * Increment gauge for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to increment with
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
  	 * @return Configured gauge with given labels
  	 */
  def labels(values: String*): Internal = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  /**
  	 * Reset gauge values
  	 */
  def reset(): Unit = js.native
  /**
  	 * Set gauge value for labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to set
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def set(labels: labelValues, value: Double): Unit = js.native
  def set(labels: labelValues, value: Double, timestamp: Double): Unit = js.native
  def set(labels: labelValues, value: Double, timestamp: Date): Unit = js.native
  /**
  	 * Set gauge value
  	 * @param value The value to set
  	 * @param timestamp Timestamp to associate the time series with
  	 */
  def set(value: Double): Unit = js.native
  def set(value: Double, timestamp: Double): Unit = js.native
  def set(value: Double, timestamp: Date): Unit = js.native
  /**
  	 * Set gauge value to current epoch time in ms
  	 * @param labels Object with label keys and values
  	 */
  def setToCurrentTime(): Unit = js.native
  def setToCurrentTime(labels: labelValues): Unit = js.native
  /**
  	 * Start a timer where the gauges value will be the duration in seconds
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
  def startTimer(labels: labelValues): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
}

@JSImport("prom-client", "Gauge")
@js.native
object Gauge extends js.Object {
  @js.native
  trait Internal extends js.Object {
    /**
    		 * Decrement with value
    		 * @param value The value to decrement with
    		 * @param timestamp Timestamp to associate the time series with
    		 */
    def dec(): Unit = js.native
    def dec(value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def dec(value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
    def dec(value: Double): Unit = js.native
    def dec(value: Double, timestamp: Double): Unit = js.native
    def dec(value: Double, timestamp: Date): Unit = js.native
    /**
    		 * Increment gauge with value
    		 * @param value The value to increment with
    		 * @param timestamp Timestamp to associate the time series with
    		 */
    def inc(): Unit = js.native
    def inc(value: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def inc(value: js.UndefOr[scala.Nothing], timestamp: Date): Unit = js.native
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
  
}

