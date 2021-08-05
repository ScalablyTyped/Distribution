package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat extends StObject {
  
  /**
    * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters
  
  /**
    * The type of record format. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat {
  
  inline def apply(
    mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters,
    recordFormatType: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(mappingParameters = mappingParameters.asInstanceOf[js.Any], recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat](x: Self) {
    
    inline def setMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters
    ): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
