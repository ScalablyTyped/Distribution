package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends js.Object {
  var csv: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] = js.native
  var json: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = null,
    json: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  }
}

