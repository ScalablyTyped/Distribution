package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingplans {
  
  trait ScalingPlanApplicationSource extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
      */
    var cloudformationStackArn: js.UndefOr[String] = js.undefined
    
    /**
      * A set of tags.
      */
    var tagFilters: js.UndefOr[js.Array[ScalingPlanApplicationSourceTagFilter]] = js.undefined
  }
  object ScalingPlanApplicationSource {
    
    @scala.inline
    def apply(): ScalingPlanApplicationSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalingPlanApplicationSource]
    }
    
    @scala.inline
    implicit class ScalingPlanApplicationSourceMutableBuilder[Self <: ScalingPlanApplicationSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudformationStackArn(value: String): Self = StObject.set(x, "cloudformationStackArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudformationStackArnUndefined: Self = StObject.set(x, "cloudformationStackArn", js.undefined)
      
      @scala.inline
      def setTagFilters(value: js.Array[ScalingPlanApplicationSourceTagFilter]): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
      
      @scala.inline
      def setTagFiltersVarargs(value: ScalingPlanApplicationSourceTagFilter*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
    }
  }
  
  trait ScalingPlanApplicationSourceTagFilter extends StObject {
    
    /**
      * The tag key.
      */
    var key: String
    
    /**
      * The tag values.
      */
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ScalingPlanApplicationSourceTagFilter {
    
    @scala.inline
    def apply(key: String): ScalingPlanApplicationSourceTagFilter = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanApplicationSourceTagFilter]
    }
    
    @scala.inline
    implicit class ScalingPlanApplicationSourceTagFilterMutableBuilder[Self <: ScalingPlanApplicationSourceTagFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait ScalingPlanScalingInstruction extends StObject {
    
    /**
      * The customized load metric to use for predictive scaling. You must specify either `customizedLoadMetricSpecification` or `predefinedLoadMetricSpecification` when configuring predictive scaling.
      * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
      */
    var customizedLoadMetricSpecification: js.UndefOr[ScalingPlanScalingInstructionCustomizedLoadMetricSpecification] = js.undefined
    
    /**
      * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
      */
    var disableDynamicScaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictiveScalingMaxCapacityBehavior`.
      */
    var maxCapacity: Double
    
    /**
      * The minimum capacity of the resource.
      */
    var minCapacity: Double
    
    /**
      * The predefined load metric to use for predictive scaling. You must specify either `predefinedLoadMetricSpecification` or `customizedLoadMetricSpecification` when configuring predictive scaling.
      * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
      */
    var predefinedLoadMetricSpecification: js.UndefOr[ScalingPlanScalingInstructionPredefinedLoadMetricSpecification] = js.undefined
    
    /**
      * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
      * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
      */
    var predictiveScalingMaxCapacityBehavior: js.UndefOr[String] = js.undefined
    
    /**
      * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
      */
    var predictiveScalingMaxCapacityBuffer: js.UndefOr[Double] = js.undefined
    
    /**
      * The predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
      */
    var predictiveScalingMode: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the resource. This string consists of the resource type and unique identifier.
      */
    var resourceId: String
    
    /**
      * The scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
      */
    var scalableDimension: String
    
    /**
      * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
      */
    var scalingPolicyUpdateBehavior: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
      */
    var scheduledActionBufferTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
      */
    var serviceNamespace: String
    
    /**
      * The structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
      * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
      */
    var targetTrackingConfigurations: js.Array[ScalingPlanScalingInstructionTargetTrackingConfiguration]
  }
  object ScalingPlanScalingInstruction {
    
    @scala.inline
    def apply(
      maxCapacity: Double,
      minCapacity: Double,
      resourceId: String,
      scalableDimension: String,
      serviceNamespace: String,
      targetTrackingConfigurations: js.Array[ScalingPlanScalingInstructionTargetTrackingConfiguration]
    ): ScalingPlanScalingInstruction = {
      val __obj = js.Dynamic.literal(maxCapacity = maxCapacity.asInstanceOf[js.Any], minCapacity = minCapacity.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any], targetTrackingConfigurations = targetTrackingConfigurations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstruction]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionMutableBuilder[Self <: ScalingPlanScalingInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizedLoadMetricSpecification(value: ScalingPlanScalingInstructionCustomizedLoadMetricSpecification): Self = StObject.set(x, "customizedLoadMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizedLoadMetricSpecificationUndefined: Self = StObject.set(x, "customizedLoadMetricSpecification", js.undefined)
      
      @scala.inline
      def setDisableDynamicScaling(value: Boolean): Self = StObject.set(x, "disableDynamicScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDynamicScalingUndefined: Self = StObject.set(x, "disableDynamicScaling", js.undefined)
      
      @scala.inline
      def setMaxCapacity(value: Double): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCapacity(value: Double): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedLoadMetricSpecification(value: ScalingPlanScalingInstructionPredefinedLoadMetricSpecification): Self = StObject.set(x, "predefinedLoadMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedLoadMetricSpecificationUndefined: Self = StObject.set(x, "predefinedLoadMetricSpecification", js.undefined)
      
      @scala.inline
      def setPredictiveScalingMaxCapacityBehavior(value: String): Self = StObject.set(x, "predictiveScalingMaxCapacityBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredictiveScalingMaxCapacityBehaviorUndefined: Self = StObject.set(x, "predictiveScalingMaxCapacityBehavior", js.undefined)
      
      @scala.inline
      def setPredictiveScalingMaxCapacityBuffer(value: Double): Self = StObject.set(x, "predictiveScalingMaxCapacityBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredictiveScalingMaxCapacityBufferUndefined: Self = StObject.set(x, "predictiveScalingMaxCapacityBuffer", js.undefined)
      
      @scala.inline
      def setPredictiveScalingMode(value: String): Self = StObject.set(x, "predictiveScalingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredictiveScalingModeUndefined: Self = StObject.set(x, "predictiveScalingMode", js.undefined)
      
      @scala.inline
      def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimension(value: String): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPolicyUpdateBehavior(value: String): Self = StObject.set(x, "scalingPolicyUpdateBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPolicyUpdateBehaviorUndefined: Self = StObject.set(x, "scalingPolicyUpdateBehavior", js.undefined)
      
      @scala.inline
      def setScheduledActionBufferTime(value: Double): Self = StObject.set(x, "scheduledActionBufferTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduledActionBufferTimeUndefined: Self = StObject.set(x, "scheduledActionBufferTime", js.undefined)
      
      @scala.inline
      def setServiceNamespace(value: String): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingConfigurations(value: js.Array[ScalingPlanScalingInstructionTargetTrackingConfiguration]): Self = StObject.set(x, "targetTrackingConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingConfigurationsVarargs(value: ScalingPlanScalingInstructionTargetTrackingConfiguration*): Self = StObject.set(x, "targetTrackingConfigurations", js.Array(value :_*))
    }
  }
  
  trait ScalingPlanScalingInstructionCustomizedLoadMetricSpecification extends StObject {
    
    /**
      * The dimensions of the metric.
      */
    var dimensions: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name of the metric.
      */
    var metricName: String
    
    /**
      * The namespace of the metric.
      */
    var namespace: String
    
    /**
      * The statistic of the metric. Currently, the value must always be `Sum`.
      */
    var statistic: String
    
    /**
      * The unit of the metric.
      */
    var unit: js.UndefOr[String] = js.undefined
  }
  object ScalingPlanScalingInstructionCustomizedLoadMetricSpecification {
    
    @scala.inline
    def apply(metricName: String, namespace: String, statistic: String): ScalingPlanScalingInstructionCustomizedLoadMetricSpecification = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstructionCustomizedLoadMetricSpecification]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationMutableBuilder[Self <: ScalingPlanScalingInstructionCustomizedLoadMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: StringDictionary[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatistic(value: String): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait ScalingPlanScalingInstructionPredefinedLoadMetricSpecification extends StObject {
    
    /**
      * The metric type. Valid values: `ALBTargetGroupRequestCount`, `ASGTotalCPUUtilization`, `ASGTotalNetworkIn`, `ASGTotalNetworkOut`.
      */
    var predefinedLoadMetricType: String
    
    /**
      * Identifies the resource associated with the metric type.
      */
    var resourceLabel: js.UndefOr[String] = js.undefined
  }
  object ScalingPlanScalingInstructionPredefinedLoadMetricSpecification {
    
    @scala.inline
    def apply(predefinedLoadMetricType: String): ScalingPlanScalingInstructionPredefinedLoadMetricSpecification = {
      val __obj = js.Dynamic.literal(predefinedLoadMetricType = predefinedLoadMetricType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstructionPredefinedLoadMetricSpecification]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationMutableBuilder[Self <: ScalingPlanScalingInstructionPredefinedLoadMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPredefinedLoadMetricType(value: String): Self = StObject.set(x, "predefinedLoadMetricType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabel(value: String): Self = StObject.set(x, "resourceLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabelUndefined: Self = StObject.set(x, "resourceLabel", js.undefined)
    }
  }
  
  trait ScalingPlanScalingInstructionTargetTrackingConfiguration extends StObject {
    
    /**
      * A customized metric. You can specify either `customizedScalingMetricSpecification` or `predefinedScalingMetricSpecification`.
      * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
      */
    var customizedScalingMetricSpecification: js.UndefOr[
        ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification
      ] = js.undefined
    
    /**
      * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
      */
    var disableScaleIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
      * This value is used only if the resource is an Auto Scaling group.
      */
    var estimatedInstanceWarmup: js.UndefOr[Double] = js.undefined
    
    /**
      * A predefined metric. You can specify either `predefinedScalingMetricSpecification` or `customizedScalingMetricSpecification`.
      * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
      */
    var predefinedScalingMetricSpecification: js.UndefOr[
        ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification
      ] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
      * This value is not used if the scalable resource is an Auto Scaling group.
      */
    var scaleInCooldown: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
      * This value is not used if the scalable resource is an Auto Scaling group.
      */
    var scaleOutCooldown: js.UndefOr[Double] = js.undefined
    
    /**
      * The target value for the metric.
      */
    var targetValue: Double
  }
  object ScalingPlanScalingInstructionTargetTrackingConfiguration {
    
    @scala.inline
    def apply(targetValue: Double): ScalingPlanScalingInstructionTargetTrackingConfiguration = {
      val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfiguration]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationMutableBuilder[Self <: ScalingPlanScalingInstructionTargetTrackingConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizedScalingMetricSpecification(
        value: ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification
      ): Self = StObject.set(x, "customizedScalingMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizedScalingMetricSpecificationUndefined: Self = StObject.set(x, "customizedScalingMetricSpecification", js.undefined)
      
      @scala.inline
      def setDisableScaleIn(value: Boolean): Self = StObject.set(x, "disableScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScaleInUndefined: Self = StObject.set(x, "disableScaleIn", js.undefined)
      
      @scala.inline
      def setEstimatedInstanceWarmup(value: Double): Self = StObject.set(x, "estimatedInstanceWarmup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "estimatedInstanceWarmup", js.undefined)
      
      @scala.inline
      def setPredefinedScalingMetricSpecification(
        value: ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification
      ): Self = StObject.set(x, "predefinedScalingMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedScalingMetricSpecificationUndefined: Self = StObject.set(x, "predefinedScalingMetricSpecification", js.undefined)
      
      @scala.inline
      def setScaleInCooldown(value: Double): Self = StObject.set(x, "scaleInCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleInCooldownUndefined: Self = StObject.set(x, "scaleInCooldown", js.undefined)
      
      @scala.inline
      def setScaleOutCooldown(value: Double): Self = StObject.set(x, "scaleOutCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleOutCooldownUndefined: Self = StObject.set(x, "scaleOutCooldown", js.undefined)
      
      @scala.inline
      def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification extends StObject {
    
    /**
      * The dimensions of the metric.
      */
    var dimensions: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name of the metric.
      */
    var metricName: String
    
    /**
      * The namespace of the metric.
      */
    var namespace: String
    
    /**
      * The statistic of the metric. Valid values: `Average`, `Maximum`, `Minimum`, `SampleCount`, `Sum`.
      */
    var statistic: String
    
    /**
      * The unit of the metric.
      */
    var unit: js.UndefOr[String] = js.undefined
  }
  object ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification {
    
    @scala.inline
    def apply(metricName: String, namespace: String, statistic: String): ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationMutableBuilder[Self <: ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: StringDictionary[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatistic(value: String): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification extends StObject {
    
    /**
      * The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
      */
    var predefinedScalingMetricType: String
    
    /**
      * Identifies the resource associated with the metric type.
      */
    var resourceLabel: js.UndefOr[String] = js.undefined
  }
  object ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification {
    
    @scala.inline
    def apply(predefinedScalingMetricType: String): ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification = {
      val __obj = js.Dynamic.literal(predefinedScalingMetricType = predefinedScalingMetricType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification]
    }
    
    @scala.inline
    implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationMutableBuilder[Self <: ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPredefinedScalingMetricType(value: String): Self = StObject.set(x, "predefinedScalingMetricType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabel(value: String): Self = StObject.set(x, "resourceLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabelUndefined: Self = StObject.set(x, "resourceLabel", js.undefined)
    }
  }
}
