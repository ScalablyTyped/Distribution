package typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_BucketArnBufferInterval
import typings.atPulumiAws.Anon_BucketArnBufferIntervalBufferSize
import typings.atPulumiAws.Anon_BufferingInterval
import typings.atPulumiAws.Anon_CloudwatchLoggingOptions
import typings.atPulumiAws.Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout
import typings.atPulumiAws.Anon_KinesisStreamArn
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
@js.native
class FirehoseDeliveryStream protected () extends CustomResource {
  /**
    * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
  def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: Output[String] = js.native
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: Output[String] = js.native
  val destinationId: Output[String] = js.native
  val elasticsearchConfiguration: Output[js.UndefOr[Anon_BufferingInterval]] = js.native
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: Output[js.UndefOr[Anon_BucketArnBufferIntervalBufferSize]] = js.native
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: Output[js.UndefOr[Anon_KinesisStreamArn]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: Output[String] = js.native
  /**
    * Configuration options if redshift is the destination.
    * Using `redshift_configuration` requires the user to also specify a
    * `s3_configuration` block. More details are given below.
    */
  val redshiftConfiguration: Output[js.UndefOr[Anon_CloudwatchLoggingOptions]] = js.native
  /**
    * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: Output[js.UndefOr[Anon_BucketArnBufferInterval]] = js.native
  val splunkConfiguration: Output[js.UndefOr[Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): FirehoseDeliveryStream = js.native
  /**
    * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
}

