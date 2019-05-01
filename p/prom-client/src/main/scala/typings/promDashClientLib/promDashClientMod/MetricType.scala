package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetricType extends js.Object

@JSImport("prom-client", "MetricType")
@js.native
object MetricType extends js.Object {
  @js.native
  sealed trait Counter
    extends promDashClientLib.promDashClientMod.MetricType
  
  @js.native
  sealed trait Gauge
    extends promDashClientLib.promDashClientMod.MetricType
  
  @js.native
  sealed trait Histogram
    extends promDashClientLib.promDashClientMod.MetricType
  
  @js.native
  sealed trait Summary
    extends promDashClientLib.promDashClientMod.MetricType
  
  val Counter: Counter with java.lang.String = js.native
  val Gauge: Gauge with java.lang.String = js.native
  val Histogram: Histogram with java.lang.String = js.native
  val Summary: Summary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[promDashClientLib.promDashClientMod.MetricType with java.lang.String] = js.native
}

