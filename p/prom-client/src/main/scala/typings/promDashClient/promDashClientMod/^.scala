package typings.promDashClient.promDashClientMod

import typings.promDashClient.Fn_Arguments
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}

