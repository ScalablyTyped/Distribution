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
  
  /* 0 */ val Counter: Counter with scala.Double = js.native
  /* 1 */ val Gauge: Gauge with scala.Double = js.native
  /* 2 */ val Histogram: Histogram with scala.Double = js.native
  /* 3 */ val Summary: Summary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[promDashClientLib.promDashClientMod.MetricType with scala.Double] = js.native
}

