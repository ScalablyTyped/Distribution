package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters extends StObject {
  
  /**
    * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
    */
  var recordColumnDelimiter: String
  
  /**
    * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
    */
  var recordRowDelimiter: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters {
  
  @scala.inline
  def apply(recordColumnDelimiter: String, recordRowDelimiter: String): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumnDelimiter(value: String): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordRowDelimiter(value: String): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
