package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordFormat extends StObject {
  
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters] = js.undefined
  
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: String
}
object AnalyticsApplicationInputsSchemaRecordFormat {
  
  inline def apply(recordFormatType: String): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
  
  extension [Self <: AnalyticsApplicationInputsSchemaRecordFormat](x: Self) {
    
    inline def setMappingParameters(value: AnalyticsApplicationInputsSchemaRecordFormatMappingParameters): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    inline def setMappingParametersUndefined: Self = StObject.set(x, "mappingParameters", js.undefined)
    
    inline def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
