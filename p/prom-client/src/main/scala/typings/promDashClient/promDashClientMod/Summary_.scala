package typings.promDashClient.promDashClientMod

import typings.promDashClient.promDashClientMod.Summary.Config
import typings.promDashClient.promDashClientMod.Summary.Internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Summary")
@js.native
class Summary_ protected () extends js.Object {
  /**
  	 * @param configuration Configuration when creating Summary metric. Name and Help is mandatory
  	 */
  def this(configuration: SummaryConfiguration) = this()
  /**
  	 * @param name The name of the metric
  	 * @param help Help description
  	 * @param labels Label keys
  	 * @param config Configuration object
  	 */
  def this(name: String, help: String) = this()
  /**
  	 * @param name The name of the metric
  	 * @param help Help description
  	 * @param config Configuration object
  	 * @deprecated
  	 */
  def this(name: String, help: String, config: Config) = this()
  def this(name: String, help: String, labels: js.Array[String]) = this()
  def this(name: String, help: String, labels: js.Array[String], config: Config) = this()
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured summary with given labels
  	 */
  def labels(values: String*): Internal = js.native
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value Value to observe
  	 */
  def observe(labels: labelValues, value: Double): Unit = js.native
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
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
  def startTimer(labels: labelValues): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
}

