package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters extends js.Object {
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  ] = js.native
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  ] = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] = null,
    json: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  }
}

