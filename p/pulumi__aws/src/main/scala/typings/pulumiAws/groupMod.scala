package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.ec2Mod.LaunchConfiguration
import typings.pulumiAws.ec2Mod.PlacementGroup
import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import typings.pulumiAws.outputMod.autoscaling.GroupInitialLifecycleHook
import typings.pulumiAws.outputMod.autoscaling.GroupLaunchTemplate
import typings.pulumiAws.outputMod.autoscaling.GroupMixedInstancesPolicy
import typings.pulumiAws.outputMod.autoscaling.GroupTag
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
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
      * A list of one or more availability zones for the group. Used for EC2-Classic and default subnets when not specified with `vpcZoneIdentifier` argument. Conflicts with `vpcZoneIdentifier`.
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
    val loadBalancers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
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
      * A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
      */
    val targetGroupArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
      */
    val terminationPolicies: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availabilityZones`.
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
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/autoscaling/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID]): Group = js.native
    @JSImport("@pulumi/aws/autoscaling/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Group = js.native
    @JSImport("@pulumi/aws/autoscaling/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): Group = js.native
    @JSImport("@pulumi/aws/autoscaling/group", "Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/autoscaling/group", "Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  @js.native
  trait GroupArgs extends StObject {
    
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
    val initialLifecycleHooks: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]]
        ]
      ] = js.native
    
    /**
      * The name of the launch configuration to use.
      */
    val launchConfiguration: js.UndefOr[Input[String | LaunchConfiguration]] = js.native
    
    /**
      * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
      */
    val launchTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate]] = js.native
    
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
    val maxSize: Input[Double] = js.native
    
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
    val minSize: Input[Double] = js.native
    
    /**
      * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
      */
    val mixedInstancesPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy]] = js.native
    
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
    val tags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]]]] = js.native
    
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
  object GroupArgs {
    
    @scala.inline
    def apply(maxSize: Input[Double], minSize: Input[Double]): GroupArgs = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupArgs]
    }
    
    @scala.inline
    implicit class GroupArgsMutableBuilder[Self <: GroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCooldown(value: Input[Double]): Self = StObject.set(x, "defaultCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCooldownUndefined: Self = StObject.set(x, "defaultCooldown", js.undefined)
      
      @scala.inline
      def setDesiredCapacity(value: Input[Double]): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
      
      @scala.inline
      def setEnabledMetrics(value: Input[js.Array[Input[Metric]]]): Self = StObject.set(x, "enabledMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledMetricsUndefined: Self = StObject.set(x, "enabledMetrics", js.undefined)
      
      @scala.inline
      def setEnabledMetricsVarargs(value: Input[Metric]*): Self = StObject.set(x, "enabledMetrics", js.Array(value :_*))
      
      @scala.inline
      def setForceDelete(value: Input[Boolean]): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      @scala.inline
      def setHealthCheckGracePeriod(value: Input[Double]): Self = StObject.set(x, "healthCheckGracePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "healthCheckGracePeriod", js.undefined)
      
      @scala.inline
      def setHealthCheckType(value: Input[String]): Self = StObject.set(x, "healthCheckType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckTypeUndefined: Self = StObject.set(x, "healthCheckType", js.undefined)
      
      @scala.inline
      def setInitialLifecycleHooks(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]]
            ]
      ): Self = StObject.set(x, "initialLifecycleHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLifecycleHooksUndefined: Self = StObject.set(x, "initialLifecycleHooks", js.undefined)
      
      @scala.inline
      def setInitialLifecycleHooksVarargs(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]*): Self = StObject.set(x, "initialLifecycleHooks", js.Array(value :_*))
      
      @scala.inline
      def setLaunchConfiguration(value: Input[String | LaunchConfiguration]): Self = StObject.set(x, "launchConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchConfigurationUndefined: Self = StObject.set(x, "launchConfiguration", js.undefined)
      
      @scala.inline
      def setLaunchTemplate(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate]): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      @scala.inline
      def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
      
      @scala.inline
      def setLoadBalancersVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setMaxInstanceLifetime(value: Input[Double]): Self = StObject.set(x, "maxInstanceLifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInstanceLifetimeUndefined: Self = StObject.set(x, "maxInstanceLifetime", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Input[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsGranularity(value: Input[String | MetricsGranularity]): Self = StObject.set(x, "metricsGranularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsGranularityUndefined: Self = StObject.set(x, "metricsGranularity", js.undefined)
      
      @scala.inline
      def setMinElbCapacity(value: Input[Double]): Self = StObject.set(x, "minElbCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinElbCapacityUndefined: Self = StObject.set(x, "minElbCapacity", js.undefined)
      
      @scala.inline
      def setMinSize(value: Input[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixedInstancesPolicy(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy]): Self = StObject.set(x, "mixedInstancesPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "mixedInstancesPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlacementGroup(value: Input[String | PlacementGroup]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      @scala.inline
      def setProtectFromScaleIn(value: Input[Boolean]): Self = StObject.set(x, "protectFromScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectFromScaleInUndefined: Self = StObject.set(x, "protectFromScaleIn", js.undefined)
      
      @scala.inline
      def setServiceLinkedRoleArn(value: Input[String]): Self = StObject.set(x, "serviceLinkedRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceLinkedRoleArnUndefined: Self = StObject.set(x, "serviceLinkedRoleArn", js.undefined)
      
      @scala.inline
      def setSuspendedProcesses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "suspendedProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendedProcessesUndefined: Self = StObject.set(x, "suspendedProcesses", js.undefined)
      
      @scala.inline
      def setSuspendedProcessesVarargs(value: Input[String]*): Self = StObject.set(x, "suspendedProcesses", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsCollection(value: Input[js.Array[Input[StringDictionary[Input[String]]]]]): Self = StObject.set(x, "tagsCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsCollectionUndefined: Self = StObject.set(x, "tagsCollection", js.undefined)
      
      @scala.inline
      def setTagsCollectionVarargs(value: Input[StringDictionary[Input[String]]]*): Self = StObject.set(x, "tagsCollection", js.Array(value :_*))
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnsUndefined: Self = StObject.set(x, "targetGroupArns", js.undefined)
      
      @scala.inline
      def setTargetGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "targetGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setTerminationPolicies(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "terminationPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminationPoliciesUndefined: Self = StObject.set(x, "terminationPolicies", js.undefined)
      
      @scala.inline
      def setTerminationPoliciesVarargs(value: Input[String]*): Self = StObject.set(x, "terminationPolicies", js.Array(value :_*))
      
      @scala.inline
      def setVpcZoneIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcZoneIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcZoneIdentifiersUndefined: Self = StObject.set(x, "vpcZoneIdentifiers", js.undefined)
      
      @scala.inline
      def setVpcZoneIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "vpcZoneIdentifiers", js.Array(value :_*))
      
      @scala.inline
      def setWaitForCapacityTimeout(value: Input[String]): Self = StObject.set(x, "waitForCapacityTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForCapacityTimeoutUndefined: Self = StObject.set(x, "waitForCapacityTimeout", js.undefined)
      
      @scala.inline
      def setWaitForElbCapacity(value: Input[Double]): Self = StObject.set(x, "waitForElbCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForElbCapacityUndefined: Self = StObject.set(x, "waitForElbCapacity", js.undefined)
    }
  }
  
  @js.native
  trait GroupState extends StObject {
    
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
    val initialLifecycleHooks: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]]
        ]
      ] = js.native
    
    /**
      * The name of the launch configuration to use.
      */
    val launchConfiguration: js.UndefOr[Input[String | LaunchConfiguration]] = js.native
    
    /**
      * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
      */
    val launchTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate]] = js.native
    
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
    val mixedInstancesPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy]] = js.native
    
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
    val tags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]]]] = js.native
    
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
    implicit class GroupStateMutableBuilder[Self <: GroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCooldown(value: Input[Double]): Self = StObject.set(x, "defaultCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCooldownUndefined: Self = StObject.set(x, "defaultCooldown", js.undefined)
      
      @scala.inline
      def setDesiredCapacity(value: Input[Double]): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
      
      @scala.inline
      def setEnabledMetrics(value: Input[js.Array[Input[Metric]]]): Self = StObject.set(x, "enabledMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledMetricsUndefined: Self = StObject.set(x, "enabledMetrics", js.undefined)
      
      @scala.inline
      def setEnabledMetricsVarargs(value: Input[Metric]*): Self = StObject.set(x, "enabledMetrics", js.Array(value :_*))
      
      @scala.inline
      def setForceDelete(value: Input[Boolean]): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      @scala.inline
      def setHealthCheckGracePeriod(value: Input[Double]): Self = StObject.set(x, "healthCheckGracePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "healthCheckGracePeriod", js.undefined)
      
      @scala.inline
      def setHealthCheckType(value: Input[String]): Self = StObject.set(x, "healthCheckType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckTypeUndefined: Self = StObject.set(x, "healthCheckType", js.undefined)
      
      @scala.inline
      def setInitialLifecycleHooks(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]]
            ]
      ): Self = StObject.set(x, "initialLifecycleHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLifecycleHooksUndefined: Self = StObject.set(x, "initialLifecycleHooks", js.undefined)
      
      @scala.inline
      def setInitialLifecycleHooksVarargs(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook]*): Self = StObject.set(x, "initialLifecycleHooks", js.Array(value :_*))
      
      @scala.inline
      def setLaunchConfiguration(value: Input[String | LaunchConfiguration]): Self = StObject.set(x, "launchConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchConfigurationUndefined: Self = StObject.set(x, "launchConfiguration", js.undefined)
      
      @scala.inline
      def setLaunchTemplate(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate]): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      @scala.inline
      def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
      
      @scala.inline
      def setLoadBalancersVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setMaxInstanceLifetime(value: Input[Double]): Self = StObject.set(x, "maxInstanceLifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInstanceLifetimeUndefined: Self = StObject.set(x, "maxInstanceLifetime", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Input[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMetricsGranularity(value: Input[String | MetricsGranularity]): Self = StObject.set(x, "metricsGranularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsGranularityUndefined: Self = StObject.set(x, "metricsGranularity", js.undefined)
      
      @scala.inline
      def setMinElbCapacity(value: Input[Double]): Self = StObject.set(x, "minElbCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinElbCapacityUndefined: Self = StObject.set(x, "minElbCapacity", js.undefined)
      
      @scala.inline
      def setMinSize(value: Input[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setMixedInstancesPolicy(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy]): Self = StObject.set(x, "mixedInstancesPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "mixedInstancesPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlacementGroup(value: Input[String | PlacementGroup]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
      
      @scala.inline
      def setProtectFromScaleIn(value: Input[Boolean]): Self = StObject.set(x, "protectFromScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectFromScaleInUndefined: Self = StObject.set(x, "protectFromScaleIn", js.undefined)
      
      @scala.inline
      def setServiceLinkedRoleArn(value: Input[String]): Self = StObject.set(x, "serviceLinkedRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceLinkedRoleArnUndefined: Self = StObject.set(x, "serviceLinkedRoleArn", js.undefined)
      
      @scala.inline
      def setSuspendedProcesses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "suspendedProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendedProcessesUndefined: Self = StObject.set(x, "suspendedProcesses", js.undefined)
      
      @scala.inline
      def setSuspendedProcessesVarargs(value: Input[String]*): Self = StObject.set(x, "suspendedProcesses", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsCollection(value: Input[js.Array[Input[StringDictionary[Input[String]]]]]): Self = StObject.set(x, "tagsCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsCollectionUndefined: Self = StObject.set(x, "tagsCollection", js.undefined)
      
      @scala.inline
      def setTagsCollectionVarargs(value: Input[StringDictionary[Input[String]]]*): Self = StObject.set(x, "tagsCollection", js.Array(value :_*))
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Input[typings.pulumiAws.inputMod.autoscaling.GroupTag]*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnsUndefined: Self = StObject.set(x, "targetGroupArns", js.undefined)
      
      @scala.inline
      def setTargetGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "targetGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setTerminationPolicies(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "terminationPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminationPoliciesUndefined: Self = StObject.set(x, "terminationPolicies", js.undefined)
      
      @scala.inline
      def setTerminationPoliciesVarargs(value: Input[String]*): Self = StObject.set(x, "terminationPolicies", js.Array(value :_*))
      
      @scala.inline
      def setVpcZoneIdentifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcZoneIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcZoneIdentifiersUndefined: Self = StObject.set(x, "vpcZoneIdentifiers", js.undefined)
      
      @scala.inline
      def setVpcZoneIdentifiersVarargs(value: Input[String]*): Self = StObject.set(x, "vpcZoneIdentifiers", js.Array(value :_*))
      
      @scala.inline
      def setWaitForCapacityTimeout(value: Input[String]): Self = StObject.set(x, "waitForCapacityTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForCapacityTimeoutUndefined: Self = StObject.set(x, "waitForCapacityTimeout", js.undefined)
      
      @scala.inline
      def setWaitForElbCapacity(value: Input[Double]): Self = StObject.set(x, "waitForElbCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForElbCapacityUndefined: Self = StObject.set(x, "waitForElbCapacity", js.undefined)
    }
  }
}
