package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val register: Registry = js.native
  def collectDefaultMetrics(): scala.Double = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): scala.Double = js.native
  def collectDefaultMetrics(timeout: scala.Double): scala.Double = js.native
  def exponentialBuckets(start: scala.Double, factor: scala.Double, count: scala.Double): js.Array[scala.Double] = js.native
  def linearBuckets(start: scala.Double, width: scala.Double, count: scala.Double): js.Array[scala.Double] = js.native
}

