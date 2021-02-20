package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv] = js.native
  
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] = js.native
}
object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersMutableBuilder[Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    @scala.inline
    def setJson(value: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
