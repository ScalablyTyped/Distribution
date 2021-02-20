package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var csvMappingParameters: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters
    ]
  ] = js.native
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var jsonMappingParameters: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters
    ]
  ] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvMappingParameters(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters
        ]
    ): Self = StObject.set(x, "csvMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvMappingParametersUndefined: Self = StObject.set(x, "csvMappingParameters", js.undefined)
    
    @scala.inline
    def setJsonMappingParameters(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters
        ]
    ): Self = StObject.set(x, "jsonMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonMappingParametersUndefined: Self = StObject.set(x, "jsonMappingParameters", js.undefined)
  }
}
