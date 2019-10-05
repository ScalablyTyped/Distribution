package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchema extends js.Object {
  var recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]]
  var recordEncoding: js.UndefOr[Input[String]] = js.undefined
  var recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
}

object AnalyticsApplicationReferenceDataSourcesSchema {
  @scala.inline
  def apply(
    recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]],
    recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat],
    recordEncoding: Input[String] = null
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
}

