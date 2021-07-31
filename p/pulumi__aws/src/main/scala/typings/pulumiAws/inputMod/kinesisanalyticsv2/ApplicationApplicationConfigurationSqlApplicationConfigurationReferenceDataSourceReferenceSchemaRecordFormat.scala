package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat extends StObject {
  
  /**
    * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var mappingParameters: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters
  ]
  
  /**
    * The type of record format. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat {
  
  @scala.inline
  def apply(
    mappingParameters: Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters
    ],
    recordFormatType: Input[String]
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(mappingParameters = mappingParameters.asInstanceOf[js.Any], recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappingParameters(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters
        ]
    ): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
