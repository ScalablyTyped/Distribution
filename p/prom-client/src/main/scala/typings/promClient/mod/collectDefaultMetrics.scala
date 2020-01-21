package typings.promClient.mod

import typings.promClient.FnArguments
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "collectDefaultMetrics")
@js.native
object collectDefaultMetrics extends js.Object {
  def apply(): ReturnType[FnArguments] = js.native
  def apply(config: DefaultMetricsCollectorConfiguration): ReturnType[FnArguments] = js.native
  def apply(timeout: Double): Double = js.native
}

