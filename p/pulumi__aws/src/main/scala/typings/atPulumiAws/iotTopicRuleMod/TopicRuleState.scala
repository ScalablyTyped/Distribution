package typings.atPulumiAws.iotTopicRuleMod

import typings.atPulumiAws.Anon_AlarmNameRoleArn
import typings.atPulumiAws.Anon_BucketNameKey
import typings.atPulumiAws.Anon_DeliveryStreamNameRoleArn
import typings.atPulumiAws.Anon_EndpointIdIndexRoleArn
import typings.atPulumiAws.Anon_FunctionArnInput
import typings.atPulumiAws.Anon_HashKeyFieldHashKeyType
import typings.atPulumiAws.Anon_MessageFormatRoleArn
import typings.atPulumiAws.Anon_MetricNameMetricNamespace
import typings.atPulumiAws.Anon_PartitionKeyRoleArn
import typings.atPulumiAws.Anon_QueueUrlRoleArn
import typings.atPulumiAws.Anon_RoleArnTopic
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleState extends js.Object {
  /**
    * The ARN of the topic rule
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  val cloudwatchAlarm: js.UndefOr[Input[Anon_AlarmNameRoleArn]] = js.undefined
  val cloudwatchMetric: js.UndefOr[Input[Anon_MetricNameMetricNamespace]] = js.undefined
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  val dynamodb: js.UndefOr[Input[Anon_HashKeyFieldHashKeyType]] = js.undefined
  val elasticsearch: js.UndefOr[Input[Anon_EndpointIdIndexRoleArn]] = js.undefined
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  val firehose: js.UndefOr[Input[Anon_DeliveryStreamNameRoleArn]] = js.undefined
  val kinesis: js.UndefOr[Input[Anon_PartitionKeyRoleArn]] = js.undefined
  val lambda: js.UndefOr[Input[Anon_FunctionArnInput]] = js.undefined
  /**
    * The name of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val republish: js.UndefOr[Input[Anon_RoleArnTopic]] = js.undefined
  val s3: js.UndefOr[Input[Anon_BucketNameKey]] = js.undefined
  val sns: js.UndefOr[Input[Anon_MessageFormatRoleArn]] = js.undefined
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: js.UndefOr[Input[String]] = js.undefined
  val sqs: js.UndefOr[Input[Anon_QueueUrlRoleArn]] = js.undefined
}

object TopicRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    cloudwatchAlarm: Input[Anon_AlarmNameRoleArn] = null,
    cloudwatchMetric: Input[Anon_MetricNameMetricNamespace] = null,
    description: Input[String] = null,
    dynamodb: Input[Anon_HashKeyFieldHashKeyType] = null,
    elasticsearch: Input[Anon_EndpointIdIndexRoleArn] = null,
    enabled: Input[Boolean] = null,
    firehose: Input[Anon_DeliveryStreamNameRoleArn] = null,
    kinesis: Input[Anon_PartitionKeyRoleArn] = null,
    lambda: Input[Anon_FunctionArnInput] = null,
    name: Input[String] = null,
    republish: Input[Anon_RoleArnTopic] = null,
    s3: Input[Anon_BucketNameKey] = null,
    sns: Input[Anon_MessageFormatRoleArn] = null,
    sql: Input[String] = null,
    sqlVersion: Input[String] = null,
    sqs: Input[Anon_QueueUrlRoleArn] = null
  ): TopicRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloudwatchAlarm != null) __obj.updateDynamic("cloudwatchAlarm")(cloudwatchAlarm.asInstanceOf[js.Any])
    if (cloudwatchMetric != null) __obj.updateDynamic("cloudwatchMetric")(cloudwatchMetric.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (republish != null) __obj.updateDynamic("republish")(republish.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    if (sqlVersion != null) __obj.updateDynamic("sqlVersion")(sqlVersion.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleState]
  }
}

