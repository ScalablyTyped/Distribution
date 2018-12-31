package typings
package atPulumiAwsLib.autoscalingGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/group", "Group")
@js.native
class Group protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Group resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GroupArgs) = this()
  def this(name: java.lang.String, args: GroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN for this AutoScaling Group
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of one or more availability zones for the group. This parameter should not be specified when using `vpc_zone_identifier`.
    */
  val availabilityZones: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * A list of metrics to collect. The allowed values are `GroupMinSize`, `GroupMaxSize`, `GroupDesiredCapacity`, `GroupInServiceInstances`, `GroupPendingInstances`, `GroupStandbyInstances`, `GroupTerminatingInstances`, `GroupTotalInstances`.
    * * `wait_for_capacity_timeout` (Default: "10m") A maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that Terraform should
    * wait for ASG instances to be healthy before timing out.  (See also Waiting
    * for Capacity below.) Setting this to "0" causes
    * Terraform to skip all Capacity Waiting behavior.
    */
  val enabledMetrics: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.autoscalingMetricsMod.Metric]]] = js.native
  /**
    * Allows deleting the autoscaling group without waiting
    * for all instances in the pool to terminate.  You can force an autoscaling group to delete
    * even if it's in the process of scaling a resource. Normally, Terraform
    * drains all the instances before deleting the group.  This bypasses that
    * behavior and potentially leaves resources dangling.
    */
  val forceDelete: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * [`aws_autoscaling_lifecycle_hook`](https://www.terraform.io/docs/providers/aws/r/autoscaling_lifecycle_hooks.html)
    * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws_autoscaling_lifecycle_hook` resource.
    */
  val initialLifecycleHooks: atPulumiPulumiLib.pulumiMod.Output[
    js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameHeartbeatTimeoutNotificationMetadata]]
  ] = js.native
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Nested argument with Launch template specification to use to launch instances. Defined below.
    */
  val launchTemplate: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_NameIdVersion]] = js.native
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
    */
  val loadBalancers: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Setting this causes Terraform to wait for
    * this number of instances to show up healthy in the ELB only on creation.
    * Updates will not wait on ELB instance number changes.
    * (See also Waiting for Capacity below.)
    */
  val minElbCapacity: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_InstancesDistributionLaunchTemplate]] = js.native
  /**
    * The name of the auto scaling group. By default generated by Terraform.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for terminination
    * during scale in events.
    */
  val protectFromScaleIn: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * A list of tag blocks. Tags documented below.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeyPropagateAtLaunchValue]]] = js.native
  /**
    * A list of tag blocks (maps). Tags documented below.
    */
  val tagsCollection: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[_]]]] = js.native
  /**
    * A list of `aws_alb_target_group` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `Default`.
    */
  val terminationPolicies: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * A list of subnet IDs to launch resources in.
    */
  val vpcZoneIdentifiers: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  val waitForCapacityTimeout: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Setting this will cause Terraform to wait
    * for exactly this number of healthy instances in all attached load balancers
    * on both create and update operations. (Takes precedence over
    * `min_elb_capacity` behavior.)
    * (See also Waiting for Capacity below.)
    */
  val waitForElbCapacity: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
}

@JSImport("@pulumi/aws/autoscaling/group", "Group")
@js.native
object Group extends js.Object {
  /**
    * Get an existing Group resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingGroupMod.GroupState
  ): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingGroupMod.GroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
}

