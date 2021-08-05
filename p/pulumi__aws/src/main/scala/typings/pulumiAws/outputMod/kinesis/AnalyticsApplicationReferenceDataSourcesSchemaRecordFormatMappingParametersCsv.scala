package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv extends StObject {
  
  /**
    * The Column Delimiter.
    */
  var recordColumnDelimiter: String
  
  /**
    * The Row Delimiter.
    */
  var recordRowDelimiter: String
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv {
  
  inline def apply(recordColumnDelimiter: String, recordRowDelimiter: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv](x: Self) {
    
    inline def setRecordColumnDelimiter(value: String): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordRowDelimiter(value: String): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
