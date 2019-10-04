package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSources extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  var s3: AnalyticsApplicationReferenceDataSourcesS3
  var schema: AnalyticsApplicationReferenceDataSourcesSchema
  var tableName: String
}

object AnalyticsApplicationReferenceDataSources {
  @scala.inline
  def apply(
    id: String,
    s3: AnalyticsApplicationReferenceDataSourcesS3,
    schema: AnalyticsApplicationReferenceDataSourcesSchema,
    tableName: String
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(id = id, s3 = s3, schema = schema, tableName = tableName)
  
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
}

