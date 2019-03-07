package typings
package atPulumiAwsLib.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/stream", "Stream")
@js.native
class Stream protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Stream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StreamArgs) = this()
  def this(name: java.lang.String, args: StreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
    */
  val encryptionType: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias aws/kinesis.
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
    */
  val retentionPeriod: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The number of shards that the stream will use.
    * Amazon has guidlines for specifying the Stream size that should be referenced
    * when creating a Kinesis stream. See [Amazon Kinesis Streams][2] for more.
    */
  val shardCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch][3] for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
    */
  val shardLevelMetrics: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Creates a new subscription to events fired from this Stream to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler,
    args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
  ): atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler,
    args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/kinesis/stream", "Stream")
@js.native
object Stream extends js.Object {
  /**
    * Get an existing Stream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisStreamMod.Stream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisStreamMod.StreamState
  ): atPulumiAwsLib.kinesisStreamMod.Stream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisStreamMod.StreamState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kinesisStreamMod.Stream = js.native
}

