package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchema extends js.Object {
  var recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn]
  var recordEncoding: js.UndefOr[String] = js.undefined
  var recordFormat: AnalyticsApplicationInputsSchemaRecordFormat
}

object AnalyticsApplicationInputsSchema {
  @scala.inline
  def apply(
    recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn],
    recordFormat: AnalyticsApplicationInputsSchemaRecordFormat,
    recordEncoding: String = null
  ): AnalyticsApplicationInputsSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns, recordFormat = recordFormat)
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding)
    __obj.asInstanceOf[AnalyticsApplicationInputsSchema]
  }
}

