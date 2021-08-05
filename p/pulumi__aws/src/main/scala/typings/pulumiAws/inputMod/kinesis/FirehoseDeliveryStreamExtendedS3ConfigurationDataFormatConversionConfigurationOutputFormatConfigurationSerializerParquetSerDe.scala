package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe extends StObject {
  
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
  
  inline def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe]
  }
  
  extension [Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe](x: Self) {
    
    inline def setBlockSizeBytes(value: Input[Double]): Self = StObject.set(x, "blockSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeBytesUndefined: Self = StObject.set(x, "blockSizeBytes", js.undefined)
    
    inline def setCompression(value: Input[String]): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setEnableDictionaryCompression(value: Input[Boolean]): Self = StObject.set(x, "enableDictionaryCompression", value.asInstanceOf[js.Any])
    
    inline def setEnableDictionaryCompressionUndefined: Self = StObject.set(x, "enableDictionaryCompression", js.undefined)
    
    inline def setMaxPaddingBytes(value: Input[Double]): Self = StObject.set(x, "maxPaddingBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxPaddingBytesUndefined: Self = StObject.set(x, "maxPaddingBytes", js.undefined)
    
    inline def setPageSizeBytes(value: Input[Double]): Self = StObject.set(x, "pageSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setPageSizeBytesUndefined: Self = StObject.set(x, "pageSizeBytes", js.undefined)
    
    inline def setWriterVersion(value: Input[String]): Self = StObject.set(x, "writerVersion", value.asInstanceOf[js.Any])
    
    inline def setWriterVersionUndefined: Self = StObject.set(x, "writerVersion", js.undefined)
  }
}
