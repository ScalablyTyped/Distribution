package typings.promClient.mod

import typings.promClient.mod.Histogram.Internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Histogram")
@js.native
class Histogram_[T /* <: String */] protected () extends js.Object {
  /**
  	 * @param configuration Configuration when creating the Histogram. Name and Help is mandatory
  	 */
  def this(configuration: HistogramConfiguration[T]) = this()
  
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured histogram with given labels
  	 */
  def labels(values: String*): Internal[T] = js.native
  
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to observe
  	 */
  def observe(labels: LabelValues[T], value: Double): Unit = js.native
  /**
  	 * Observe value
  	 * @param value The value to observe
  	 */
  def observe(value: Double): Unit = js.native
  
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  
  /**
  	 * Reset histogram values
  	 */
  def reset(): Unit = js.native
  
  /**
  	 * Start a timer where the value in seconds will observed
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit] = js.native
  def startTimer(labels: LabelValues[T]): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit] = js.native
}
