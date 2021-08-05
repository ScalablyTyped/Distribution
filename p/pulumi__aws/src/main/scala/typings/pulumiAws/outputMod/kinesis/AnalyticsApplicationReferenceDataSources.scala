package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSources extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  
  /**
    * The S3 configuration for the reference data source. See S3 Reference below for more details.
    */
  var s3: AnalyticsApplicationReferenceDataSourcesS3
  
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: AnalyticsApplicationReferenceDataSourcesSchema
  
  /**
    * The in-application Table Name.
    */
  var tableName: String
}
object AnalyticsApplicationReferenceDataSources {
  
  inline def apply(
    id: String,
    s3: AnalyticsApplicationReferenceDataSourcesS3,
    schema: AnalyticsApplicationReferenceDataSourcesSchema,
    tableName: String
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSources](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setS3(value: AnalyticsApplicationReferenceDataSourcesS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: AnalyticsApplicationReferenceDataSourcesSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
