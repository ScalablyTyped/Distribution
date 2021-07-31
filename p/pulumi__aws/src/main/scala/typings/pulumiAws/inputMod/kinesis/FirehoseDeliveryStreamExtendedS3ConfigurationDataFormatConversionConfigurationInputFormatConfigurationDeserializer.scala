package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer extends StObject {
  
  /**
    * Nested argument that specifies the native Hive / HCatalog JsonSerDe. More details below.
    */
  var hiveJsonSerDe: js.UndefOr[
    Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
    ]
  ] = js.undefined
  
  /**
    * Nested argument that specifies the OpenX SerDe. More details below.
    */
  var openXJsonSerDe: js.UndefOr[
    Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
    ]
  ] = js.undefined
}
object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHiveJsonSerDe(
      value: Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
        ]
    ): Self = StObject.set(x, "hiveJsonSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiveJsonSerDeUndefined: Self = StObject.set(x, "hiveJsonSerDe", js.undefined)
    
    @scala.inline
    def setOpenXJsonSerDe(
      value: Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
        ]
    ): Self = StObject.set(x, "openXJsonSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenXJsonSerDeUndefined: Self = StObject.set(x, "openXJsonSerDe", js.undefined)
  }
}
