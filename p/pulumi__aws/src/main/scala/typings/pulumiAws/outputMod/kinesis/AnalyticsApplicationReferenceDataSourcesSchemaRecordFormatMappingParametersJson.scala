package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: String
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
  
  inline def apply(recordRowPath: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson](x: Self) {
    
    inline def setRecordRowPath(value: String): Self = StObject.set(x, "recordRowPath", value.asInstanceOf[js.Any])
  }
}
