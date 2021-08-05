package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer extends StObject {
  
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
  
  inline def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer]
  }
  
  extension [Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer](x: Self) {
    
    inline def setHiveJsonSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDe
    ): Self = StObject.set(x, "hiveJsonSerDe", value.asInstanceOf[js.Any])
    
    inline def setHiveJsonSerDeUndefined: Self = StObject.set(x, "hiveJsonSerDe", js.undefined)
    
    inline def setOpenXJsonSerDe(
      value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe
    ): Self = StObject.set(x, "openXJsonSerDe", value.asInstanceOf[js.Any])
    
    inline def setOpenXJsonSerDeUndefined: Self = StObject.set(x, "openXJsonSerDe", js.undefined)
  }
}
