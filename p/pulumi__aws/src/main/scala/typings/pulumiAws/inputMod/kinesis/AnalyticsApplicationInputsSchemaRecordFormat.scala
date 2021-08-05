package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordFormat extends StObject {
  
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]] = js.undefined
  
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[Input[String]] = js.undefined
}
object AnalyticsApplicationInputsSchemaRecordFormat {
  
  inline def apply(): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
  
  extension [Self <: AnalyticsApplicationInputsSchemaRecordFormat](x: Self) {
    
    inline def setMappingParameters(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    inline def setMappingParametersUndefined: Self = StObject.set(x, "mappingParameters", js.undefined)
    
    inline def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatTypeUndefined: Self = StObject.set(x, "recordFormatType", js.undefined)
  }
}
