package typings.pulumiAws.firehoseDeliveryStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: js.UndefOr[Input[String]] = js.native
  val destinationId: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration options if elasticsearch is the destination. More details are given below.
    */
  val elasticsearchConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration options if redshift is the destination.
    * Using `redshiftConfiguration` requires the user to also specify a
    * `s3Configuration` block. More details are given below.
    */
  val redshiftConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
  /**
    * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamS3Configuration]] = js.native
  /**
    * Encrypt at rest options.
    * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
    */
  val serverSideEncryption: js.UndefOr[Input[FirehoseDeliveryStreamServerSideEncryption]] = js.native
  val splunkConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    destination: Input[String] = null,
    destinationId: Input[String] = null,
    elasticsearchConfiguration: Input[FirehoseDeliveryStreamElasticsearchConfiguration] = null,
    extendedS3Configuration: Input[FirehoseDeliveryStreamExtendedS3Configuration] = null,
    kinesisSourceConfiguration: Input[FirehoseDeliveryStreamKinesisSourceConfiguration] = null,
    name: Input[String] = null,
    redshiftConfiguration: Input[FirehoseDeliveryStreamRedshiftConfiguration] = null,
    s3Configuration: Input[FirehoseDeliveryStreamS3Configuration] = null,
    serverSideEncryption: Input[FirehoseDeliveryStreamServerSideEncryption] = null,
    splunkConfiguration: Input[FirehoseDeliveryStreamSplunkConfiguration] = null,
    tags: Input[StringDictionary[_]] = null,
    versionId: Input[String] = null
  ): FirehoseDeliveryStreamState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (destinationId != null) __obj.updateDynamic("destinationId")(destinationId.asInstanceOf[js.Any])
    if (elasticsearchConfiguration != null) __obj.updateDynamic("elasticsearchConfiguration")(elasticsearchConfiguration.asInstanceOf[js.Any])
    if (extendedS3Configuration != null) __obj.updateDynamic("extendedS3Configuration")(extendedS3Configuration.asInstanceOf[js.Any])
    if (kinesisSourceConfiguration != null) __obj.updateDynamic("kinesisSourceConfiguration")(kinesisSourceConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (redshiftConfiguration != null) __obj.updateDynamic("redshiftConfiguration")(redshiftConfiguration.asInstanceOf[js.Any])
    if (s3Configuration != null) __obj.updateDynamic("s3Configuration")(s3Configuration.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (splunkConfiguration != null) __obj.updateDynamic("splunkConfiguration")(splunkConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamState]
  }
}

