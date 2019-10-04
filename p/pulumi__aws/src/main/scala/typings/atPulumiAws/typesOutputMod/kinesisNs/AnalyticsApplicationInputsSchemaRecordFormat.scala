package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters] = js.undefined
  var recordFormatType: String
}

object AnalyticsApplicationInputsSchemaRecordFormat {
  @scala.inline
  def apply(
    recordFormatType: String,
    mappingParameters: AnalyticsApplicationInputsSchemaRecordFormatMappingParameters = null
  ): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType)
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters)
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
}

