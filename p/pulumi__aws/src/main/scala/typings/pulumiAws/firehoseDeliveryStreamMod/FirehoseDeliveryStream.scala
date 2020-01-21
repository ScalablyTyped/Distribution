package typings.pulumiAws.firehoseDeliveryStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val arn: Output_[String] = js.native
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: Output_[String] = js.native
  val destinationId: Output_[String] = js.native
  /**
    * Configuration options if elasticsearch is the destination. More details are given below.
    */
  val elasticsearchConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: Output_[String] = js.native
  /**
    * Configuration options if redshift is the destination.
    * Using `redshiftConfiguration` requires the user to also specify a
    * `s3Configuration` block. More details are given below.
    */
  val redshiftConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
  /**
    * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamS3Configuration]] = js.native
  /**
    * Encrypt at rest options.
    * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
    */
  val serverSideEncryption: Output_[js.UndefOr[FirehoseDeliveryStreamServerSideEncryption]] = js.native
  val splunkConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: Output_[String] = js.native
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

