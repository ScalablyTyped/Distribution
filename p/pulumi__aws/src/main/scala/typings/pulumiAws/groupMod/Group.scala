package typings.pulumiAws.groupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.metricsMod.Metric
import typings.pulumiAws.outputMod.autoscaling.GroupInitialLifecycleHook
import typings.pulumiAws.outputMod.autoscaling.GroupLaunchTemplate
import typings.pulumiAws.outputMod.autoscaling.GroupMixedInstancesPolicy
import typings.pulumiAws.outputMod.autoscaling.GroupTag
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/group", "Group")
@js.native
class Group protected () extends CustomResource {
  /**
    * Create a Group resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupArgs) = this()
  def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN for this AutoScaling Group
    */
  val arn: Output_[String] = js.native
  /**
    * A list of one or more availability zones for the group. This parameter should not be specified when using `vpcZoneIdentifier`.
    */
  val availabilityZones: Output_[js.Array[String]] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: Output_[Double] = js.native
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: Output_[Double] = js.native
  /**
    * A list of metrics to collect. The allowed values are `GroupDesiredCapacity`, `GroupInServiceCapacity`, `GroupPendingCapacity`, `GroupMinSize`, `GroupMaxSize`, `GroupInServiceInstances`, `GroupPendingInstances`, `GroupStandbyInstances`, `GroupStandbyCapacity`, `GroupTerminatingCapacity`, `GroupTerminatingInstances`, `GroupTotalCapacity`, `GroupTotalInstances`.
    */
  val enabledMetrics: Output_[js.UndefOr[js.Array[Metric]]] = js.native
  /**
    * Allows deleting the autoscaling group without waiting
    * for all instances in the pool to terminate.  You can force an autoscaling group to delete
    * even if it's in the process of scaling a resource. Normally, this provider
    * drains all the instances before deleting the group.  This bypasses that
    * behavior and potentially leaves resources dangling.
    */
  val forceDelete: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: Output_[js.UndefOr[Double]] = js.native
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: Output_[String] = js.native
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * `aws.autoscaling.LifecycleHook`
    * resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
    */
  val initialLifecycleHooks: Output_[js.UndefOr[js.Array[GroupInitialLifecycleHook]]] = js.native
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: Output_[js.UndefOr[String]] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  val launchTemplate: Output_[js.UndefOr[GroupLaunchTemplate]] = js.native
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `targetGroupArns` instead.
    */
  val loadBalancers: Output_[js.Array[String]] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 604800 and 31536000 seconds.
    */
  val maxInstanceLifetime: Output_[js.UndefOr[Double]] = js.native
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: Output_[Double] = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: Output_[js.UndefOr[String]] = js.native
  /**
    * Setting this causes this provider to wait for
    * this number of instances from this autoscaling group to show up healthy in the
    * ELB only on creation. Updates will not wait on ELB instance number changes.
    * (See also Waiting for Capacity below.)
    */
  val minElbCapacity: Output_[js.UndefOr[Double]] = js.native
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: Output_[Double] = js.native
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: Output_[js.UndefOr[GroupMixedInstancesPolicy]] = js.native
  /**
    * The name of the auto scaling group. By default generated by this provider.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: Output_[js.UndefOr[String]] = js.native
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for termination
    * during scale in events.
    */
  val protectFromScaleIn: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: Output_[String] = js.native
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Configuration block(s) containing resource tags. Conflicts with `tags`. Documented below.
    */
  val tags: Output_[js.UndefOr[js.Array[GroupTag]]] = js.native
  /**
    * Set of maps containing resource tags. Conflicts with `tag`. Documented below.
    */
  val tagsCollection: Output_[js.UndefOr[js.Array[StringDictionary[String]]]] = js.native
  /**
    * A list of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
    */
  val targetGroupArns: Output_[js.Array[String]] = js.native
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
    */
  val terminationPolicies: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A list of subnet IDs to launch resources in.
    */
  val vpcZoneIdentifiers: Output_[js.Array[String]] = js.native
  /**
    * A maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for ASG instances to be healthy before timing out.  (See also Waiting
    * for Capacity below.) Setting this to "0" causes
    * this provider to skip all Capacity Waiting behavior.
    */
  val waitForCapacityTimeout: Output_[js.UndefOr[String]] = js.native
  /**
    * Setting this will cause this provider to wait
    * for exactly this number of healthy instances from this autoscaling group in
    * all attached load balancers on both create and update operations. (Takes
    * precedence over `minElbCapacity` behavior.)
    * (See also Waiting for Capacity below.)
    */
  val waitForElbCapacity: Output_[js.UndefOr[Double]] = js.native
}

/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Group = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = js.native
  /**
    * Returns true if the given object is an instance of Group.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
}

