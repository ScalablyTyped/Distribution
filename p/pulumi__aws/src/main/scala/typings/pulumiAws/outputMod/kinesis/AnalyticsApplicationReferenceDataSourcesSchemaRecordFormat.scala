package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends StObject {
  
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] = js.undefined
  
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: String
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  
  inline def apply(recordFormatType: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat](x: Self) {
    
    inline def setMappingParameters(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    inline def setMappingParametersUndefined: Self = StObject.set(x, "mappingParameters", js.undefined)
    
    inline def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
