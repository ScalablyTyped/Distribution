package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParameters extends js.Object {
  /**
    * Mapping information when the record format uses delimiters.
    * See CSV Mapping Parameters below for more details.
    */
  var csv: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]] = js.native
  /**
    * Mapping information when JSON is the record format on the streaming source.
    * See JSON Mapping Parameters below for more details.
    */
  var json: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]] = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
  @scala.inline
  def apply(): AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersOps[Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCsv(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    @scala.inline
    def setJson(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
  
}

