package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends js.Object {
  var csv: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] = js.undefined
  var json: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] = js.undefined
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = null,
    json: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  }
}

