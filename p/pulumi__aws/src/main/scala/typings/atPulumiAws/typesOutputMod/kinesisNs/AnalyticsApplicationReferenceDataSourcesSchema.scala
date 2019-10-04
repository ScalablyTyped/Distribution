package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchema extends js.Object {
  var recordColumns: js.Array[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  var recordEncoding: js.UndefOr[String] = js.undefined
  var recordFormat: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat
}

object AnalyticsApplicationReferenceDataSourcesSchema {
  @scala.inline
  def apply(
    recordColumns: js.Array[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn],
    recordFormat: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat,
    recordEncoding: String = null
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns, recordFormat = recordFormat)
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding)
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
}

