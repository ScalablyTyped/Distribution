package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatch {
  
  trait EventPermissionCondition extends StObject {
    
    /**
      * Key for the condition. Valid values: `aws:PrincipalOrgID`.
      */
    var key: String
    
    /**
      * Type of condition. Value values: `StringEquals`.
      */
    var `type`: String
    
    /**
      * Value for the key.
      */
    var value: String
  }
  object EventPermissionCondition {
    
    inline def apply(key: String, `type`: String, value: String): EventPermissionCondition = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPermissionCondition]
    }
    
    extension [Self <: EventPermissionCondition](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTargetBatchTarget extends StObject {
    
    /**
      * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
      */
    var arraySize: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
      */
    var jobAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
      */
    var jobDefinition: String
    
    /**
      * The name to use for this execution of the job, if the target is an AWS Batch job.
      */
    var jobName: String
  }
  object EventTargetBatchTarget {
    
    inline def apply(jobDefinition: String, jobName: String): EventTargetBatchTarget = {
      val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetBatchTarget]
    }
    
    extension [Self <: EventTargetBatchTarget](x: Self) {
      
      inline def setArraySize(value: Double): Self = StObject.set(x, "arraySize", value.asInstanceOf[js.Any])
      
      inline def setArraySizeUndefined: Self = StObject.set(x, "arraySize", js.undefined)
      
      inline def setJobAttempts(value: Double): Self = StObject.set(x, "jobAttempts", value.asInstanceOf[js.Any])
      
      inline def setJobAttemptsUndefined: Self = StObject.set(x, "jobAttempts", js.undefined)
      
      inline def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
      
      inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTargetEcsTarget extends StObject {
    
    /**
      * Specifies an ECS task group for the task. The maximum length is 255 characters.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values are `EC2` or `FARGATE`.
      */
    var launchType: js.UndefOr[String] = js.undefined
    
    /**
      * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launchType is FARGATE because the awsvpc mode is required for Fargate tasks.
      */
    var networkConfiguration: js.UndefOr[EventTargetEcsTargetNetworkConfiguration] = js.undefined
    
    /**
      * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
      */
    var platformVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The number of tasks to create based on the TaskDefinition. The default is 1.
      */
    var taskCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
      */
    var taskDefinitionArn: String
  }
  object EventTargetEcsTarget {
    
    inline def apply(taskDefinitionArn: String): EventTargetEcsTarget = {
      val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetEcsTarget]
    }
    
    extension [Self <: EventTargetEcsTarget](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setLaunchType(value: String): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
      
      inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
      
      inline def setNetworkConfiguration(value: EventTargetEcsTargetNetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
      
      inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
      
      inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
      
      inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
      
      inline def setTaskCount(value: Double): Self = StObject.set(x, "taskCount", value.asInstanceOf[js.Any])
      
      inline def setTaskCountUndefined: Self = StObject.set(x, "taskCount", js.undefined)
      
      inline def setTaskDefinitionArn(value: String): Self = StObject.set(x, "taskDefinitionArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTargetEcsTargetNetworkConfiguration extends StObject {
    
    /**
      * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
      */
    var assignPublicIp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
      */
    var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The subnets associated with the task or service.
      */
    var subnets: js.Array[String]
  }
  object EventTargetEcsTargetNetworkConfiguration {
    
    inline def apply(subnets: js.Array[String]): EventTargetEcsTargetNetworkConfiguration = {
      val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetEcsTargetNetworkConfiguration]
    }
    
    extension [Self <: EventTargetEcsTargetNetworkConfiguration](x: Self) {
      
      inline def setAssignPublicIp(value: Boolean): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
      
      inline def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
      
      inline def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    }
  }
  
  trait EventTargetInputTransformer extends StObject {
    
    /**
      * Key value pairs specified in the form of JSONPath (for example, time = $.time)
      * * You can have as many as 10 key-value pairs.
      * * You must use JSON dot notation, not bracket notation.
      * * The keys can't start with "AWS".
      */
    var inputPaths: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var inputTemplate: String
  }
  object EventTargetInputTransformer {
    
    inline def apply(inputTemplate: String): EventTargetInputTransformer = {
      val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetInputTransformer]
    }
    
    extension [Self <: EventTargetInputTransformer](x: Self) {
      
      inline def setInputPaths(value: StringDictionary[String]): Self = StObject.set(x, "inputPaths", value.asInstanceOf[js.Any])
      
      inline def setInputPathsUndefined: Self = StObject.set(x, "inputPaths", js.undefined)
      
      inline def setInputTemplate(value: String): Self = StObject.set(x, "inputTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTargetKinesisTarget extends StObject {
    
    /**
      * The JSON path to be extracted from the event and used as the partition key.
      */
    var partitionKeyPath: js.UndefOr[String] = js.undefined
  }
  object EventTargetKinesisTarget {
    
    inline def apply(): EventTargetKinesisTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTargetKinesisTarget]
    }
    
    extension [Self <: EventTargetKinesisTarget](x: Self) {
      
      inline def setPartitionKeyPath(value: String): Self = StObject.set(x, "partitionKeyPath", value.asInstanceOf[js.Any])
      
      inline def setPartitionKeyPathUndefined: Self = StObject.set(x, "partitionKeyPath", js.undefined)
    }
  }
  
  trait EventTargetRunCommandTarget extends StObject {
    
    /**
      * Can be either `tag:tag-key` or `InstanceIds`.
      */
    var key: String
    
    /**
      * If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
      */
    var values: js.Array[String]
  }
  object EventTargetRunCommandTarget {
    
    inline def apply(key: String, values: js.Array[String]): EventTargetRunCommandTarget = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetRunCommandTarget]
    }
    
    extension [Self <: EventTargetRunCommandTarget](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait EventTargetSqsTarget extends StObject {
    
    /**
      * The FIFO message group ID to use as the target.
      */
    var messageGroupId: js.UndefOr[String] = js.undefined
  }
  object EventTargetSqsTarget {
    
    inline def apply(): EventTargetSqsTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTargetSqsTarget]
    }
    
    extension [Self <: EventTargetSqsTarget](x: Self) {
      
      inline def setMessageGroupId(value: String): Self = StObject.set(x, "messageGroupId", value.asInstanceOf[js.Any])
      
      inline def setMessageGroupIdUndefined: Self = StObject.set(x, "messageGroupId", js.undefined)
    }
  }
  
  trait LogMetricFilterMetricTransformation extends StObject {
    
    /**
      * The value to emit when a filter pattern does not match a log event.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the CloudWatch metric to which the monitored log information should be published (e.g. `ErrorCount`)
      */
    var name: String
    
    /**
      * The destination namespace of the CloudWatch metric.
      */
    var namespace: String
    
    /**
      * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
      */
    var value: String
  }
  object LogMetricFilterMetricTransformation {
    
    inline def apply(name: String, namespace: String, value: String): LogMetricFilterMetricTransformation = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMetricFilterMetricTransformation]
    }
    
    extension [Self <: LogMetricFilterMetricTransformation](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetricAlarmMetricQuery extends StObject {
    
    /**
      * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
      */
    var expression: js.UndefOr[String] = js.undefined
    
    /**
      * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
      */
    var id: String
    
    /**
      * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
      */
    var metric: js.UndefOr[MetricAlarmMetricQueryMetric] = js.undefined
    
    /**
      * Specify exactly one `metricQuery` to be `true` to use that `metricQuery` result as the alarm.
      */
    var returnData: js.UndefOr[Boolean] = js.undefined
  }
  object MetricAlarmMetricQuery {
    
    inline def apply(id: String): MetricAlarmMetricQuery = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricAlarmMetricQuery]
    }
    
    extension [Self <: MetricAlarmMetricQuery](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMetric(value: MetricAlarmMetricQueryMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
      
      inline def setReturnData(value: Boolean): Self = StObject.set(x, "returnData", value.asInstanceOf[js.Any])
      
      inline def setReturnDataUndefined: Self = StObject.set(x, "returnData", js.undefined)
    }
  }
  
  trait MetricAlarmMetricQueryMetric extends StObject {
    
    /**
      * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    var dimensions: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name for this metric.
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    var metricName: String
    
    /**
      * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
      * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * The period in seconds over which the specified `stat` is applied.
      */
    var period: Double
    
    /**
      * The statistic to apply to this metric.
      * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
      */
    var stat: String
    
    /**
      * The unit for this metric.
      */
    var unit: js.UndefOr[String] = js.undefined
  }
  object MetricAlarmMetricQueryMetric {
    
    inline def apply(metricName: String, period: Double, stat: String): MetricAlarmMetricQueryMetric = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricAlarmMetricQueryMetric]
    }
    
    extension [Self <: MetricAlarmMetricQueryMetric](x: Self) {
      
      inline def setDimensions(value: StringDictionary[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
