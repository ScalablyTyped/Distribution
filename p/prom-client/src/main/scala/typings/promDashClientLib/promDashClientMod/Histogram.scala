package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Histogram")
@js.native
class Histogram protected () extends Metric {
  /**
  	 * @param configuration Configuration when creating the Histogram. Name and Help is mandatory
  	 */
  def this(configuration: HistogramConfiguration) = this()
  /**
  	 * @param name The name of metric
  	 * @param help Help description
  	 * @param labels Label keys
  	 * @param config Configuration object for Histograms
  	 */
  def this(name: java.lang.String, help: java.lang.String) = this()
  /**
  	 * @param name The name of metric
  	 * @param help Help description
  	 * @param config Configuration object for Histograms
  	 * @deprecated
  	 */
  def this(name: java.lang.String, help: java.lang.String, config: promDashClientLib.promDashClientMod.HistogramNs.Config) = this()
  def this(name: java.lang.String, help: java.lang.String, labels: js.Array[java.lang.String]) = this()
  def this(name: java.lang.String, help: java.lang.String, labels: js.Array[java.lang.String], config: promDashClientLib.promDashClientMod.HistogramNs.Config) = this()
  /**
  	 * Return the child for given labels
  	 * @param values Label values
  	 * @return Configured histogram with given labels
  	 */
  def labels(values: java.lang.String*): promDashClientLib.promDashClientMod.HistogramNs.Internal = js.native
  /**
  	 * Observe value for given labels
  	 * @param labels Object with label keys and values
  	 * @param value The value to observe
  	 */
  def observe(labels: labelValues, value: scala.Double): scala.Unit = js.native
  /**
  	 * Observe value
  	 * @param value The value to observe
  	 */
  def observe(value: scala.Double): scala.Unit = js.native
  /**
  	 * Remove metrics for the given label values
  	 * @param values Label values
  	 */
  def remove(values: java.lang.String*): scala.Unit = js.native
  /**
  	 * Reset histogram values
  	 */
  def reset(): scala.Unit = js.native
  /**
  	 * Start a timer where the value in seconds will observed
  	 * @param labels Object with label keys and values
  	 * @return Function to invoke when timer should be stopped
  	 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], scala.Unit] = js.native
  def startTimer(labels: labelValues): js.Function1[/* labels */ js.UndefOr[labelValues], scala.Unit] = js.native
}

