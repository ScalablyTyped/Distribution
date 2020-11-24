package typings.promClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetricType extends js.Object
@JSImport("prom-client", "MetricType")
@js.native
object MetricType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetricType with Double] = js.native
  
  @js.native
  sealed trait Counter extends MetricType
  /* 0 */ @js.native
  object Counter
    extends TopLevel[typings.promClient.mod.MetricType.Counter with Double]
  
  @js.native
  sealed trait Gauge extends MetricType
  /* 1 */ @js.native
  object Gauge
    extends TopLevel[typings.promClient.mod.MetricType.Gauge with Double]
  
  @js.native
  sealed trait Histogram extends MetricType
  /* 2 */ @js.native
  object Histogram
    extends TopLevel[typings.promClient.mod.MetricType.Histogram with Double]
  
  @js.native
  sealed trait Summary extends MetricType
  /* 3 */ @js.native
  object Summary
    extends TopLevel[typings.promClient.mod.MetricType.Summary with Double]
}
