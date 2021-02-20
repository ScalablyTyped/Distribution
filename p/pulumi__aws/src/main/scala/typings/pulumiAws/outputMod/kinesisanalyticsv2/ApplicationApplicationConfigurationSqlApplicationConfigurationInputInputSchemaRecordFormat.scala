package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat extends StObject {
  
  /**
    * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters = js.native
  
  /**
    * The type of record format. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat {
  
  @scala.inline
  def apply(
    mappingParameters: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters,
    recordFormatType: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(mappingParameters = mappingParameters.asInstanceOf[js.Any], recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters
    ): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
