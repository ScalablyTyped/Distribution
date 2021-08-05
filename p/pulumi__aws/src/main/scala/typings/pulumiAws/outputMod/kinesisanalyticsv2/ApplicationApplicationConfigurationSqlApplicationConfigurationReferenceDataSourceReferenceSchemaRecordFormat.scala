package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat extends StObject {
  
  /**
    * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters
  
  /**
    * The type of record format. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat {
  
  inline def apply(
    mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters,
    recordFormatType: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(mappingParameters = mappingParameters.asInstanceOf[js.Any], recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat](x: Self) {
    
    inline def setMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters
    ): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
