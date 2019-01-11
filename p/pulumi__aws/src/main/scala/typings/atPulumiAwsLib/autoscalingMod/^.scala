package typings
package atPulumiAwsLib.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GroupDesiredCapacityMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupInServiceInstancesMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupMaxSizeMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupMinSizeMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupPendingInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupStandbyInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupTerminatingInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupTotalInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var InstanceLaunchErrorNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceLaunchNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceTerminateErrorNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceTerminateNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var OneMinuteMetricsGranularity: atPulumiAwsLib.autoscalingMetricsMod.MetricsGranularity = js.native
  var TestNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  def getGroup(args: atPulumiAwsLib.autoscalingGetGroupMod.GetGroupArgs): js.Promise[atPulumiAwsLib.autoscalingGetGroupMod.GetGroupResult] = js.native
  def getGroup(
    args: atPulumiAwsLib.autoscalingGetGroupMod.GetGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.autoscalingGetGroupMod.GetGroupResult] = js.native
}

