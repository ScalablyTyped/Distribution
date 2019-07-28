package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Csv extends js.Object {
  var csv: js.UndefOr[Anon_RecordColumnDelimiter] = js.undefined
  var json: js.UndefOr[Anon_RecordRowPath] = js.undefined
}

object Anon_Csv {
  @scala.inline
  def apply(csv: Anon_RecordColumnDelimiter = null, json: Anon_RecordRowPath = null): Anon_Csv = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[Anon_Csv]
  }
}

