package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends StObject {
  
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] = js.undefined
  
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] = js.undefined
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
  
  @scala.inline
  def apply(): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersMutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    @scala.inline
    def setJson(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
