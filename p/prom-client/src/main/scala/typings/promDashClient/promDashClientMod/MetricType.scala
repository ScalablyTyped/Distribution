package typings.promDashClient.promDashClientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetricType with Double] = js.native
  /* 0 */ @js.native
  object Counter
    extends TopLevel[typings.promDashClient.promDashClientMod.MetricType.Counter with Double]
  
  /* 1 */ @js.native
  object Gauge
    extends TopLevel[typings.promDashClient.promDashClientMod.MetricType.Gauge with Double]
  
  /* 2 */ @js.native
  object Histogram
    extends TopLevel[typings.promDashClient.promDashClientMod.MetricType.Histogram with Double]
  
  /* 3 */ @js.native
  object Summary
    extends TopLevel[typings.promDashClient.promDashClientMod.MetricType.Summary with Double]
  
}

