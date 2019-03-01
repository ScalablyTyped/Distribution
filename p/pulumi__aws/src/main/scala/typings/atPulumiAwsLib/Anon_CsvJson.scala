package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CsvJson extends js.Object {
  var csv: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnDelimiterRecordRowDelimiter]] = js.undefined
  var json: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_RecordRowPathInput]] = js.undefined
}

object Anon_CsvJson {
  @scala.inline
  def apply(
    csv: atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnDelimiterRecordRowDelimiter] = null,
    json: atPulumiPulumiLib.outputMod.Input[Anon_RecordRowPathInput] = null
  ): Anon_CsvJson = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CsvJson]
  }
}

