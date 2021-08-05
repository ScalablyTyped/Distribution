package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]] = js.undefined
  
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]] = js.undefined
}
object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  
  inline def apply(): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
  
  extension [Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParameters](x: Self) {
    
    inline def setCsv(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setJson(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
