package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer extends js.Object {
  /**
    * Nested argument that specifies the native Hive / HCatalog JsonSerDe. More details below.
    */
  var hiveJsonSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
  ] = js.undefined
  /**
    * Nested argument that specifies the OpenX SerDe. More details below.
    */
  var openXJsonSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
  ] = js.undefined
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer {
  @scala.inline
  def apply(
    hiveJsonSerDe: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe = null,
    openXJsonSerDe: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer = {
    val __obj = js.Dynamic.literal()
    if (hiveJsonSerDe != null) __obj.updateDynamic("hiveJsonSerDe")(hiveJsonSerDe)
    if (openXJsonSerDe != null) __obj.updateDynamic("openXJsonSerDe")(openXJsonSerDe)
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer]
  }
}

