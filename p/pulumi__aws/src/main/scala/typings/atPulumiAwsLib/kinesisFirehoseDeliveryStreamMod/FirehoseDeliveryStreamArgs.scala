package typings
package atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val destinationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val elasticsearchConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BufferingIntervalBufferingSize]
  ] = js.undefined
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat
    ]
  ] = js.undefined
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KinesisStreamArnRoleArn]] = js.undefined
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration options if redshift is the destination.
    * Using `redshift_configuration` requires the user to also specify a
    * `s3_configuration` block. More details are given below.
    */
  val redshiftConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLoggingOptionsClusterJdbcurl]
  ] = js.undefined
  /**
    * Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  val splunkConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object FirehoseDeliveryStreamArgs {
  @scala.inline
  def apply(
    destination: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    destinationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    elasticsearchConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BufferingIntervalBufferingSize] = null,
    extendedS3Configuration: atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat
    ] = null,
    kinesisSourceConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KinesisStreamArnRoleArn] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    redshiftConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLoggingOptionsClusterJdbcurl] = null,
    s3Configuration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    splunkConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    versionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): FirehoseDeliveryStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (destinationId != null) __obj.updateDynamic("destinationId")(destinationId.asInstanceOf[js.Any])
    if (elasticsearchConfiguration != null) __obj.updateDynamic("elasticsearchConfiguration")(elasticsearchConfiguration.asInstanceOf[js.Any])
    if (extendedS3Configuration != null) __obj.updateDynamic("extendedS3Configuration")(extendedS3Configuration.asInstanceOf[js.Any])
    if (kinesisSourceConfiguration != null) __obj.updateDynamic("kinesisSourceConfiguration")(kinesisSourceConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (redshiftConfiguration != null) __obj.updateDynamic("redshiftConfiguration")(redshiftConfiguration.asInstanceOf[js.Any])
    if (s3Configuration != null) __obj.updateDynamic("s3Configuration")(s3Configuration.asInstanceOf[js.Any])
    if (splunkConfiguration != null) __obj.updateDynamic("splunkConfiguration")(splunkConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamArgs]
  }
}

