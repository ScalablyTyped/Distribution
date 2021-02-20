package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appautoscaling {
  
  @js.native
  trait PolicyStepScalingPolicyConfiguration extends StObject {
    
    /**
      * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
      */
    var adjustmentType: js.UndefOr[String] = js.native
    
    /**
      * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
      */
    var cooldown: js.UndefOr[Double] = js.native
    
    /**
      * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
      */
    var metricAggregationType: js.UndefOr[String] = js.native
    
    /**
      * The minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
      */
    var minAdjustmentMagnitude: js.UndefOr[Double] = js.native
    
    /**
      * A set of adjustments that manage scaling. These have the following structure:
      */
    var stepAdjustments: js.UndefOr[js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment]] = js.native
  }
  object PolicyStepScalingPolicyConfiguration {
    
    @scala.inline
    def apply(): PolicyStepScalingPolicyConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyStepScalingPolicyConfiguration]
    }
    
    @scala.inline
    implicit class PolicyStepScalingPolicyConfigurationMutableBuilder[Self <: PolicyStepScalingPolicyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustmentType(value: String): Self = StObject.set(x, "adjustmentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustmentTypeUndefined: Self = StObject.set(x, "adjustmentType", js.undefined)
      
      @scala.inline
      def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCooldownUndefined: Self = StObject.set(x, "cooldown", js.undefined)
      
      @scala.inline
      def setMetricAggregationType(value: String): Self = StObject.set(x, "metricAggregationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricAggregationTypeUndefined: Self = StObject.set(x, "metricAggregationType", js.undefined)
      
      @scala.inline
      def setMinAdjustmentMagnitude(value: Double): Self = StObject.set(x, "minAdjustmentMagnitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinAdjustmentMagnitudeUndefined: Self = StObject.set(x, "minAdjustmentMagnitude", js.undefined)
      
      @scala.inline
      def setStepAdjustments(value: js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment]): Self = StObject.set(x, "stepAdjustments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepAdjustmentsUndefined: Self = StObject.set(x, "stepAdjustments", js.undefined)
      
      @scala.inline
      def setStepAdjustmentsVarargs(value: PolicyStepScalingPolicyConfigurationStepAdjustment*): Self = StObject.set(x, "stepAdjustments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PolicyStepScalingPolicyConfigurationStepAdjustment extends StObject {
    
    /**
      * The lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
      */
    var metricIntervalLowerBound: js.UndefOr[String] = js.native
    
    /**
      * The upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
      */
    var metricIntervalUpperBound: js.UndefOr[String] = js.native
    
    /**
      * The number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
      */
    var scalingAdjustment: Double = js.native
  }
  object PolicyStepScalingPolicyConfigurationStepAdjustment {
    
    @scala.inline
    def apply(scalingAdjustment: Double): PolicyStepScalingPolicyConfigurationStepAdjustment = {
      val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyStepScalingPolicyConfigurationStepAdjustment]
    }
    
    @scala.inline
    implicit class PolicyStepScalingPolicyConfigurationStepAdjustmentMutableBuilder[Self <: PolicyStepScalingPolicyConfigurationStepAdjustment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetricIntervalLowerBound(value: String): Self = StObject.set(x, "metricIntervalLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricIntervalLowerBoundUndefined: Self = StObject.set(x, "metricIntervalLowerBound", js.undefined)
      
      @scala.inline
      def setMetricIntervalUpperBound(value: String): Self = StObject.set(x, "metricIntervalUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricIntervalUpperBoundUndefined: Self = StObject.set(x, "metricIntervalUpperBound", js.undefined)
      
      @scala.inline
      def setScalingAdjustment(value: Double): Self = StObject.set(x, "scalingAdjustment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyTargetTrackingScalingPolicyConfiguration extends StObject {
    
    /**
      * A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
      */
    var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] = js.native
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
      */
    var disableScaleIn: js.UndefOr[Boolean] = js.native
    
    /**
      * A predefined metric. See supported fields below.
      */
    var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] = js.native
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
      */
    var scaleInCooldown: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
      */
    var scaleOutCooldown: js.UndefOr[Double] = js.native
    
    /**
      * The target value for the metric.
      */
    var targetValue: Double = js.native
  }
  object PolicyTargetTrackingScalingPolicyConfiguration {
    
    @scala.inline
    def apply(targetValue: Double): PolicyTargetTrackingScalingPolicyConfiguration = {
      val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
    }
    
    @scala.inline
    implicit class PolicyTargetTrackingScalingPolicyConfigurationMutableBuilder[Self <: PolicyTargetTrackingScalingPolicyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizedMetricSpecification(value: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification): Self = StObject.set(x, "customizedMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "customizedMetricSpecification", js.undefined)
      
      @scala.inline
      def setDisableScaleIn(value: Boolean): Self = StObject.set(x, "disableScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScaleInUndefined: Self = StObject.set(x, "disableScaleIn", js.undefined)
      
      @scala.inline
      def setPredefinedMetricSpecification(value: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification): Self = StObject.set(x, "predefinedMetricSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "predefinedMetricSpecification", js.undefined)
      
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
  
  @js.native
  trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends StObject {
    
    /**
      * Configuration block(s) with the dimensions of the metric if the metric was published with dimensions. Detailed below.
      */
    var dimensions: js.UndefOr[
        js.Array[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
      ] = js.native
    
    /**
      * The name of the metric.
      */
    var metricName: String = js.native
    
    /**
      * The namespace of the metric.
      */
    var namespace: String = js.native
    
    /**
      * The statistic of the metric. Valid values: `Average`, `Minimum`, `Maximum`, `SampleCount`, and `Sum`.
      */
    var statistic: String = js.native
    
    /**
      * The unit of the metric.
      */
    var unit: js.UndefOr[String] = js.native
  }
  object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
    
    @scala.inline
    def apply(metricName: String, namespace: String, statistic: String): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
    }
    
    @scala.inline
    implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMutableBuilder[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(
        value: js.Array[
              PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
            ]
      ): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setDimensionsVarargs(value: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
      
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
  
  @js.native
  trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends StObject {
    
    /**
      * The name of the policy. Must be between 1 and 255 characters in length.
      */
    var name: String = js.native
    
    /**
      * Value of the dimension.
      */
    var value: String = js.native
  }
  object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
    
    @scala.inline
    def apply(name: String, value: String): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
    }
    
    @scala.inline
    implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionMutableBuilder[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends StObject {
    
    /**
      * The metric type.
      */
    var predefinedMetricType: String = js.native
    
    /**
      * Reserved for future use. Must be less than or equal to 1023 characters in length.
      */
    var resourceLabel: js.UndefOr[String] = js.native
  }
  object PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
    
    @scala.inline
    def apply(predefinedMetricType: String): PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = {
      val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
    }
    
    @scala.inline
    implicit class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationMutableBuilder[Self <: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPredefinedMetricType(value: String): Self = StObject.set(x, "predefinedMetricType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabel(value: String): Self = StObject.set(x, "resourceLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLabelUndefined: Self = StObject.set(x, "resourceLabel", js.undefined)
    }
  }
  
  @js.native
  trait ScheduledActionScalableTargetAction extends StObject {
    
    /**
      * The maximum capacity.
      */
    var maxCapacity: js.UndefOr[Double] = js.native
    
    /**
      * The minimum capacity.
      */
    var minCapacity: js.UndefOr[Double] = js.native
  }
  object ScheduledActionScalableTargetAction {
    
    @scala.inline
    def apply(): ScheduledActionScalableTargetAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduledActionScalableTargetAction]
    }
    
    @scala.inline
    implicit class ScheduledActionScalableTargetActionMutableBuilder[Self <: ScheduledActionScalableTargetAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxCapacity(value: Double): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMinCapacity(value: Double): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCapacityUndefined: Self = StObject.set(x, "minCapacity", js.undefined)
    }
  }
}
