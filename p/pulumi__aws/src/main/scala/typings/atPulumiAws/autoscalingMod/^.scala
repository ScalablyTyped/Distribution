package typings.atPulumiAws.autoscalingMod

import typings.atPulumiAws.autoscalingGetGroupMod.GetGroupArgs
import typings.atPulumiAws.autoscalingGetGroupMod.GetGroupResult
import typings.atPulumiAws.autoscalingMetricsMod.Metric
import typings.atPulumiAws.autoscalingMetricsMod.MetricsGranularity
import typings.atPulumiAws.autoscalingNotificationTypeMod.NotificationType
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GroupDesiredCapacityMetric: Metric = js.native
  var GroupInServiceInstancesMetric: Metric = js.native
  var GroupMaxSizeMetric: Metric = js.native
  var GroupMinSizeMetric: Metric = js.native
  var GroupPendingInstances: Metric = js.native
  var GroupStandbyInstances: Metric = js.native
  var GroupTerminatingInstances: Metric = js.native
  var GroupTotalInstances: Metric = js.native
  var InstanceLaunchErrorNotification: NotificationType = js.native
  var InstanceLaunchNotification: NotificationType = js.native
  var InstanceTerminateErrorNotification: NotificationType = js.native
  var InstanceTerminateNotification: NotificationType = js.native
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
  var TestNotification: NotificationType = js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] with GetGroupResult = js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] with GetGroupResult = js.native
}

