package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "AggregatorRegistry")
@js.native
class AggregatorRegistry () extends Registry {
  /**
  	 * Gets aggregated metrics for all workers. The optional callback and
  	 * returned Promise resolve with the same value; either may be used.
  	 * @param {Function?} cb (err, metrics) => any
  	 * @return {Promise<string>} Promise that resolves with the aggregated
  	 *   metrics.
  	 */
  def clusterMetrics(): js.Promise[java.lang.String] = js.native
  def clusterMetrics(
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* metrics */ js.UndefOr[java.lang.String], _]
  ): js.Promise[java.lang.String] = js.native
}

/* static members */
@JSImport("prom-client", "AggregatorRegistry")
@js.native
object AggregatorRegistry extends js.Object {
  /**
  	 * Creates a new Registry instance from an array of metrics that were
  	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
  	 * the method specified by their `aggregator` property, or by summation if
  	 * `aggregator` is undefined.
  	 * @param {Array} metricsArr Array of metrics, each of which created by
  	 *   `registry.getMetricsAsJSON()`.
  	 * @return {Registry} aggregated registry.
  	 */
  def aggregate(metricsArr: js.Array[js.Object]): promDashClientLib.promDashClientMod.Registry = js.native
  /**
  	 * Sets the registry or registries to be aggregated. Call from workers to
  	 * use a registry/registries other than the default global registry.
  	 * @param {Array<Registry>|Registry} regs Registry or registries to be
  	 *   aggregated.
  	 * @return {void}
  	 */
  def setRegistries(regs: js.Array[promDashClientLib.promDashClientMod.Registry]): scala.Unit = js.native
  def setRegistries(regs: promDashClientLib.promDashClientMod.Registry): scala.Unit = js.native
}

