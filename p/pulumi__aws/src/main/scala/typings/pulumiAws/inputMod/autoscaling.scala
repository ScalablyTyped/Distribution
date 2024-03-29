package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscaling {
  
  trait GroupInitialLifecycleHook extends StObject {
    
    var defaultResult: js.UndefOr[Input[String]] = js.undefined
    
    var heartbeatTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    var lifecycleTransition: Input[String]
    
    /**
      * The name of the auto scaling group. By default generated by this provider.
      */
    var name: Input[String]
    
    var notificationMetadata: js.UndefOr[Input[String]] = js.undefined
    
    var notificationTargetArn: js.UndefOr[Input[String]] = js.undefined
    
    var roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupInitialLifecycleHook {
    
    inline def apply(lifecycleTransition: Input[String], name: Input[String]): GroupInitialLifecycleHook = {
      val __obj = js.Dynamic.literal(lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupInitialLifecycleHook]
    }
    
    extension [Self <: GroupInitialLifecycleHook](x: Self) {
      
      inline def setDefaultResult(value: Input[String]): Self = StObject.set(x, "defaultResult", value.asInstanceOf[js.Any])
      
      inline def setDefaultResultUndefined: Self = StObject.set(x, "defaultResult", js.undefined)
      
      inline def setHeartbeatTimeout(value: Input[Double]): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
      
      inline def setLifecycleTransition(value: Input[String]): Self = StObject.set(x, "lifecycleTransition", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotificationMetadata(value: Input[String]): Self = StObject.set(x, "notificationMetadata", value.asInstanceOf[js.Any])
      
      inline def setNotificationMetadataUndefined: Self = StObject.set(x, "notificationMetadata", js.undefined)
      
      inline def setNotificationTargetArn(value: Input[String]): Self = StObject.set(x, "notificationTargetArn", value.asInstanceOf[js.Any])
      
      inline def setNotificationTargetArnUndefined: Self = StObject.set(x, "notificationTargetArn", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
  
  trait GroupLaunchTemplate extends StObject {
    
    /**
      * The ID of the launch template. Conflicts with `name`.
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the auto scaling group. By default generated by this provider.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
      */
    var version: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupLaunchTemplate {
    
    inline def apply(): GroupLaunchTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupLaunchTemplate]
    }
    
    extension [Self <: GroupLaunchTemplate](x: Self) {
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GroupMixedInstancesPolicy extends StObject {
    
    /**
      * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
      */
    var instancesDistribution: js.UndefOr[Input[GroupMixedInstancesPolicyInstancesDistribution]] = js.undefined
    
    /**
      * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
      */
    var launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate]
  }
  object GroupMixedInstancesPolicy {
    
    inline def apply(launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate]): GroupMixedInstancesPolicy = {
      val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupMixedInstancesPolicy]
    }
    
    extension [Self <: GroupMixedInstancesPolicy](x: Self) {
      
      inline def setInstancesDistribution(value: Input[GroupMixedInstancesPolicyInstancesDistribution]): Self = StObject.set(x, "instancesDistribution", value.asInstanceOf[js.Any])
      
      inline def setInstancesDistributionUndefined: Self = StObject.set(x, "instancesDistribution", js.undefined)
      
      inline def setLaunchTemplate(value: Input[GroupMixedInstancesPolicyLaunchTemplate]): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GroupMixedInstancesPolicyInstancesDistribution extends StObject {
    
    /**
      * Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
      */
    var onDemandAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
      */
    var onDemandBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `0`.
      */
    var onDemandPercentageAboveBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`. Default: `lowest-price`.
      */
    var spotAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Default: `2`.
      */
    var spotInstancePools: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
      */
    var spotMaxPrice: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupMixedInstancesPolicyInstancesDistribution {
    
    inline def apply(): GroupMixedInstancesPolicyInstancesDistribution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupMixedInstancesPolicyInstancesDistribution]
    }
    
    extension [Self <: GroupMixedInstancesPolicyInstancesDistribution](x: Self) {
      
      inline def setOnDemandAllocationStrategy(value: Input[String]): Self = StObject.set(x, "onDemandAllocationStrategy", value.asInstanceOf[js.Any])
      
      inline def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "onDemandAllocationStrategy", js.undefined)
      
      inline def setOnDemandBaseCapacity(value: Input[Double]): Self = StObject.set(x, "onDemandBaseCapacity", value.asInstanceOf[js.Any])
      
      inline def setOnDemandBaseCapacityUndefined: Self = StObject.set(x, "onDemandBaseCapacity", js.undefined)
      
      inline def setOnDemandPercentageAboveBaseCapacity(value: Input[Double]): Self = StObject.set(x, "onDemandPercentageAboveBaseCapacity", value.asInstanceOf[js.Any])
      
      inline def setOnDemandPercentageAboveBaseCapacityUndefined: Self = StObject.set(x, "onDemandPercentageAboveBaseCapacity", js.undefined)
      
      inline def setSpotAllocationStrategy(value: Input[String]): Self = StObject.set(x, "spotAllocationStrategy", value.asInstanceOf[js.Any])
      
      inline def setSpotAllocationStrategyUndefined: Self = StObject.set(x, "spotAllocationStrategy", js.undefined)
      
      inline def setSpotInstancePools(value: Input[Double]): Self = StObject.set(x, "spotInstancePools", value.asInstanceOf[js.Any])
      
      inline def setSpotInstancePoolsUndefined: Self = StObject.set(x, "spotInstancePools", js.undefined)
      
      inline def setSpotMaxPrice(value: Input[String]): Self = StObject.set(x, "spotMaxPrice", value.asInstanceOf[js.Any])
      
      inline def setSpotMaxPriceUndefined: Self = StObject.set(x, "spotMaxPrice", js.undefined)
    }
  }
  
  trait GroupMixedInstancesPolicyLaunchTemplate extends StObject {
    
    /**
      * Nested argument defines the Launch Template. Defined below.
      */
    var launchTemplateSpecification: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
    
    /**
      * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
      */
    var overrides: js.UndefOr[Input[js.Array[Input[GroupMixedInstancesPolicyLaunchTemplateOverride]]]] = js.undefined
  }
  object GroupMixedInstancesPolicyLaunchTemplate {
    
    inline def apply(
      launchTemplateSpecification: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
    ): GroupMixedInstancesPolicyLaunchTemplate = {
      val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplate]
    }
    
    extension [Self <: GroupMixedInstancesPolicyLaunchTemplate](x: Self) {
      
      inline def setLaunchTemplateSpecification(value: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]): Self = StObject.set(x, "launchTemplateSpecification", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: Input[js.Array[Input[GroupMixedInstancesPolicyLaunchTemplateOverride]]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: Input[GroupMixedInstancesPolicyLaunchTemplateOverride]*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    }
  }
  
  trait GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends StObject {
    
    /**
      * The ID of the launch template. Conflicts with `launchTemplateName`.
      */
    var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the launch template. Conflicts with `launchTemplateId`.
      */
    var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
      */
    var version: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
    
    inline def apply(): GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
    }
    
    extension [Self <: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification](x: Self) {
      
      inline def setLaunchTemplateId(value: Input[String]): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
      
      inline def setLaunchTemplateName(value: Input[String]): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GroupMixedInstancesPolicyLaunchTemplateOverride extends StObject {
    
    /**
      * Override the instance type in the Launch Template.
      */
    var instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of capacity units, which gives the instance type a proportional weight to other instance types.
      */
    var weightedCapacity: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupMixedInstancesPolicyLaunchTemplateOverride {
    
    inline def apply(): GroupMixedInstancesPolicyLaunchTemplateOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
    }
    
    extension [Self <: GroupMixedInstancesPolicyLaunchTemplateOverride](x: Self) {
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setWeightedCapacity(value: Input[String]): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
      
      inline def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
    }
  }
  
  trait GroupTag extends StObject {
    
    /**
      * Key
      */
    var key: Input[String]
    
    /**
      * Enables propagation of the tag to
      * Amazon EC2 instances launched via this ASG
      */
    var propagateAtLaunch: Input[Boolean]
    
    /**
      * Value
      */
    var value: Input[String]
  }
  object GroupTag {
    
    inline def apply(key: Input[String], propagateAtLaunch: Input[Boolean], value: Input[String]): GroupTag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupTag]
    }
    
    extension [Self <: GroupTag](x: Self) {
      
      inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPropagateAtLaunch(value: Input[Boolean]): Self = StObject.set(x, "propagateAtLaunch", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyStepAdjustment extends StObject {
    
    /**
      * The lower bound for the
      * difference between the alarm threshold and the CloudWatch metric.
      * Without a value, AWS will treat this bound as infinity.
      */
    var metricIntervalLowerBound: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The upper bound for the
      * difference between the alarm threshold and the CloudWatch metric.
      * Without a value, AWS will treat this bound as infinity. The upper bound
      * must be greater than the lower bound.
      */
    var metricIntervalUpperBound: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of members by which to
      * scale, when the adjustment bounds are breached. A positive value scales
      * up. A negative value scales down.
      */
    var scalingAdjustment: Input[Double]
  }
  object PolicyStepAdjustment {
    
    inline def apply(scalingAdjustment: Input[Double]): PolicyStepAdjustment = {
      val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyStepAdjustment]
    }
    
    extension [Self <: PolicyStepAdjustment](x: Self) {
      
      inline def setMetricIntervalLowerBound(value: Input[String]): Self = StObject.set(x, "metricIntervalLowerBound", value.asInstanceOf[js.Any])
      
      inline def setMetricIntervalLowerBoundUndefined: Self = StObject.set(x, "metricIntervalLowerBound", js.undefined)
      
      inline def setMetricIntervalUpperBound(value: Input[String]): Self = StObject.set(x, "metricIntervalUpperBound", value.asInstanceOf[js.Any])
      
      inline def setMetricIntervalUpperBoundUndefined: Self = StObject.set(x, "metricIntervalUpperBound", js.undefined)
      
      inline def setScalingAdjustment(value: Input[Double]): Self = StObject.set(x, "scalingAdjustment", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyTargetTrackingConfiguration extends StObject {
    
    /**
      * A customized metric. Conflicts with `predefinedMetricSpecification`.
      */
    var customizedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]] = js.undefined
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled.
      */
    var disableScaleIn: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A predefined metric. Conflicts with `customizedMetricSpecification`.
      */
    var predefinedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]] = js.undefined
    
    /**
      * The target value for the metric.
      */
    var targetValue: Input[Double]
  }
  object PolicyTargetTrackingConfiguration {
    
    inline def apply(targetValue: Input[Double]): PolicyTargetTrackingConfiguration = {
      val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
    }
    
    extension [Self <: PolicyTargetTrackingConfiguration](x: Self) {
      
      inline def setCustomizedMetricSpecification(value: Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]): Self = StObject.set(x, "customizedMetricSpecification", value.asInstanceOf[js.Any])
      
      inline def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "customizedMetricSpecification", js.undefined)
      
      inline def setDisableScaleIn(value: Input[Boolean]): Self = StObject.set(x, "disableScaleIn", value.asInstanceOf[js.Any])
      
      inline def setDisableScaleInUndefined: Self = StObject.set(x, "disableScaleIn", js.undefined)
      
      inline def setPredefinedMetricSpecification(value: Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]): Self = StObject.set(x, "predefinedMetricSpecification", value.asInstanceOf[js.Any])
      
      inline def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "predefinedMetricSpecification", js.undefined)
      
      inline def setTargetValue(value: Input[Double]): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyTargetTrackingConfigurationCustomizedMetricSpecification extends StObject {
    
    /**
      * The dimensions of the metric.
      */
    var metricDimensions: js.UndefOr[
        Input[
          js.Array[
            Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
          ]
        ]
      ] = js.undefined
    
    /**
      * The name of the metric.
      */
    var metricName: Input[String]
    
    /**
      * The namespace of the metric.
      */
    var namespace: Input[String]
    
    /**
      * The statistic of the metric.
      */
    var statistic: Input[String]
    
    /**
      * The unit of the metric.
      */
    var unit: js.UndefOr[Input[String]] = js.undefined
  }
  object PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
    
    inline def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): PolicyTargetTrackingConfigurationCustomizedMetricSpecification = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]
    }
    
    extension [Self <: PolicyTargetTrackingConfigurationCustomizedMetricSpecification](x: Self) {
      
      inline def setMetricDimensions(
        value: Input[
              js.Array[
                Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
              ]
            ]
      ): Self = StObject.set(x, "metricDimensions", value.asInstanceOf[js.Any])
      
      inline def setMetricDimensionsUndefined: Self = StObject.set(x, "metricDimensions", js.undefined)
      
      inline def setMetricDimensionsVarargs(value: Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]*): Self = StObject.set(x, "metricDimensions", js.Array(value :_*))
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setStatistic(value: Input[String]): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension extends StObject {
    
    /**
      * The name of the dimension.
      */
    var name: Input[String]
    
    /**
      * The value of the dimension.
      */
    var value: Input[String]
  }
  object PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension {
    
    inline def apply(name: Input[String], value: Input[String]): PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
    }
    
    extension [Self <: PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends StObject {
    
    /**
      * The metric type.
      */
    var predefinedMetricType: Input[String]
    
    /**
      * Identifies the resource associated with the metric type.
      */
    var resourceLabel: js.UndefOr[Input[String]] = js.undefined
  }
  object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
    
    inline def apply(predefinedMetricType: Input[String]): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
      val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
    }
    
    extension [Self <: PolicyTargetTrackingConfigurationPredefinedMetricSpecification](x: Self) {
      
      inline def setPredefinedMetricType(value: Input[String]): Self = StObject.set(x, "predefinedMetricType", value.asInstanceOf[js.Any])
      
      inline def setResourceLabel(value: Input[String]): Self = StObject.set(x, "resourceLabel", value.asInstanceOf[js.Any])
      
      inline def setResourceLabelUndefined: Self = StObject.set(x, "resourceLabel", js.undefined)
    }
  }
}
