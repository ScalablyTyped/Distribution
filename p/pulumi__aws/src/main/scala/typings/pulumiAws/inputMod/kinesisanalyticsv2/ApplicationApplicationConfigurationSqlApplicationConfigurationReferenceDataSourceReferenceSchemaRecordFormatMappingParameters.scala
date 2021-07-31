package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var csvMappingParameters: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters
    ]
  ] = js.undefined
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var jsonMappingParameters: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters
    ]
  ] = js.undefined
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvMappingParameters(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters
        ]
    ): Self = StObject.set(x, "csvMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvMappingParametersUndefined: Self = StObject.set(x, "csvMappingParameters", js.undefined)
    
    @scala.inline
    def setJsonMappingParameters(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters
        ]
    ): Self = StObject.set(x, "jsonMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonMappingParametersUndefined: Self = StObject.set(x, "jsonMappingParameters", js.undefined)
  }
}
