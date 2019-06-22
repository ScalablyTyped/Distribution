package typings
package atPulumiAwsLib.iotTopicRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
@js.native
class TopicRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val cloudwatchAlarm: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AlarmName]] = js.native
  val cloudwatchMetric: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_MetricName]] = js.native
  /**
    * The description of the rule.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val dynamodb: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_HashKeyField]] = js.native
  val elasticsearch: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_EndpointIdIndex]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  val firehose: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_DeliveryStreamName]] = js.native
  val kinesis: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_PartitionKey]] = js.native
  val lambda: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_FunctionArn]] = js.native
  /**
    * The name of the rule.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val republish: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArn]] = js.native
  val s3: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketName]] = js.native
  val sns: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_MessageFormat]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val sqs: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_QueueUrl]] = js.native
}

/* static members */
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState
  ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
  /**
    * Returns true if the given object is an instance of TopicRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ scala.Boolean = js.native
}

