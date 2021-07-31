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
  
  @scala.inline
  def apply(recordColumnDelimiter: String, recordRowDelimiter: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvMutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumnDelimiter(value: String): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordRowDelimiter(value: String): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
