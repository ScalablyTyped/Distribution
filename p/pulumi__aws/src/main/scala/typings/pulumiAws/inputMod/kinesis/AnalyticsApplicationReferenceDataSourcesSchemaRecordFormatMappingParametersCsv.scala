package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv extends StObject {
  
  /**
    * The Column Delimiter.
    */
  var recordColumnDelimiter: Input[String]
  
  /**
    * The Row Delimiter.
    */
  var recordRowDelimiter: Input[String]
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv {
  
  inline def apply(recordColumnDelimiter: Input[String], recordRowDelimiter: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv](x: Self) {
    
    inline def setRecordColumnDelimiter(value: Input[String]): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordRowDelimiter(value: Input[String]): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
