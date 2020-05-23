package typings.rScript.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rScript.rScriptStrings.ISO8601
import typings.rScript.rScriptStrings.`null`
import typings.rScript.rScriptStrings.base64
import typings.rScript.rScriptStrings.columnmajor
import typings.rScript.rScriptStrings.colums
import typings.rScript.rScriptStrings.epoch
import typings.rScript.rScriptStrings.hex
import typings.rScript.rScriptStrings.integer
import typings.rScript.rScriptStrings.list
import typings.rScript.rScriptStrings.mongo
import typings.rScript.rScriptStrings.rowmajor
import typings.rScript.rScriptStrings.rows
import typings.rScript.rScriptStrings.string
import typings.rScript.rScriptStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ StringDictionary[js.Any] {
  var Date: js.UndefOr[ISO8601 | epoch] = js.undefined
  var POSIXt: js.UndefOr[string | ISO8601 | epoch | mongo] = js.undefined
  var auto_unbox: js.UndefOr[Boolean] = js.undefined
  var complex: js.UndefOr[string | list] = js.undefined
  var dataframe: js.UndefOr[rows | colums | values] = js.undefined
  var digits: js.UndefOr[Double] = js.undefined
  var factor: js.UndefOr[string | integer] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var matrix: js.UndefOr[rowmajor | columnmajor] = js.undefined
  var na: js.UndefOr[`null` | string] = js.undefined
  var `null`: js.UndefOr[list | typings.rScript.rScriptStrings.`null`] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[base64 | hex | mongo] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Date: ISO8601 | epoch = null,
    POSIXt: string | ISO8601 | epoch | mongo = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    auto_unbox: js.UndefOr[Boolean] = js.undefined,
    complex: string | list = null,
    dataframe: rows | colums | values = null,
    digits: js.UndefOr[Double] = js.undefined,
    factor: string | integer = null,
    force: js.UndefOr[Boolean] = js.undefined,
    matrix: rowmajor | columnmajor = null,
    na: `null` | string = null,
    `null`: list | `null` = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    raw: base64 | hex | mongo = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (POSIXt != null) __obj.updateDynamic("POSIXt")(POSIXt.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(auto_unbox)) __obj.updateDynamic("auto_unbox")(auto_unbox.get.asInstanceOf[js.Any])
    if (complex != null) __obj.updateDynamic("complex")(complex.asInstanceOf[js.Any])
    if (dataframe != null) __obj.updateDynamic("dataframe")(dataframe.asInstanceOf[js.Any])
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (na != null) __obj.updateDynamic("na")(na.asInstanceOf[js.Any])
    if (`null` != null) __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

