package typings.promClient.mod

import typings.promClient.mod.Gauge.Internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Gauge")
@js.native
open class Gauge[T /* <: String */] protected ()
  extends StObject
     with Metric_[T] {
  /**
  	 * @param configuration Configuration when creating a Gauge metric. Name and Help is mandatory
  	 */
  def this(configuration: GaugeConfiguration[T]) = this()
  
  /**
  	 * Decrement gauge
  	 * @param value The value to decrement with
  	 */
  def dec(): Unit = js.native
  /**
  	 * Decrement gauge
  	 * @param labels Object with label keys and values
  	 * @param value Value to decrement with
  	 */
  def dec(labels: LabelValues[T]): Unit = js.native
  def dec(labels: LabelValues[T], value: Double): Unit = js.native
  def dec(value: Double): Unit = js.native
  
  /**
  	 * Increment gauge
  	 * @param value The value to increment with
  	 */
  def inc(): Unit = js.native
  /**
  	 * Increment gauge for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to increment with
  	 */
  def inc(labels: LabelValues[T]): Unit = js.native
  def inc(labels: LabelValues[T], value: Double): Unit = js.native
  def inc(value: Double): Unit = js.native
  
  /**
  	 * Return the child for given labels
  	 * @param labels Object with label keys and values
  	 * @return Configured counter with given labels
  	 */
  def labels(labels: LabelValues[T]): Internal[T] = js.native
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured gauge with given labels
  	 */
  def labels(values: String*): Internal[T] = js.native
  
  /**
  	 * Remove metrics for the given label values
  	 * @param labels Object with label keys and values
  	 */
  def remove(labels: LabelValues[T]): Unit = js.native
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
  	 */
  def set(labels: LabelValues[T], value: Double): Unit = js.native
  /**
  	 * Set gauge value
  	 * @param value The value to set
  	 */
  def set(value: Double): Unit = js.native
  
  /**
  	 * Set gauge value to current epoch time in ms
  	 * @param labels Object with label keys and values
  	 */
  def setToCurrentTime(): Unit = js.native
  def setToCurrentTime(labels: LabelValues[T]): Unit = js.native
  
  /**
  	 * Start a timer. Calling the returned function will set the gauge's value
  	 * to the observed duration in seconds.
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped. The value it
  	 * returns is the timed duration.
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Double] = js.native
  def startTimer(labels: LabelValues[T]): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Double] = js.native
}
object Gauge {
  
  @js.native
  trait Internal[T /* <: String */] extends StObject {
    
    /**
    		 * Decrement with value
    		 * @param value The value to decrement with
    		 */
    def dec(): Unit = js.native
    def dec(value: Double): Unit = js.native
    
    /**
    		 * Increment gauge with value
    		 * @param value The value to increment with
    		 */
    def inc(): Unit = js.native
    def inc(value: Double): Unit = js.native
    
    /**
    		 * Set gauges value
    		 * @param value The value to set
    		 */
    def set(value: Double): Unit = js.native
    
    /**
    		 * Set gauge value to current epoch time in ms
    		 */
    def setToCurrentTime(): Unit = js.native
    
    /**
    		 * Start a timer. Calling the returned function will set the gauge's value
    		 * to the observed duration in seconds.
    		 * @return Function to invoke when timer should be stopped. The value it
    		 * returns is the timed duration.
    		 */
    def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Double] = js.native
  }
}
