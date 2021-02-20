package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsSchema extends StObject {
  
  /**
    * The Record Column mapping for the streaming source data element.
    * See Record Columns below for more details.
    */
  var recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn] = js.native
  
  /**
    * The Encoding of the record in the streaming source.
    */
  var recordEncoding: js.UndefOr[String] = js.native
  
  /**
    * The Record Format and mapping information to schematize a record.
    * See Record Format below for more details.
    */
  var recordFormat: AnalyticsApplicationInputsSchemaRecordFormat = js.native
}
object AnalyticsApplicationInputsSchema {
  
  @scala.inline
  def apply(
    recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn],
    recordFormat: AnalyticsApplicationInputsSchemaRecordFormat
  ): AnalyticsApplicationInputsSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchema]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaMutableBuilder[Self <: AnalyticsApplicationInputsSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumns(value: js.Array[AnalyticsApplicationInputsSchemaRecordColumn]): Self = StObject.set(x, "recordColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordColumnsVarargs(value: AnalyticsApplicationInputsSchemaRecordColumn*): Self = StObject.set(x, "recordColumns", js.Array(value :_*))
    
    @scala.inline
    def setRecordEncoding(value: String): Self = StObject.set(x, "recordEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordEncodingUndefined: Self = StObject.set(x, "recordEncoding", js.undefined)
    
    @scala.inline
    def setRecordFormat(value: AnalyticsApplicationInputsSchemaRecordFormat): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
  }
}
