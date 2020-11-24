package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe extends js.Object {
  
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var blockSizeBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
    */
  var compression: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether to enable dictionary compression.
    */
  var enableDictionaryCompression: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
    */
  var maxPaddingBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
    */
  var pageSizeBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
    */
  var writerVersion: js.UndefOr[Input[String]] = js.native
}
object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockSizeBytes(value: Input[Double]): Self = this.set("blockSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSizeBytes: Self = this.set("blockSizeBytes", js.undefined)
    
    @scala.inline
    def setCompression(value: Input[String]): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setEnableDictionaryCompression(value: Input[Boolean]): Self = this.set("enableDictionaryCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDictionaryCompression: Self = this.set("enableDictionaryCompression", js.undefined)
    
    @scala.inline
    def setMaxPaddingBytes(value: Input[Double]): Self = this.set("maxPaddingBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPaddingBytes: Self = this.set("maxPaddingBytes", js.undefined)
    
    @scala.inline
    def setPageSizeBytes(value: Input[Double]): Self = this.set("pageSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeBytes: Self = this.set("pageSizeBytes", js.undefined)
    
    @scala.inline
    def setWriterVersion(value: Input[String]): Self = this.set("writerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriterVersion: Self = this.set("writerVersion", js.undefined)
  }
}
