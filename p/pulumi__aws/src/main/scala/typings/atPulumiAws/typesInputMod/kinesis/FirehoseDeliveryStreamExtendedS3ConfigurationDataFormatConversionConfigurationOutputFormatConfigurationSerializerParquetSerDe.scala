package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe extends js.Object {
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var blockSizeBytes: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
    */
  var compression: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicates whether to enable dictionary compression.
    */
  var enableDictionaryCompression: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
    */
  var maxPaddingBytes: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
    */
  var pageSizeBytes: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
    */
  var writerVersion: js.UndefOr[Input[String]] = js.undefined
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe {
  @scala.inline
  def apply(
    blockSizeBytes: Input[Double] = null,
    compression: Input[String] = null,
    enableDictionaryCompression: Input[Boolean] = null,
    maxPaddingBytes: Input[Double] = null,
    pageSizeBytes: Input[Double] = null,
    writerVersion: Input[String] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (enableDictionaryCompression != null) __obj.updateDynamic("enableDictionaryCompression")(enableDictionaryCompression.asInstanceOf[js.Any])
    if (maxPaddingBytes != null) __obj.updateDynamic("maxPaddingBytes")(maxPaddingBytes.asInstanceOf[js.Any])
    if (pageSizeBytes != null) __obj.updateDynamic("pageSizeBytes")(pageSizeBytes.asInstanceOf[js.Any])
    if (writerVersion != null) __obj.updateDynamic("writerVersion")(writerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe]
  }
}

