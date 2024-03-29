package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchema extends StObject {
  
  /**
    * The Record Column mapping for the streaming source data element.
    * See Record Columns below for more details.
    */
  var recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]]
  
  /**
    * The Encoding of the record in the streaming source.
    */
  var recordEncoding: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Record Format and mapping information to schematize a record.
    * See Record Format below for more details.
    */
  var recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
}
object AnalyticsApplicationReferenceDataSourcesSchema {
  
  inline def apply(
    recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]],
    recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchema](x: Self) {
    
    inline def setRecordColumns(value: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]]): Self = StObject.set(x, "recordColumns", value.asInstanceOf[js.Any])
    
    inline def setRecordColumnsVarargs(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]*): Self = StObject.set(x, "recordColumns", js.Array(value :_*))
    
    inline def setRecordEncoding(value: Input[String]): Self = StObject.set(x, "recordEncoding", value.asInstanceOf[js.Any])
    
    inline def setRecordEncodingUndefined: Self = StObject.set(x, "recordEncoding", js.undefined)
    
    inline def setRecordFormat(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
  }
}
