package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends js.Object {
  var csv: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]] = js.undefined
  var json: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]] = js.undefined
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(
    csv: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv] = null,
    json: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] = null
  ): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
}

