package typings
package atPulumiAwsLib.iotTopicRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
@js.native
class TopicRule protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a TopicRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: TopicRuleArgs) = this()
  def this(name: java.lang.String, args: TopicRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the topic rule
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val cloudwatchAlarm: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AlarmNameRoleArn]] = js.native
  val cloudwatchMetric: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_MetricUnitMetricName]] = js.native
  /**
    * The description of the rule.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val dynamodb: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RangeKeyTypeHashKeyValue]] = js.native
  val elasticsearch: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_IdRoleArn]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  val firehose: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnDeliveryStreamNameSeparator]] = js.native
  val kinesis: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnStreamNamePartitionKey]] = js.native
  val lambda: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_FunctionArnString]] = js.native
  /**
    * The name of the rule.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val republish: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnTopicString]] = js.native
  val s3: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnBucketNameKey]] = js.native
  val sns: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnMessageFormatTargetArn]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val sqs: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnUseBase64QueueUrl]] = js.native
}

@JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
@js.native
object TopicRule extends js.Object {
  /**
    * Get an existing TopicRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState
  ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
}

