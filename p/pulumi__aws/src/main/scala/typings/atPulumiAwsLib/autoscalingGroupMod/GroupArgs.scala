package typings
package atPulumiAwsLib.autoscalingGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupArgs extends js.Object {
  /**
    * A list of one or more availability zones for the group. This parameter should not be specified when using `vpc_zone_identifier`.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val enabledMetrics: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingMetricsMod.Metric]]
    ]
  ] = js.undefined
  val forceDelete: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * [`aws_autoscaling_lifecycle_hook`](https://www.terraform.io/docs/providers/aws/r/autoscaling_lifecycle_hooks.html)
    * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws_autoscaling_lifecycle_hook` resource.
    */
  val initialLifecycleHooks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultResultHeartbeatTimeout]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration]
  ] = js.undefined
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types. Defined below.
    */
  val launchTemplate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdName]] = js.undefined
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
    */
  val loadBalancers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.autoscalingMetricsMod.MetricsGranularity]
  ] = js.undefined
  val minElbCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InstancesDistributionLaunchTemplate]
  ] = js.undefined
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup]
  ] = js.undefined
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for terminination
    * during scale in events.
    */
  val protectFromScaleIn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of tag blocks. Tags documented below.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyPropagateAtLaunch]]
    ]
  ] = js.undefined
  /**
    * A list of tag blocks (maps). Tags documented below.
    */
  val tagsCollection: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]]
    ]
  ] = js.undefined
  /**
    * A list of `aws_alb_target_group` ARNs, for use with Application or Network Load Balancing.
    */
  val targetGroupArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
    */
  val terminationPolicies: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of subnet IDs to launch resources in.
    */
  val vpcZoneIdentifiers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  val waitForCapacityTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val waitForElbCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object GroupArgs {
  @scala.inline
  def apply(
    maxSize: atPulumiPulumiLib.outputMod.Input[scala.Double],
    minSize: atPulumiPulumiLib.outputMod.Input[scala.Double],
    availabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    defaultCooldown: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    desiredCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    enabledMetrics: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingMetricsMod.Metric]]
    ] = null,
    forceDelete: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    healthCheckGracePeriod: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    healthCheckType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    initialLifecycleHooks: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultResultHeartbeatTimeout]
      ]
    ] = null,
    launchConfiguration: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration] = null,
    launchTemplate: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdName] = null,
    loadBalancers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    metricsGranularity: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.autoscalingMetricsMod.MetricsGranularity] = null,
    minElbCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    mixedInstancesPolicy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InstancesDistributionLaunchTemplate] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    placementGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.ec2PlacementGroupMod.PlacementGroup] = null,
    protectFromScaleIn: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    serviceLinkedRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    suspendedProcesses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyPropagateAtLaunch]]
    ] = null,
    tagsCollection: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]]
    ] = null,
    targetGroupArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    terminationPolicies: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    vpcZoneIdentifiers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    waitForCapacityTimeout: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    waitForElbCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): GroupArgs = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (defaultCooldown != null) __obj.updateDynamic("defaultCooldown")(defaultCooldown.asInstanceOf[js.Any])
    if (desiredCapacity != null) __obj.updateDynamic("desiredCapacity")(desiredCapacity.asInstanceOf[js.Any])
    if (enabledMetrics != null) __obj.updateDynamic("enabledMetrics")(enabledMetrics.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (healthCheckGracePeriod != null) __obj.updateDynamic("healthCheckGracePeriod")(healthCheckGracePeriod.asInstanceOf[js.Any])
    if (healthCheckType != null) __obj.updateDynamic("healthCheckType")(healthCheckType.asInstanceOf[js.Any])
    if (initialLifecycleHooks != null) __obj.updateDynamic("initialLifecycleHooks")(initialLifecycleHooks.asInstanceOf[js.Any])
    if (launchConfiguration != null) __obj.updateDynamic("launchConfiguration")(launchConfiguration.asInstanceOf[js.Any])
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (metricsGranularity != null) __obj.updateDynamic("metricsGranularity")(metricsGranularity.asInstanceOf[js.Any])
    if (minElbCapacity != null) __obj.updateDynamic("minElbCapacity")(minElbCapacity.asInstanceOf[js.Any])
    if (mixedInstancesPolicy != null) __obj.updateDynamic("mixedInstancesPolicy")(mixedInstancesPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup.asInstanceOf[js.Any])
    if (protectFromScaleIn != null) __obj.updateDynamic("protectFromScaleIn")(protectFromScaleIn.asInstanceOf[js.Any])
    if (serviceLinkedRoleArn != null) __obj.updateDynamic("serviceLinkedRoleArn")(serviceLinkedRoleArn.asInstanceOf[js.Any])
    if (suspendedProcesses != null) __obj.updateDynamic("suspendedProcesses")(suspendedProcesses.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tagsCollection != null) __obj.updateDynamic("tagsCollection")(tagsCollection.asInstanceOf[js.Any])
    if (targetGroupArns != null) __obj.updateDynamic("targetGroupArns")(targetGroupArns.asInstanceOf[js.Any])
    if (terminationPolicies != null) __obj.updateDynamic("terminationPolicies")(terminationPolicies.asInstanceOf[js.Any])
    if (vpcZoneIdentifiers != null) __obj.updateDynamic("vpcZoneIdentifiers")(vpcZoneIdentifiers.asInstanceOf[js.Any])
    if (waitForCapacityTimeout != null) __obj.updateDynamic("waitForCapacityTimeout")(waitForCapacityTimeout.asInstanceOf[js.Any])
    if (waitForElbCapacity != null) __obj.updateDynamic("waitForElbCapacity")(waitForElbCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupArgs]
  }
}

