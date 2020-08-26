package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer extends js.Object {
  /**
    * Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
    */
  var orcSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe
  ] = js.native
  /**
    * Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
    */
  var parquetSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe
  ] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer {
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer] (val x: Self) extends AnyVal {
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
    def setOrcSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe
    ): Self = this.set("orcSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrcSerDe: Self = this.set("orcSerDe", js.undefined)
    @scala.inline
    def setParquetSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe
    ): Self = this.set("parquetSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquetSerDe: Self = this.set("parquetSerDe", js.undefined)
  }
  
}

