package typings.promClient.mod

import typings.promClient.mod.Counter.Internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Counter")
@js.native
open class Counter[T /* <: String */] protected ()
  extends StObject
     with Metric_[T] {
  /**
  	 * @param configuration Configuration when creating a Counter metric. Name and Help is required.
  	 */
  def this(configuration: CounterConfiguration[T]) = this()
  
  /**
  	 * Increment with value
  	 * @param value The value to increment with
  	 */
  def inc(): Unit = js.native
  /**
  	 * Increment for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The number to increment with
  	 */
  def inc(labels: LabelValues[T]): Unit = js.native
  def inc(labels: LabelValues[T], value: Double): Unit = js.native
  def inc(value: Double): Unit = js.native
  
  /**
  	 * Return the child for given labels
  	 * @param labels Object with label keys and values
  	 * @return Configured counter with given labels
  	 */
  def labels(labels: LabelValues[T]): Internal = js.native
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured counter with given labels
  	 */
  def labels(values: String*): Internal = js.native
  
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
  	 * Reset counter values
  	 */
  def reset(): Unit = js.native
}
object Counter {
  
  @js.native
  trait Internal extends StObject {
    
    /**
    		 * Increment with value
    		 * @param value The value to increment with
    		 */
    def inc(): Unit = js.native
    def inc(value: Double): Unit = js.native
  }
}
