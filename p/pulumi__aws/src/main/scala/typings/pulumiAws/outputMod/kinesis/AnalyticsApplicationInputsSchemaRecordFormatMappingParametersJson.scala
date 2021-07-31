package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: String
}
object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
  
  @scala.inline
  def apply(recordRowPath: String): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonMutableBuilder[Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordRowPath(value: String): Self = StObject.set(x, "recordRowPath", value.asInstanceOf[js.Any])
  }
}
