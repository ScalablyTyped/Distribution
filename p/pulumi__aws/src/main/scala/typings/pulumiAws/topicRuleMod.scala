package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.iot.TopicRuleCloudwatchAlarm
import typings.pulumiAws.outputMod.iot.TopicRuleCloudwatchMetric
import typings.pulumiAws.outputMod.iot.TopicRuleDynamodb
import typings.pulumiAws.outputMod.iot.TopicRuleDynamodbv2
import typings.pulumiAws.outputMod.iot.TopicRuleElasticsearch
import typings.pulumiAws.outputMod.iot.TopicRuleErrorAction
import typings.pulumiAws.outputMod.iot.TopicRuleFirehose
import typings.pulumiAws.outputMod.iot.TopicRuleIotAnalytic
import typings.pulumiAws.outputMod.iot.TopicRuleIotEvent
import typings.pulumiAws.outputMod.iot.TopicRuleKinesis
import typings.pulumiAws.outputMod.iot.TopicRuleLambda
import typings.pulumiAws.outputMod.iot.TopicRuleRepublish
import typings.pulumiAws.outputMod.iot.TopicRuleS3
import typings.pulumiAws.outputMod.iot.TopicRuleSns
import typings.pulumiAws.outputMod.iot.TopicRuleSqs
import typings.pulumiAws.outputMod.iot.TopicRuleStepFunction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicRuleMod {
  
  @JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
  @js.native
  class TopicRule protected () extends CustomResource {
    /**
      * Create a TopicRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicRuleArgs) = this()
    def this(name: String, args: TopicRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the topic rule
      */
    val arn: Output_[String] = js.native
    
    val cloudwatchAlarm: Output_[js.UndefOr[TopicRuleCloudwatchAlarm]] = js.native
    
    val cloudwatchMetric: Output_[js.UndefOr[TopicRuleCloudwatchMetric]] = js.native
    
    /**
      * The description of the rule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    val dynamodb: Output_[js.UndefOr[TopicRuleDynamodb]] = js.native
    
    val dynamodbv2s: Output_[js.UndefOr[js.Array[TopicRuleDynamodbv2]]] = js.native
    
    val elasticsearch: Output_[js.UndefOr[TopicRuleElasticsearch]] = js.native
    
    /**
      * Specifies whether the rule is enabled.
      */
    val enabled: Output_[Boolean] = js.native
    
    /**
      * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
      */
    val errorAction: Output_[js.UndefOr[TopicRuleErrorAction]] = js.native
    
    val firehose: Output_[js.UndefOr[TopicRuleFirehose]] = js.native
    
    val iotAnalytics: Output_[js.UndefOr[js.Array[TopicRuleIotAnalytic]]] = js.native
    
    val iotEvents: Output_[js.UndefOr[js.Array[TopicRuleIotEvent]]] = js.native
    
    val kinesis: Output_[js.UndefOr[TopicRuleKinesis]] = js.native
    
    val lambda: Output_[js.UndefOr[TopicRuleLambda]] = js.native
    
    /**
      * The name of the rule.
      */
    val name: Output_[String] = js.native
    
    val republish: Output_[js.UndefOr[TopicRuleRepublish]] = js.native
    
    val s3: Output_[js.UndefOr[TopicRuleS3]] = js.native
    
    val sns: Output_[js.UndefOr[TopicRuleSns]] = js.native
    
    /**
      * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
      */
    val sql: Output_[String] = js.native
    
    /**
      * The version of the SQL rules engine to use when evaluating the rule.
      */
    val sqlVersion: Output_[String] = js.native
    
    val sqs: Output_[js.UndefOr[TopicRuleSqs]] = js.native
    
    val stepFunctions: Output_[js.UndefOr[js.Array[TopicRuleStepFunction]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object TopicRule {
    
    /**
      * Get an existing TopicRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iot/topicRule", "TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID]): TopicRule = js.native
    @JSImport("@pulumi/aws/iot/topicRule", "TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TopicRule = js.native
    @JSImport("@pulumi/aws/iot/topicRule", "TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicRuleState): TopicRule = js.native
    @JSImport("@pulumi/aws/iot/topicRule", "TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): TopicRule = js.native
    
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iot/topicRule", "TopicRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
  }
  
  @js.native
  trait TopicRuleArgs extends StObject {
    
    val cloudwatchAlarm: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm]] = js.native
    
    val cloudwatchMetric: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric]] = js.native
    
    /**
      * The description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    val dynamodb: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodb]] = js.native
    
    val dynamodbv2s: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]]]] = js.native
    
    val elasticsearch: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleElasticsearch]] = js.native
    
    /**
      * Specifies whether the rule is enabled.
      */
    val enabled: Input[Boolean] = js.native
    
    /**
      * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
      */
    val errorAction: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleErrorAction]] = js.native
    
    val firehose: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleFirehose]] = js.native
    
    val iotAnalytics: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]]]] = js.native
    
    val iotEvents: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]]]] = js.native
    
    val kinesis: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleKinesis]] = js.native
    
    val lambda: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleLambda]] = js.native
    
    /**
      * The name of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    val republish: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleRepublish]] = js.native
    
    val s3: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleS3]] = js.native
    
    val sns: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleSns]] = js.native
    
    /**
      * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
      */
    val sql: Input[String] = js.native
    
    /**
      * The version of the SQL rules engine to use when evaluating the rule.
      */
    val sqlVersion: Input[String] = js.native
    
    val sqs: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleSqs]] = js.native
    
    val stepFunctions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TopicRuleArgs {
    
    @scala.inline
    def apply(enabled: Input[Boolean], sql: Input[String], sqlVersion: Input[String]): TopicRuleArgs = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicRuleArgs]
    }
    
    @scala.inline
    implicit class TopicRuleArgsMutableBuilder[Self <: TopicRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchAlarm(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm]): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
      
      @scala.inline
      def setCloudwatchMetric(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric]): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodb(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodb]): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      @scala.inline
      def setDynamodbv2s(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]]]): Self = StObject.set(x, "dynamodbv2s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbv2sUndefined: Self = StObject.set(x, "dynamodbv2s", js.undefined)
      
      @scala.inline
      def setDynamodbv2sVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]*): Self = StObject.set(x, "dynamodbv2s", js.Array(value :_*))
      
      @scala.inline
      def setElasticsearch(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleElasticsearch]): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorAction(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleErrorAction]): Self = StObject.set(x, "errorAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorActionUndefined: Self = StObject.set(x, "errorAction", js.undefined)
      
      @scala.inline
      def setFirehose(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleFirehose]): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
      
      @scala.inline
      def setIotAnalytics(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]]]): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
      
      @scala.inline
      def setIotAnalyticsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]*): Self = StObject.set(x, "iotAnalytics", js.Array(value :_*))
      
      @scala.inline
      def setIotEvents(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]]]): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
      
      @scala.inline
      def setIotEventsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]*): Self = StObject.set(x, "iotEvents", js.Array(value :_*))
      
      @scala.inline
      def setKinesis(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleKinesis]): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
      
      @scala.inline
      def setLambda(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRepublish(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleRepublish]): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
      
      @scala.inline
      def setS3(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
      
      @scala.inline
      def setSns(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleSns]): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
      
      @scala.inline
      def setSql(value: Input[String]): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlVersion(value: Input[String]): Self = StObject.set(x, "sqlVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleSqs]): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
      
      @scala.inline
      def setStepFunctions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]]]): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
      
      @scala.inline
      def setStepFunctionsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]*): Self = StObject.set(x, "stepFunctions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait TopicRuleState extends StObject {
    
    /**
      * The ARN of the topic rule
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    val cloudwatchAlarm: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm]] = js.native
    
    val cloudwatchMetric: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric]] = js.native
    
    /**
      * The description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    val dynamodb: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodb]] = js.native
    
    val dynamodbv2s: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]]]] = js.native
    
    val elasticsearch: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleElasticsearch]] = js.native
    
    /**
      * Specifies whether the rule is enabled.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
      */
    val errorAction: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleErrorAction]] = js.native
    
    val firehose: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleFirehose]] = js.native
    
    val iotAnalytics: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]]]] = js.native
    
    val iotEvents: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]]]] = js.native
    
    val kinesis: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleKinesis]] = js.native
    
    val lambda: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleLambda]] = js.native
    
    /**
      * The name of the rule.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    val republish: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleRepublish]] = js.native
    
    val s3: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleS3]] = js.native
    
    val sns: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleSns]] = js.native
    
    /**
      * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
      */
    val sql: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of the SQL rules engine to use when evaluating the rule.
      */
    val sqlVersion: js.UndefOr[Input[String]] = js.native
    
    val sqs: js.UndefOr[Input[typings.pulumiAws.inputMod.iot.TopicRuleSqs]] = js.native
    
    val stepFunctions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object TopicRuleState {
    
    @scala.inline
    def apply(): TopicRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopicRuleState]
    }
    
    @scala.inline
    implicit class TopicRuleStateMutableBuilder[Self <: TopicRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCloudwatchAlarm(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm]): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
      
      @scala.inline
      def setCloudwatchMetric(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric]): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodb(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodb]): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      @scala.inline
      def setDynamodbv2s(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]]]): Self = StObject.set(x, "dynamodbv2s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbv2sUndefined: Self = StObject.set(x, "dynamodbv2s", js.undefined)
      
      @scala.inline
      def setDynamodbv2sVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2]*): Self = StObject.set(x, "dynamodbv2s", js.Array(value :_*))
      
      @scala.inline
      def setElasticsearch(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleElasticsearch]): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setErrorAction(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleErrorAction]): Self = StObject.set(x, "errorAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorActionUndefined: Self = StObject.set(x, "errorAction", js.undefined)
      
      @scala.inline
      def setFirehose(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleFirehose]): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
      
      @scala.inline
      def setIotAnalytics(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]]]): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
      
      @scala.inline
      def setIotAnalyticsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic]*): Self = StObject.set(x, "iotAnalytics", js.Array(value :_*))
      
      @scala.inline
      def setIotEvents(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]]]): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
      
      @scala.inline
      def setIotEventsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleIotEvent]*): Self = StObject.set(x, "iotEvents", js.Array(value :_*))
      
      @scala.inline
      def setKinesis(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleKinesis]): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
      
      @scala.inline
      def setLambda(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRepublish(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleRepublish]): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
      
      @scala.inline
      def setS3(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
      
      @scala.inline
      def setSns(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleSns]): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
      
      @scala.inline
      def setSql(value: Input[String]): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
      
      @scala.inline
      def setSqlVersion(value: Input[String]): Self = StObject.set(x, "sqlVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlVersionUndefined: Self = StObject.set(x, "sqlVersion", js.undefined)
      
      @scala.inline
      def setSqs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleSqs]): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
      
      @scala.inline
      def setStepFunctions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]]]): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
      
      @scala.inline
      def setStepFunctionsVarargs(value: Input[typings.pulumiAws.inputMod.iot.TopicRuleStepFunction]*): Self = StObject.set(x, "stepFunctions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
