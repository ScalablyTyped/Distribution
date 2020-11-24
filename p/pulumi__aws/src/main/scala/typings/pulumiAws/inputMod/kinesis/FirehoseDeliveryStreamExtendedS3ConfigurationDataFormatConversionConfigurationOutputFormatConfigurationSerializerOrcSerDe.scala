package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe extends js.Object {
  
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var blockSizeBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A list of column names for which you want Kinesis Data Firehose to create bloom filters.
    */
  var bloomFilterColumns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is `0.05`, the minimum is `0`, and the maximum is `1`.
    */
  var bloomFilterFalsePositiveProbability: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
    */
  var compression: js.UndefOr[Input[String]] = js.native
  
  /**
    * A float that represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to `1`.
    */
  var dictionaryKeyThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Set this to `true` to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `false`.
    */
  var enablePadding: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The version of the file to write. The possible values are `V0_11` and `V0_12`. The default is `V0_12`.
    */
  var formatVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * A float between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is `0.05`, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when `enablePadding` is `false`.
    */
  var paddingTolerance: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of rows between index entries. The default is `10000` and the minimum is `1000`.
    */
  var rowIndexStride: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
    */
  var stripeSizeBytes: js.UndefOr[Input[Double]] = js.native
}
object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe] (val x: Self) extends AnyVal {
    
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
    def setBloomFilterColumnsVarargs(value: Input[String]*): Self = this.set("bloomFilterColumns", js.Array(value :_*))
    
    @scala.inline
    def setBloomFilterColumns(value: Input[js.Array[Input[String]]]): Self = this.set("bloomFilterColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBloomFilterColumns: Self = this.set("bloomFilterColumns", js.undefined)
    
    @scala.inline
    def setBloomFilterFalsePositiveProbability(value: Input[Double]): Self = this.set("bloomFilterFalsePositiveProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBloomFilterFalsePositiveProbability: Self = this.set("bloomFilterFalsePositiveProbability", js.undefined)
    
    @scala.inline
    def setCompression(value: Input[String]): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setDictionaryKeyThreshold(value: Input[Double]): Self = this.set("dictionaryKeyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryKeyThreshold: Self = this.set("dictionaryKeyThreshold", js.undefined)
    
    @scala.inline
    def setEnablePadding(value: Input[Boolean]): Self = this.set("enablePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePadding: Self = this.set("enablePadding", js.undefined)
    
    @scala.inline
    def setFormatVersion(value: Input[String]): Self = this.set("formatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatVersion: Self = this.set("formatVersion", js.undefined)
    
    @scala.inline
    def setPaddingTolerance(value: Input[Double]): Self = this.set("paddingTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTolerance: Self = this.set("paddingTolerance", js.undefined)
    
    @scala.inline
    def setRowIndexStride(value: Input[Double]): Self = this.set("rowIndexStride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndexStride: Self = this.set("rowIndexStride", js.undefined)
    
    @scala.inline
    def setStripeSizeBytes(value: Input[Double]): Self = this.set("stripeSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripeSizeBytes: Self = this.set("stripeSizeBytes", js.undefined)
  }
}
