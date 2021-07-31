package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: Input[String]
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
  
  @scala.inline
  def apply(recordRowPath: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonMutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordRowPath(value: Input[String]): Self = StObject.set(x, "recordRowPath", value.asInstanceOf[js.Any])
  }
}
