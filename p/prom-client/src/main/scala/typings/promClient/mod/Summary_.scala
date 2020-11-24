package typings.promClient.mod

import typings.promClient.mod.Summary.Internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Summary")
@js.native
class Summary_[T /* <: String */] protected () extends js.Object {
  /**
  	 * @param configuration Configuration when creating Summary metric. Name and Help is mandatory
  	 */
  def this(configuration: SummaryConfiguration[T]) = this()
  
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured summary with given labels
  	 */
  def labels(values: String*): Internal[T] = js.native
  
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value Value to observe
  	 */
  def observe(labels: LabelValues[T], value: Double): Unit = js.native
  /**
  	 * Observe value in summary
  	 * @param value The value to observe
  	 */
  def observe(value: Double): Unit = js.native
  
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: String*): Unit = js.native
  
  /**
  	 * Reset all values in the summary
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
