package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSources extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The S3 configuration for the reference data source. See S3 Reference below for more details.
    */
  var s3: Input[AnalyticsApplicationReferenceDataSourcesS3] = js.native
  
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationReferenceDataSourcesSchema] = js.native
  
  /**
    * The in-application Table Name.
    */
  var tableName: Input[String] = js.native
}
object AnalyticsApplicationReferenceDataSources {
  
  @scala.inline
  def apply(
    s3: Input[AnalyticsApplicationReferenceDataSourcesS3],
    schema: Input[AnalyticsApplicationReferenceDataSourcesSchema],
    tableName: Input[String]
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesMutableBuilder[Self <: AnalyticsApplicationReferenceDataSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setS3(value: Input[AnalyticsApplicationReferenceDataSourcesS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Input[AnalyticsApplicationReferenceDataSourcesSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
