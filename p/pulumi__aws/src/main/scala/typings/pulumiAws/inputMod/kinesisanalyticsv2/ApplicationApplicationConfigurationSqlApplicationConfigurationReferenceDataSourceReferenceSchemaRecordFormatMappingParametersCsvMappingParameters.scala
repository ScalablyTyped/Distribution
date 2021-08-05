package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters extends StObject {
  
  /**
    * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
    */
  var recordColumnDelimiter: Input[String]
  
  /**
    * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
    */
  var recordRowDelimiter: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters {
  
  inline def apply(recordColumnDelimiter: Input[String], recordRowDelimiter: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters](x: Self) {
    
    inline def setRecordColumnDelimiter(value: Input[String]): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordRowDelimiter(value: Input[String]): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
