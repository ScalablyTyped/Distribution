package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CsvJson extends js.Object {
  var csv: js.UndefOr[Input[Anon_RecordColumnDelimiterRecordRowDelimiter]] = js.undefined
  var json: js.UndefOr[Input[Anon_RecordRowPathInput]] = js.undefined
}

object Anon_CsvJson {
  @scala.inline
  def apply(
    csv: Input[Anon_RecordColumnDelimiterRecordRowDelimiter] = null,
    json: Input[Anon_RecordRowPathInput] = null
  ): Anon_CsvJson = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CsvJson]
  }
}

