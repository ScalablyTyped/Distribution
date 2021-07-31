package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters extends StObject {
  
  /**
    * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
    */
  var recordColumnDelimiter: String
  
  /**
    * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
    */
  var recordRowDelimiter: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters {
  
  @scala.inline
  def apply(recordColumnDelimiter: String, recordRowDelimiter: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumnDelimiter(value: String): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordRowDelimiter(value: String): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
