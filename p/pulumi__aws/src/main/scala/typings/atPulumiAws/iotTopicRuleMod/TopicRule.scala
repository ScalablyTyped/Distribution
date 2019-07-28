package typings.atPulumiAws.iotTopicRuleMod

import typings.atPulumiAws.Anon_AlarmName
import typings.atPulumiAws.Anon_BucketName
import typings.atPulumiAws.Anon_DeliveryStreamName
import typings.atPulumiAws.Anon_EndpointIdIndex
import typings.atPulumiAws.Anon_FunctionArn
import typings.atPulumiAws.Anon_HashKeyField
import typings.atPulumiAws.Anon_MessageFormat
import typings.atPulumiAws.Anon_MetricName
import typings.atPulumiAws.Anon_PartitionKey
import typings.atPulumiAws.Anon_QueueUrl
import typings.atPulumiAws.Anon_RoleArn
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val arn: Output[String] = js.native
  val cloudwatchAlarm: Output[js.UndefOr[Anon_AlarmName]] = js.native
  val cloudwatchMetric: Output[js.UndefOr[Anon_MetricName]] = js.native
  /**
    * The description of the rule.
    */
  val description: Output[js.UndefOr[String]] = js.native
  val dynamodb: Output[js.UndefOr[Anon_HashKeyField]] = js.native
  val elasticsearch: Output[js.UndefOr[Anon_EndpointIdIndex]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: Output[Boolean] = js.native
  val firehose: Output[js.UndefOr[Anon_DeliveryStreamName]] = js.native
  val kinesis: Output[js.UndefOr[Anon_PartitionKey]] = js.native
  val lambda: Output[js.UndefOr[Anon_FunctionArn]] = js.native
  /**
    * The name of the rule.
    */
  val name: Output[String] = js.native
  val republish: Output[js.UndefOr[Anon_RoleArn]] = js.native
  val s3: Output[js.UndefOr[Anon_BucketName]] = js.native
  val sns: Output[js.UndefOr[Anon_MessageFormat]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: Output[String] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: Output[String] = js.native
  val sqs: Output[js.UndefOr[Anon_QueueUrl]] = js.native
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
  def get(name: String, id: Input[ID]): TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState): TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): TopicRule = js.native
  /**
    * Returns true if the given object is an instance of TopicRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
}

