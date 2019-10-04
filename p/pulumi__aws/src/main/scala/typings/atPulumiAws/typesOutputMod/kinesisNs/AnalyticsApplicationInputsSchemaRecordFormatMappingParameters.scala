package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends js.Object {
  var csv: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv] = js.undefined
  var json: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] = js.undefined
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv = null,
    json: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = null
  ): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
}

