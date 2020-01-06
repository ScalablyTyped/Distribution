package typings.atPulumiAws.iotTopicRuleMod

import typings.atPulumiAws.typesInputMod.iot.TopicRuleCloudwatchAlarm
import typings.atPulumiAws.typesInputMod.iot.TopicRuleCloudwatchMetric
import typings.atPulumiAws.typesInputMod.iot.TopicRuleDynamodb
import typings.atPulumiAws.typesInputMod.iot.TopicRuleElasticsearch
import typings.atPulumiAws.typesInputMod.iot.TopicRuleFirehose
import typings.atPulumiAws.typesInputMod.iot.TopicRuleKinesis
import typings.atPulumiAws.typesInputMod.iot.TopicRuleLambda
import typings.atPulumiAws.typesInputMod.iot.TopicRuleRepublish
import typings.atPulumiAws.typesInputMod.iot.TopicRuleS3
import typings.atPulumiAws.typesInputMod.iot.TopicRuleSns
import typings.atPulumiAws.typesInputMod.iot.TopicRuleSqs
import typings.atPulumiPulumi.outputMod.Input
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
  val elasticsearch: js.UndefOr[Input[TopicRuleElasticsearch]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: Input[Boolean] = js.native
  val firehose: js.UndefOr[Input[TopicRuleFirehose]] = js.native
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
}

object TopicRuleArgs {
  @scala.inline
  def apply(
    enabled: Input[Boolean],
    sql: Input[String],
    sqlVersion: Input[String],
    cloudwatchAlarm: Input[TopicRuleCloudwatchAlarm] = null,
    cloudwatchMetric: Input[TopicRuleCloudwatchMetric] = null,
    description: Input[String] = null,
    dynamodb: Input[TopicRuleDynamodb] = null,
    elasticsearch: Input[TopicRuleElasticsearch] = null,
    firehose: Input[TopicRuleFirehose] = null,
    kinesis: Input[TopicRuleKinesis] = null,
    lambda: Input[TopicRuleLambda] = null,
    name: Input[String] = null,
    republish: Input[TopicRuleRepublish] = null,
    s3: Input[TopicRuleS3] = null,
    sns: Input[TopicRuleSns] = null,
    sqs: Input[TopicRuleSqs] = null
  ): TopicRuleArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    if (cloudwatchAlarm != null) __obj.updateDynamic("cloudwatchAlarm")(cloudwatchAlarm.asInstanceOf[js.Any])
    if (cloudwatchMetric != null) __obj.updateDynamic("cloudwatchMetric")(cloudwatchMetric.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (republish != null) __obj.updateDynamic("republish")(republish.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleArgs]
  }
}

