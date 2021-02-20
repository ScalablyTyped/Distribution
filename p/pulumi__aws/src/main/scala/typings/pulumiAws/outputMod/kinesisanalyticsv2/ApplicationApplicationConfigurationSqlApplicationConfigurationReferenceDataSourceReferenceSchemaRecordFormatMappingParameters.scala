package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var csvMappingParameters: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters
  ] = js.native
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var jsonMappingParameters: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters
  ] = js.native
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
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters
    ): Self = StObject.set(x, "csvMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvMappingParametersUndefined: Self = StObject.set(x, "csvMappingParameters", js.undefined)
    
    @scala.inline
    def setJsonMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters
    ): Self = StObject.set(x, "jsonMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonMappingParametersUndefined: Self = StObject.set(x, "jsonMappingParameters", js.undefined)
  }
}
