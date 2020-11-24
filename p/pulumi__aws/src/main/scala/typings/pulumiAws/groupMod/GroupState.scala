package typings.pulumiAws.groupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.ec2Mod.LaunchConfiguration
import typings.pulumiAws.ec2Mod.PlacementGroup
import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook
import typings.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate
import typings.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy
import typings.pulumiAws.inputMod.autoscaling.GroupTag
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupState extends js.Object {
  
  /**
    * The ARN for this AutoScaling Group
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of one or more availability zones for the group. Used for EC2-Classic and default subnets when not specified with `vpcZoneIdentifier` argument. Conflicts with `vpcZoneIdentifier`.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A list of metrics to collect. The allowed values are `GroupDesiredCapacity`, `GroupInServiceCapacity`, `GroupPendingCapacity`, `GroupMinSize`, `GroupMaxSize`, `GroupInServiceInstances`, `GroupPendingInstances`, `GroupStandbyInstances`, `GroupStandbyCapacity`, `GroupTerminatingCapacity`, `GroupTerminatingInstances`, `GroupTotalCapacity`, `GroupTotalInstances`.
    */
  val enabledMetrics: js.UndefOr[Input[js.Array[Input[Metric]]]] = js.native
  
  /**
    * Allows deleting the autoscaling group without waiting
    * for all instances in the pool to terminate.  You can force an autoscaling group to delete
    * even if it's in the process of scaling a resource. Normally, this provider
    * drains all the instances before deleting the group.  This bypasses that
    * behavior and potentially leaves resources dangling.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: js.UndefOr[Input[Double]] = js.native
  
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: js.UndefOr[Input[String]] = js.native
  
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * `aws.autoscaling.LifecycleHook`
    * resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
    */
  val initialLifecycleHooks: js.UndefOr[Input[js.Array[Input[GroupInitialLifecycleHook]]]] = js.native
  
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: js.UndefOr[Input[String | LaunchConfiguration]] = js.native
  
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  val launchTemplate: js.UndefOr[Input[GroupLaunchTemplate]] = js.native
  
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `targetGroupArns` instead.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 604800 and 31536000 seconds.
    */
  val maxInstanceLifetime: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: js.UndefOr[Input[String | MetricsGranularity]] = js.native
  
  /**
    * Setting this causes this provider to wait for
    * this number of instances from this autoscaling group to show up healthy in the
    * ELB only on creation. Updates will not wait on ELB instance number changes.
    * (See also Waiting for Capacity below.)
    */
  val minElbCapacity: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: js.UndefOr[Input[GroupMixedInstancesPolicy]] = js.native
  
  /**
    * The name of the auto scaling group. By default generated by this provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: js.UndefOr[Input[String | PlacementGroup]] = js.native
  
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for termination
    * during scale in events.
    */
  val protectFromScaleIn: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Configuration block(s) containing resource tags. Conflicts with `tags`. Documented below.
    */
  val tags: js.UndefOr[Input[js.Array[Input[GroupTag]]]] = js.native
  
  /**
    * Set of maps containing resource tags. Conflicts with `tag`. Documented below.
    */
  val tagsCollection: js.UndefOr[Input[js.Array[Input[StringDictionary[Input[String]]]]]] = js.native
  
  /**
    * A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
    */
  val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
    */
  val terminationPolicies: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availabilityZones`.
    */
  val vpcZoneIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for ASG instances to be healthy before timing out.  (See also Waiting
    * for Capacity below.) Setting this to "0" causes
    * this provider to skip all Capacity Waiting behavior.
    */
  val waitForCapacityTimeout: js.UndefOr[Input[String]] = js.native
  
  /**
    * Setting this will cause this provider to wait
    * for exactly this number of healthy instances from this autoscaling group in
    * all attached load balancers on both create and update operations. (Takes
    * precedence over `minElbCapacity` behavior.)
    * (See also Waiting for Capacity below.)
    */
  val waitForElbCapacity: js.UndefOr[Input[Double]] = js.native
}
object GroupState {
  
  @scala.inline
  def apply(): GroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupState]
  }
  
  @scala.inline
  implicit class GroupStateOps[Self <: GroupState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setDefaultCooldown(value: Input[Double]): Self = this.set("defaultCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCooldown: Self = this.set("defaultCooldown", js.undefined)
    
    @scala.inline
    def setDesiredCapacity(value: Input[Double]): Self = this.set("desiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredCapacity: Self = this.set("desiredCapacity", js.undefined)
    
    @scala.inline
    def setEnabledMetricsVarargs(value: Input[Metric]*): Self = this.set("enabledMetrics", js.Array(value :_*))
    
    @scala.inline
    def setEnabledMetrics(value: Input[js.Array[Input[Metric]]]): Self = this.set("enabledMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledMetrics: Self = this.set("enabledMetrics", js.undefined)
    
    @scala.inline
    def setForceDelete(value: Input[Boolean]): Self = this.set("forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("forceDelete", js.undefined)
    
    @scala.inline
    def setHealthCheckGracePeriod(value: Input[Double]): Self = this.set("healthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckGracePeriod: Self = this.set("healthCheckGracePeriod", js.undefined)
    
    @scala.inline
    def setHealthCheckType(value: Input[String]): Self = this.set("healthCheckType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckType: Self = this.set("healthCheckType", js.undefined)
    
    @scala.inline
    def setInitialLifecycleHooksVarargs(value: Input[GroupInitialLifecycleHook]*): Self = this.set("initialLifecycleHooks", js.Array(value :_*))
    
    @scala.inline
    def setInitialLifecycleHooks(value: Input[js.Array[Input[GroupInitialLifecycleHook]]]): Self = this.set("initialLifecycleHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLifecycleHooks: Self = this.set("initialLifecycleHooks", js.undefined)
    
    @scala.inline
    def setLaunchConfiguration(value: Input[String | LaunchConfiguration]): Self = this.set("launchConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchConfiguration: Self = this.set("launchConfiguration", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: Input[GroupLaunchTemplate]): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("launchTemplate", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: Input[String]*): Self = this.set("loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancers: Self = this.set("loadBalancers", js.undefined)
    
    @scala.inline
    def setMaxInstanceLifetime(value: Input[Double]): Self = this.set("maxInstanceLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstanceLifetime: Self = this.set("maxInstanceLifetime", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Input[Double]): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMetricsGranularity(value: Input[String | MetricsGranularity]): Self = this.set("metricsGranularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsGranularity: Self = this.set("metricsGranularity", js.undefined)
    
    @scala.inline
    def setMinElbCapacity(value: Input[Double]): Self = this.set("minElbCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinElbCapacity: Self = this.set("minElbCapacity", js.undefined)
    
    @scala.inline
    def setMinSize(value: Input[Double]): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMixedInstancesPolicy(value: Input[GroupMixedInstancesPolicy]): Self = this.set("mixedInstancesPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixedInstancesPolicy: Self = this.set("mixedInstancesPolicy", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setPlacementGroup(value: Input[String | PlacementGroup]): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroup: Self = this.set("placementGroup", js.undefined)
    
    @scala.inline
    def setProtectFromScaleIn(value: Input[Boolean]): Self = this.set("protectFromScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectFromScaleIn: Self = this.set("protectFromScaleIn", js.undefined)
    
    @scala.inline
    def setServiceLinkedRoleArn(value: Input[String]): Self = this.set("serviceLinkedRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceLinkedRoleArn: Self = this.set("serviceLinkedRoleArn", js.undefined)
    
    @scala.inline
    def setSuspendedProcessesVarargs(value: Input[String]*): Self = this.set("suspendedProcesses", js.Array(value :_*))
    
    @scala.inline
    def setSuspendedProcesses(value: Input[js.Array[Input[String]]]): Self = this.set("suspendedProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspendedProcesses: Self = this.set("suspendedProcesses", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Input[GroupTag]*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Input[js.Array[Input[GroupTag]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsCollectionVarargs(value: Input[StringDictionary[Input[String]]]*): Self = this.set("tagsCollection", js.Array(value :_*))
    
    @scala.inline
    def setTagsCollection(value: Input[js.Array[Input[StringDictionary[Input[String]]]]]): Self = this.set("tagsCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsCollection: Self = this.set("tagsCollection", js.undefined)
    
    @scala.inline
    def setTargetGroupArnsVarargs(value: Input[String]*): Self = this.set("targetGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = this.set("targetGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupArns: Self = this.set("targetGroupArns", js.undefined)
    
    @scala.inline
    def setTerminationPoliciesVarargs(value: Input[String]*): Self = this.set("terminationPolicies", js.Array(value :_*))
    
    @scala.inline
    def setTerminationPolicies(value: Input[js.Array[Input[String]]]): Self = this.set("terminationPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationPolicies: Self = this.set("terminationPolicies", js.undefined)
    
    @scala.inline
    def setVpcZoneIdentifiersVarargs(value: Input[String]*): Self = this.set("vpcZoneIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setVpcZoneIdentifiers(value: Input[js.Array[Input[String]]]): Self = this.set("vpcZoneIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcZoneIdentifiers: Self = this.set("vpcZoneIdentifiers", js.undefined)
    
    @scala.inline
    def setWaitForCapacityTimeout(value: Input[String]): Self = this.set("waitForCapacityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForCapacityTimeout: Self = this.set("waitForCapacityTimeout", js.undefined)
    
    @scala.inline
    def setWaitForElbCapacity(value: Input[Double]): Self = this.set("waitForElbCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForElbCapacity: Self = this.set("waitForElbCapacity", js.undefined)
  }
}
