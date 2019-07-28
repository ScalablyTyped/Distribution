package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatParams extends js.Object {
  var csv: js.UndefOr[CsvParams] = js.undefined
  // source data is in json format
  var json: js.UndefOr[Boolean] = js.undefined
  var xml: js.UndefOr[XmlParams] = js.undefined
}

object FormatParams {
  @scala.inline
  def apply(csv: CsvParams = null, json: js.UndefOr[Boolean] = js.undefined, xml: XmlParams = null): FormatParams = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[FormatParams]
  }
}

