package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "Registry")
@js.native
class Registry () extends js.Object {
  /**
  	 * Gets the Content-Type of the metrics for use in the response headers.
  	 */
  var contentType: java.lang.String = js.native
  /**
  	 * Remove all metrics from the registry
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * Get all metrics as objects
  	 */
  def getMetricsAsArray(): js.Array[metric] = js.native
  /**
  	 * Get all metrics as objects
  	 */
  def getMetricsAsJSON(): js.Array[metric] = js.native
  /**
  	 * Get a single metric
  	 * @param name The name of the metric
  	 */
  def getSingleMetric(name: java.lang.String): Metric = js.native
  /**
  	 * Get a string representation of a single metric by name
  	 * @param name The name of the metric
  	 */
  def getSingleMetricAsString(name: java.lang.String): java.lang.String = js.native
  /**
  	 * Get string representation for all metrics
  	 */
  def metrics(): java.lang.String = js.native
  def metrics(opts: MetricsOpts): java.lang.String = js.native
  /**
  	 * Register metric to register
  	 * @param metric Metric to add to register
  	 */
  def registerMetric(metric: Metric): scala.Unit = js.native
  /**
  	 * Remove a single metric
  	 * @param name The name of the metric to remove
  	 */
  def removeSingleMetric(name: java.lang.String): scala.Unit = js.native
  /**
  	 * Reset all metrics in the registry
  	 */
  def resetMetrics(): scala.Unit = js.native
  /**
  	 * Set static labels to every metric emitted by this registry
  	 * @param labels of name/value pairs:
  	 * { defaultLabel: "value", anotherLabel: "value 2" }
  	 */
  def setDefaultLabels(labels: js.Object): scala.Unit = js.native
}

/* static members */
@JSImport("prom-client", "Registry")
@js.native
object Registry extends js.Object {
  /**
  	 * Merge registers
  	 * @param registers The registers you want to merge together
  	 */
  def merge(registers: js.Array[promDashClientLib.promDashClientMod.Registry]): promDashClientLib.promDashClientMod.Registry = js.native
}

