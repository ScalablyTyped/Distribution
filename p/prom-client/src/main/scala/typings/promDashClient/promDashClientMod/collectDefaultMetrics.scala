package typings.promDashClient.promDashClientMod

import typings.promDashClient.Fn_Arguments
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "collectDefaultMetrics")
@js.native
object collectDefaultMetrics extends js.Object {
  def apply(): ReturnType[Fn_Arguments] = js.native
  def apply(config: DefaultMetricsCollectorConfiguration): ReturnType[Fn_Arguments] = js.native
  def apply(timeout: Double): Double = js.native
}

