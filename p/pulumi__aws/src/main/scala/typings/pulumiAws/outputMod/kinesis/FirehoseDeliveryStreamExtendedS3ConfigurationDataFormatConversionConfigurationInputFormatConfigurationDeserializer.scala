package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer extends js.Object {
  /**
    * Nested argument that specifies the native Hive / HCatalog JsonSerDe. More details below.
    */
  var hiveJsonSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
  ] = js.native
  /**
    * Nested argument that specifies the OpenX SerDe. More details below.
    */
  var openXJsonSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
  ] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer {
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer] (val x: Self) extends AnyVal {
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
    def setHiveJsonSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
    ): Self = this.set("hiveJsonSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiveJsonSerDe: Self = this.set("hiveJsonSerDe", js.undefined)
    @scala.inline
    def setOpenXJsonSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
    ): Self = this.set("openXJsonSerDe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenXJsonSerDe: Self = this.set("openXJsonSerDe", js.undefined)
  }
  
}

