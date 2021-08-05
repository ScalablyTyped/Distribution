package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cloudwatch.MetricAlarmMetricQuery
import typings.pulumiAws.snsMod.Topic
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricAlarmMod {
  
  @JSImport("@pulumi/aws/cloudwatch/metricAlarm", "MetricAlarm")
  @js.native
  class MetricAlarm protected () extends CustomResource {
    /**
      * Create a MetricAlarm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MetricAlarmArgs) = this()
    def this(name: String, args: MetricAlarmArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
      */
    val actionsEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val alarmActions: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The description for the alarm.
      */
    val alarmDescription: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the cloudwatch metric alarm.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
      */
    val comparisonOperator: Output_[String] = js.native
    
    /**
      * The number of datapoints that must be breaching to trigger the alarm.
      */
    val datapointsToAlarm: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val dimensions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Used only for alarms
      * based on percentiles. If you specify `ignore`, the alarm state will not
      * change during periods with too few data points to be statistically significant.
      * If you specify `evaluate` or omit this parameter, the alarm will always be
      * evaluated and possibly change state no matter how many data points are available.
      * The following values are supported: `ignore`, and `evaluate`.
      */
    val evaluateLowSampleCountPercentiles: Output_[String] = js.native
    
    /**
      * The number of periods over which data is compared to the specified threshold.
      */
    val evaluationPeriods: Output_[Double] = js.native
    
    /**
      * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
      */
    val extendedStatistic: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val insufficientDataActions: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name for this metric.
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val metricName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
      */
    val metricQueries: Output_[js.UndefOr[js.Array[MetricAlarmMetricQuery]]] = js.native
    
    /**
      * The descriptive name for the alarm. This name must be unique within the user's AWS account
      */
    val name: Output_[String] = js.native
    
    /**
      * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val namespace: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val okActions: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The period in seconds over which the specified `stat` is applied.
      */
    val period: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The statistic to apply to the alarm's associated metric.
      * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
      */
    val statistic: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
      */
    val threshold: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
      */
    val thresholdMetricId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
      */
    val treatMissingData: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The unit for this metric.
      */
    val unit: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object MetricAlarm {
    
    @JSImport("@pulumi/aws/cloudwatch/metricAlarm", "MetricAlarm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): MetricAlarm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MetricAlarm]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MetricAlarm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MetricAlarm]
    inline def get(name: String, id: Input[ID], state: MetricAlarmState): MetricAlarm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MetricAlarm]
    inline def get(name: String, id: Input[ID], state: MetricAlarmState, opts: CustomResourceOptions): MetricAlarm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MetricAlarm]
    
    /**
      * Returns true if the given object is an instance of MetricAlarm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean]
  }
  
  trait MetricAlarmArgs extends StObject {
    
    /**
      * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
      */
    val actionsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val alarmActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The description for the alarm.
      */
    val alarmDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
      */
    val comparisonOperator: Input[String]
    
    /**
      * The number of datapoints that must be breaching to trigger the alarm.
      */
    val datapointsToAlarm: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val dimensions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Used only for alarms
      * based on percentiles. If you specify `ignore`, the alarm state will not
      * change during periods with too few data points to be statistically significant.
      * If you specify `evaluate` or omit this parameter, the alarm will always be
      * evaluated and possibly change state no matter how many data points are available.
      * The following values are supported: `ignore`, and `evaluate`.
      */
    val evaluateLowSampleCountPercentiles: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of periods over which data is compared to the specified threshold.
      */
    val evaluationPeriods: Input[Double]
    
    /**
      * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
      */
    val extendedStatistic: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val insufficientDataActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The name for this metric.
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val metricName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
      */
    val metricQueries: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]]]
      ] = js.undefined
    
    /**
      * The descriptive name for the alarm. This name must be unique within the user's AWS account
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val okActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The period in seconds over which the specified `stat` is applied.
      */
    val period: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The statistic to apply to the alarm's associated metric.
      * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
      */
    val statistic: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
      */
    val threshold: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
      */
    val thresholdMetricId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
      */
    val treatMissingData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unit for this metric.
      */
    val unit: js.UndefOr[Input[String]] = js.undefined
  }
  object MetricAlarmArgs {
    
    inline def apply(comparisonOperator: Input[String], evaluationPeriods: Input[Double]): MetricAlarmArgs = {
      val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], evaluationPeriods = evaluationPeriods.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricAlarmArgs]
    }
    
    extension [Self <: MetricAlarmArgs](x: Self) {
      
      inline def setActionsEnabled(value: Input[Boolean]): Self = StObject.set(x, "actionsEnabled", value.asInstanceOf[js.Any])
      
      inline def setActionsEnabledUndefined: Self = StObject.set(x, "actionsEnabled", js.undefined)
      
      inline def setAlarmActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "alarmActions", value.asInstanceOf[js.Any])
      
      inline def setAlarmActionsUndefined: Self = StObject.set(x, "alarmActions", js.undefined)
      
      inline def setAlarmActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "alarmActions", js.Array(value :_*))
      
      inline def setAlarmDescription(value: Input[String]): Self = StObject.set(x, "alarmDescription", value.asInstanceOf[js.Any])
      
      inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "alarmDescription", js.undefined)
      
      inline def setComparisonOperator(value: Input[String]): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setDatapointsToAlarm(value: Input[Double]): Self = StObject.set(x, "datapointsToAlarm", value.asInstanceOf[js.Any])
      
      inline def setDatapointsToAlarmUndefined: Self = StObject.set(x, "datapointsToAlarm", js.undefined)
      
      inline def setDimensions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setEvaluateLowSampleCountPercentiles(value: Input[String]): Self = StObject.set(x, "evaluateLowSampleCountPercentiles", value.asInstanceOf[js.Any])
      
      inline def setEvaluateLowSampleCountPercentilesUndefined: Self = StObject.set(x, "evaluateLowSampleCountPercentiles", js.undefined)
      
      inline def setEvaluationPeriods(value: Input[Double]): Self = StObject.set(x, "evaluationPeriods", value.asInstanceOf[js.Any])
      
      inline def setExtendedStatistic(value: Input[String]): Self = StObject.set(x, "extendedStatistic", value.asInstanceOf[js.Any])
      
      inline def setExtendedStatisticUndefined: Self = StObject.set(x, "extendedStatistic", js.undefined)
      
      inline def setInsufficientDataActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "insufficientDataActions", value.asInstanceOf[js.Any])
      
      inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "insufficientDataActions", js.undefined)
      
      inline def setInsufficientDataActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "insufficientDataActions", js.Array(value :_*))
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      inline def setMetricQueries(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]]]): Self = StObject.set(x, "metricQueries", value.asInstanceOf[js.Any])
      
      inline def setMetricQueriesUndefined: Self = StObject.set(x, "metricQueries", js.undefined)
      
      inline def setMetricQueriesVarargs(value: Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]*): Self = StObject.set(x, "metricQueries", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOkActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "okActions", value.asInstanceOf[js.Any])
      
      inline def setOkActionsUndefined: Self = StObject.set(x, "okActions", js.undefined)
      
      inline def setOkActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "okActions", js.Array(value :_*))
      
      inline def setPeriod(value: Input[Double]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStatistic(value: Input[String]): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setThreshold(value: Input[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdMetricId(value: Input[String]): Self = StObject.set(x, "thresholdMetricId", value.asInstanceOf[js.Any])
      
      inline def setThresholdMetricIdUndefined: Self = StObject.set(x, "thresholdMetricId", js.undefined)
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTreatMissingData(value: Input[String]): Self = StObject.set(x, "treatMissingData", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingDataUndefined: Self = StObject.set(x, "treatMissingData", js.undefined)
      
      inline def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait MetricAlarmState extends StObject {
    
    /**
      * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
      */
    val actionsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val alarmActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The description for the alarm.
      */
    val alarmDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the cloudwatch metric alarm.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
      */
    val comparisonOperator: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of datapoints that must be breaching to trigger the alarm.
      */
    val datapointsToAlarm: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val dimensions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Used only for alarms
      * based on percentiles. If you specify `ignore`, the alarm state will not
      * change during periods with too few data points to be statistically significant.
      * If you specify `evaluate` or omit this parameter, the alarm will always be
      * evaluated and possibly change state no matter how many data points are available.
      * The following values are supported: `ignore`, and `evaluate`.
      */
    val evaluateLowSampleCountPercentiles: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of periods over which data is compared to the specified threshold.
      */
    val evaluationPeriods: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
      */
    val extendedStatistic: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val insufficientDataActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The name for this metric.
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val metricName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
      */
    val metricQueries: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]]]
      ] = js.undefined
    
    /**
      * The descriptive name for the alarm. This name must be unique within the user's AWS account
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    val namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    val okActions: js.UndefOr[Input[js.Array[Input[String | Topic]]]] = js.undefined
    
    /**
      * The period in seconds over which the specified `stat` is applied.
      */
    val period: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The statistic to apply to the alarm's associated metric.
      * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
      */
    val statistic: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
      */
    val threshold: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
      */
    val thresholdMetricId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
      */
    val treatMissingData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unit for this metric.
      */
    val unit: js.UndefOr[Input[String]] = js.undefined
  }
  object MetricAlarmState {
    
    inline def apply(): MetricAlarmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricAlarmState]
    }
    
    extension [Self <: MetricAlarmState](x: Self) {
      
      inline def setActionsEnabled(value: Input[Boolean]): Self = StObject.set(x, "actionsEnabled", value.asInstanceOf[js.Any])
      
      inline def setActionsEnabledUndefined: Self = StObject.set(x, "actionsEnabled", js.undefined)
      
      inline def setAlarmActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "alarmActions", value.asInstanceOf[js.Any])
      
      inline def setAlarmActionsUndefined: Self = StObject.set(x, "alarmActions", js.undefined)
      
      inline def setAlarmActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "alarmActions", js.Array(value :_*))
      
      inline def setAlarmDescription(value: Input[String]): Self = StObject.set(x, "alarmDescription", value.asInstanceOf[js.Any])
      
      inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "alarmDescription", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setComparisonOperator(value: Input[String]): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setComparisonOperatorUndefined: Self = StObject.set(x, "comparisonOperator", js.undefined)
      
      inline def setDatapointsToAlarm(value: Input[Double]): Self = StObject.set(x, "datapointsToAlarm", value.asInstanceOf[js.Any])
      
      inline def setDatapointsToAlarmUndefined: Self = StObject.set(x, "datapointsToAlarm", js.undefined)
      
      inline def setDimensions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setEvaluateLowSampleCountPercentiles(value: Input[String]): Self = StObject.set(x, "evaluateLowSampleCountPercentiles", value.asInstanceOf[js.Any])
      
      inline def setEvaluateLowSampleCountPercentilesUndefined: Self = StObject.set(x, "evaluateLowSampleCountPercentiles", js.undefined)
      
      inline def setEvaluationPeriods(value: Input[Double]): Self = StObject.set(x, "evaluationPeriods", value.asInstanceOf[js.Any])
      
      inline def setEvaluationPeriodsUndefined: Self = StObject.set(x, "evaluationPeriods", js.undefined)
      
      inline def setExtendedStatistic(value: Input[String]): Self = StObject.set(x, "extendedStatistic", value.asInstanceOf[js.Any])
      
      inline def setExtendedStatisticUndefined: Self = StObject.set(x, "extendedStatistic", js.undefined)
      
      inline def setInsufficientDataActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "insufficientDataActions", value.asInstanceOf[js.Any])
      
      inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "insufficientDataActions", js.undefined)
      
      inline def setInsufficientDataActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "insufficientDataActions", js.Array(value :_*))
      
      inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      inline def setMetricQueries(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]]]): Self = StObject.set(x, "metricQueries", value.asInstanceOf[js.Any])
      
      inline def setMetricQueriesUndefined: Self = StObject.set(x, "metricQueries", js.undefined)
      
      inline def setMetricQueriesVarargs(value: Input[typings.pulumiAws.inputMod.cloudwatch.MetricAlarmMetricQuery]*): Self = StObject.set(x, "metricQueries", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOkActions(value: Input[js.Array[Input[String | Topic]]]): Self = StObject.set(x, "okActions", value.asInstanceOf[js.Any])
      
      inline def setOkActionsUndefined: Self = StObject.set(x, "okActions", js.undefined)
      
      inline def setOkActionsVarargs(value: (Input[String | Topic])*): Self = StObject.set(x, "okActions", js.Array(value :_*))
      
      inline def setPeriod(value: Input[Double]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStatistic(value: Input[String]): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setThreshold(value: Input[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdMetricId(value: Input[String]): Self = StObject.set(x, "thresholdMetricId", value.asInstanceOf[js.Any])
      
      inline def setThresholdMetricIdUndefined: Self = StObject.set(x, "thresholdMetricId", js.undefined)
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTreatMissingData(value: Input[String]): Self = StObject.set(x, "treatMissingData", value.asInstanceOf[js.Any])
      
      inline def setTreatMissingDataUndefined: Self = StObject.set(x, "treatMissingData", js.undefined)
      
      inline def setUnit(value: Input[String]): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
