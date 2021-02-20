package typings.promClient.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def clusterMetrics(): js.Promise[String] = js.native
  def clusterMetrics(cb: js.Function2[/* err */ Error | Null, /* metrics */ js.UndefOr[String], _]): js.Promise[String] = js.native
}
/* static members */
object AggregatorRegistry {
  
  /**
  	 * Creates a new Registry instance from an array of metrics that were
  	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
  	 * the method specified by their `aggregator` property, or by summation if
  	 * `aggregator` is undefined.
  	 * @param {Array} metricsArr Array of metrics, each of which created by
  	 *   `registry.getMetricsAsJSON()`.
  	 * @return {Registry} aggregated registry.
  	 */
  @JSImport("prom-client", "AggregatorRegistry.aggregate")
  @js.native
  def aggregate(metricsArr: js.Array[js.Object]): Registry = js.native
  
  /**
  	 * Sets the registry or registries to be aggregated. Call from workers to
  	 * use a registry/registries other than the default global registry.
  	 * @param {Array<Registry>|Registry} regs Registry or registries to be
  	 *   aggregated.
  	 * @return {void}
  	 */
  @JSImport("prom-client", "AggregatorRegistry.setRegistries")
  @js.native
  def setRegistries(regs: js.Array[Registry]): Unit = js.native
  @JSImport("prom-client", "AggregatorRegistry.setRegistries")
  @js.native
  def setRegistries(regs: Registry): Unit = js.native
}
