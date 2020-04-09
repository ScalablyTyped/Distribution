package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends js.Object {
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv] = js.native
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv = null,
    json: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = null
  ): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
}

