package typings.pulumiAws

import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/autoscaling/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  
  var GroupDesiredCapacityMetric: Metric = js.native
  
  var GroupInServiceInstancesMetric: Metric = js.native
  
  var GroupMaxSizeMetric: Metric = js.native
  
  var GroupMinSizeMetric: Metric = js.native
  
  var GroupPendingInstances: Metric = js.native
  
  var GroupStandbyInstances: Metric = js.native
  
  var GroupTerminatingInstances: Metric = js.native
  
  var GroupTotalInstances: Metric = js.native
  
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
}
