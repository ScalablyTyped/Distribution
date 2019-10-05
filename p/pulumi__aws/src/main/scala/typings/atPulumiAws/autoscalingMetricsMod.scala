package typings.atPulumiAws

import typings.atPulumiAws.atPulumiAwsStrings.`1Minute`
import typings.atPulumiAws.autoscalingMetricsMod.Metric
import typings.atPulumiAws.autoscalingMetricsMod.MetricsGranularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/metrics", JSImport.Namespace)
@js.native
object autoscalingMetricsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.GroupMinSize
    - typings.atPulumiAws.atPulumiAwsStrings.GroupMaxSize
    - typings.atPulumiAws.atPulumiAwsStrings.GroupDesiredCapacity
    - typings.atPulumiAws.atPulumiAwsStrings.GroupInServiceInstances
    - typings.atPulumiAws.atPulumiAwsStrings.GroupPendingInstances
    - typings.atPulumiAws.atPulumiAwsStrings.GroupStandbyInstances
    - typings.atPulumiAws.atPulumiAwsStrings.GroupTerminatingInstances
    - typings.atPulumiAws.atPulumiAwsStrings.GroupTotalInstances
  */
  trait Metric extends js.Object
  
  var GroupDesiredCapacityMetric: Metric = js.native
  var GroupInServiceInstancesMetric: Metric = js.native
  var GroupMaxSizeMetric: Metric = js.native
  var GroupMinSizeMetric: Metric = js.native
  var GroupPendingInstances: Metric = js.native
  var GroupStandbyInstances: Metric = js.native
  var GroupTerminatingInstances: Metric = js.native
  var GroupTotalInstances: Metric = js.native
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
  type MetricsGranularity = `1Minute`
}

