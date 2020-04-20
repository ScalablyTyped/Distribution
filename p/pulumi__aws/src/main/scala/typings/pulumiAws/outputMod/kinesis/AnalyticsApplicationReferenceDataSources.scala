package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSources extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  /**
    * The S3 configuration for the reference data source. See S3 Reference below for more details.
    */
  var s3: AnalyticsApplicationReferenceDataSourcesS3 = js.native
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: AnalyticsApplicationReferenceDataSourcesSchema = js.native
  /**
    * The in-application Table Name.
    */
  var tableName: String = js.native
}

object AnalyticsApplicationReferenceDataSources {
  @scala.inline
  def apply(
    id: String,
    s3: AnalyticsApplicationReferenceDataSourcesS3,
    schema: AnalyticsApplicationReferenceDataSourcesSchema,
    tableName: String
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
}

