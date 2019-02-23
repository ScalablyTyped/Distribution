package typings
package atPulumiAwsLib.iotTopicRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleState extends js.Object {
  /**
    * The ARN of the topic rule
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val cloudwatchAlarm: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AlarmNameRoleArn]] = js.undefined
  val cloudwatchMetric: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MetricNameMetricNamespace]] = js.undefined
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val dynamodb: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HashKeyFieldHashKeyType]] = js.undefined
  val elasticsearch: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndpointIdIndex]] = js.undefined
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val firehose: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeliveryStreamNameRoleArn]] = js.undefined
  val kinesis: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PartitionKeyRoleArn]] = js.undefined
  val lambda: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FunctionArnInput]] = js.undefined
  /**
    * The name of the rule.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val republish: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RoleArnTopic]] = js.undefined
  val s3: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketNameKey]] = js.undefined
  val sns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MessageFormatRoleArn]] = js.undefined
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sqs: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_QueueUrlRoleArn]] = js.undefined
}

