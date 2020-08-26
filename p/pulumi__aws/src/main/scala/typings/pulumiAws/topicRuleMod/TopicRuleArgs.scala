package typings.pulumiAws.topicRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchAlarm
import typings.pulumiAws.inputMod.iot.TopicRuleCloudwatchMetric
import typings.pulumiAws.inputMod.iot.TopicRuleDynamodb
import typings.pulumiAws.inputMod.iot.TopicRuleDynamodbv2
import typings.pulumiAws.inputMod.iot.TopicRuleElasticsearch
import typings.pulumiAws.inputMod.iot.TopicRuleErrorAction
import typings.pulumiAws.inputMod.iot.TopicRuleFirehose
import typings.pulumiAws.inputMod.iot.TopicRuleIotAnalytic
import typings.pulumiAws.inputMod.iot.TopicRuleIotEvent
import typings.pulumiAws.inputMod.iot.TopicRuleKinesis
import typings.pulumiAws.inputMod.iot.TopicRuleLambda
import typings.pulumiAws.inputMod.iot.TopicRuleRepublish
import typings.pulumiAws.inputMod.iot.TopicRuleS3
import typings.pulumiAws.inputMod.iot.TopicRuleSns
import typings.pulumiAws.inputMod.iot.TopicRuleSqs
import typings.pulumiAws.inputMod.iot.TopicRuleStepFunction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleArgs extends js.Object {
  val cloudwatchAlarm: js.UndefOr[Input[TopicRuleCloudwatchAlarm]] = js.native
  val cloudwatchMetric: js.UndefOr[Input[TopicRuleCloudwatchMetric]] = js.native
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  val dynamodb: js.UndefOr[Input[TopicRuleDynamodb]] = js.native
  val dynamodbv2s: js.UndefOr[Input[js.Array[Input[TopicRuleDynamodbv2]]]] = js.native
  val elasticsearch: js.UndefOr[Input[TopicRuleElasticsearch]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: Input[Boolean] = js.native
  /**
    * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
    */
  val errorAction: js.UndefOr[Input[TopicRuleErrorAction]] = js.native
  val firehose: js.UndefOr[Input[TopicRuleFirehose]] = js.native
  val iotAnalytics: js.UndefOr[Input[js.Array[Input[TopicRuleIotAnalytic]]]] = js.native
  val iotEvents: js.UndefOr[Input[js.Array[Input[TopicRuleIotEvent]]]] = js.native
  val kinesis: js.UndefOr[Input[TopicRuleKinesis]] = js.native
  val lambda: js.UndefOr[Input[TopicRuleLambda]] = js.native
  /**
    * The name of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val republish: js.UndefOr[Input[TopicRuleRepublish]] = js.native
  val s3: js.UndefOr[Input[TopicRuleS3]] = js.native
  val sns: js.UndefOr[Input[TopicRuleSns]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: Input[String] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: Input[String] = js.native
  val sqs: js.UndefOr[Input[TopicRuleSqs]] = js.native
  val stepFunctions: js.UndefOr[Input[js.Array[Input[TopicRuleStepFunction]]]] = js.native
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
  implicit class TopicRuleArgsOps[Self <: TopicRuleArgs] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: Input[String]): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlVersion(value: Input[String]): Self = this.set("sqlVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudwatchAlarm(value: Input[TopicRuleCloudwatchAlarm]): Self = this.set("cloudwatchAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchAlarm: Self = this.set("cloudwatchAlarm", js.undefined)
    @scala.inline
    def setCloudwatchMetric(value: Input[TopicRuleCloudwatchMetric]): Self = this.set("cloudwatchMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchMetric: Self = this.set("cloudwatchMetric", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDynamodb(value: Input[TopicRuleDynamodb]): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setDynamodbv2sVarargs(value: Input[TopicRuleDynamodbv2]*): Self = this.set("dynamodbv2s", js.Array(value :_*))
    @scala.inline
    def setDynamodbv2s(value: Input[js.Array[Input[TopicRuleDynamodbv2]]]): Self = this.set("dynamodbv2s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodbv2s: Self = this.set("dynamodbv2s", js.undefined)
    @scala.inline
    def setElasticsearch(value: Input[TopicRuleElasticsearch]): Self = this.set("elasticsearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearch: Self = this.set("elasticsearch", js.undefined)
    @scala.inline
    def setErrorAction(value: Input[TopicRuleErrorAction]): Self = this.set("errorAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorAction: Self = this.set("errorAction", js.undefined)
    @scala.inline
    def setFirehose(value: Input[TopicRuleFirehose]): Self = this.set("firehose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    @scala.inline
    def setIotAnalyticsVarargs(value: Input[TopicRuleIotAnalytic]*): Self = this.set("iotAnalytics", js.Array(value :_*))
    @scala.inline
    def setIotAnalytics(value: Input[js.Array[Input[TopicRuleIotAnalytic]]]): Self = this.set("iotAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotAnalytics: Self = this.set("iotAnalytics", js.undefined)
    @scala.inline
    def setIotEventsVarargs(value: Input[TopicRuleIotEvent]*): Self = this.set("iotEvents", js.Array(value :_*))
    @scala.inline
    def setIotEvents(value: Input[js.Array[Input[TopicRuleIotEvent]]]): Self = this.set("iotEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotEvents: Self = this.set("iotEvents", js.undefined)
    @scala.inline
    def setKinesis(value: Input[TopicRuleKinesis]): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    @scala.inline
    def setLambda(value: Input[TopicRuleLambda]): Self = this.set("lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRepublish(value: Input[TopicRuleRepublish]): Self = this.set("republish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepublish: Self = this.set("republish", js.undefined)
    @scala.inline
    def setS3(value: Input[TopicRuleS3]): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    @scala.inline
    def setSns(value: Input[TopicRuleSns]): Self = this.set("sns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    @scala.inline
    def setSqs(value: Input[TopicRuleSqs]): Self = this.set("sqs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    @scala.inline
    def setStepFunctionsVarargs(value: Input[TopicRuleStepFunction]*): Self = this.set("stepFunctions", js.Array(value :_*))
    @scala.inline
    def setStepFunctions(value: Input[js.Array[Input[TopicRuleStepFunction]]]): Self = this.set("stepFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepFunctions: Self = this.set("stepFunctions", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

