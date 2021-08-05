package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  ] = js.undefined
  
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  ] = js.undefined
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
  
  inline def apply(): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters](x: Self) {
    
    inline def setCsv(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setJson(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
