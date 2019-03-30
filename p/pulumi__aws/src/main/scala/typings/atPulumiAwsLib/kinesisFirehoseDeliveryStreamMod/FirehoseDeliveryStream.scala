package typings
package atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
@js.native
class FirehoseDeliveryStream protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: FirehoseDeliveryStreamArgs) = this()
  def this(name: java.lang.String, args: FirehoseDeliveryStreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val destinationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val elasticsearchConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BufferingInterval]] = js.native
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketArnBufferIntervalBufferSize]] = js.native
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_KinesisStreamArn]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration options if redshift is the destination.
    * Using `redshift_configuration` requires the user to also specify a
    * `s3_configuration` block. More details are given below.
    */
  val redshiftConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CloudwatchLoggingOptions]] = js.native
  /**
    * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketArnBufferInterval]] = js.native
  val splunkConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
@js.native
object FirehoseDeliveryStream extends js.Object {
  /**
    * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState
  ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
}

