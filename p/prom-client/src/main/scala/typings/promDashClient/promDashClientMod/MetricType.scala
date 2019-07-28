package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetricType extends js.Object

@JSImport("prom-client", "MetricType")
@js.native
object MetricType extends js.Object {
  @js.native
  sealed trait Counter extends MetricType
  
  @js.native
  sealed trait Gauge extends MetricType
  
  @js.native
  sealed trait Histogram extends MetricType
  
  @js.native
  sealed trait Summary extends MetricType
  
  /* 0 */ val Counter: typings.promDashClient.promDashClientMod.MetricType.Counter with Double = js.native
  /* 1 */ val Gauge: typings.promDashClient.promDashClientMod.MetricType.Gauge with Double = js.native
  /* 2 */ val Histogram: typings.promDashClient.promDashClientMod.MetricType.Histogram with Double = js.native
  /* 3 */ val Summary: typings.promDashClient.promDashClientMod.MetricType.Summary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetricType with Double] = js.native
}

