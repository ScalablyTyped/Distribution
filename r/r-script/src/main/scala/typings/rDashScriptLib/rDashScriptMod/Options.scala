package typings
package rDashScriptLib.rDashScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var Date: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.ISO8601 | rDashScriptLib.rDashScriptLibStrings.epoch
  ] = js.undefined
  var POSIXt: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.ISO8601 | rDashScriptLib.rDashScriptLibStrings.epoch | rDashScriptLib.rDashScriptLibStrings.mongo
  ] = js.undefined
  var auto_unbox: js.UndefOr[scala.Boolean] = js.undefined
  var complex: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.list
  ] = js.undefined
  var dataframe: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.rows | rDashScriptLib.rDashScriptLibStrings.colums | rDashScriptLib.rDashScriptLibStrings.values
  ] = js.undefined
  var digits: js.UndefOr[scala.Double] = js.undefined
  var factor: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.integer
  ] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var matrix: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.rowmajor | rDashScriptLib.rDashScriptLibStrings.columnmajor
  ] = js.undefined
  var na: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.`null` | rDashScriptLib.rDashScriptLibStrings.string
  ] = js.undefined
  var `null`: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.list | rDashScriptLib.rDashScriptLibStrings.`null`
  ] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[
    rDashScriptLib.rDashScriptLibStrings.base64 | rDashScriptLib.rDashScriptLibStrings.hex | rDashScriptLib.rDashScriptLibStrings.mongo
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Date: rDashScriptLib.rDashScriptLibStrings.ISO8601 | rDashScriptLib.rDashScriptLibStrings.epoch = null,
    POSIXt: rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.ISO8601 | rDashScriptLib.rDashScriptLibStrings.epoch | rDashScriptLib.rDashScriptLibStrings.mongo = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    auto_unbox: js.UndefOr[scala.Boolean] = js.undefined,
    complex: rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.list = null,
    dataframe: rDashScriptLib.rDashScriptLibStrings.rows | rDashScriptLib.rDashScriptLibStrings.colums | rDashScriptLib.rDashScriptLibStrings.values = null,
    digits: scala.Int | scala.Double = null,
    factor: rDashScriptLib.rDashScriptLibStrings.string | rDashScriptLib.rDashScriptLibStrings.integer = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    matrix: rDashScriptLib.rDashScriptLibStrings.rowmajor | rDashScriptLib.rDashScriptLibStrings.columnmajor = null,
    na: rDashScriptLib.rDashScriptLibStrings.`null` | rDashScriptLib.rDashScriptLibStrings.string = null,
    `null`: rDashScriptLib.rDashScriptLibStrings.list | rDashScriptLib.rDashScriptLibStrings.`null` = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    raw: rDashScriptLib.rDashScriptLibStrings.base64 | rDashScriptLib.rDashScriptLibStrings.hex | rDashScriptLib.rDashScriptLibStrings.mongo = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (POSIXt != null) __obj.updateDynamic("POSIXt")(POSIXt.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(auto_unbox)) __obj.updateDynamic("auto_unbox")(auto_unbox)
    if (complex != null) __obj.updateDynamic("complex")(complex.asInstanceOf[js.Any])
    if (dataframe != null) __obj.updateDynamic("dataframe")(dataframe.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (na != null) __obj.updateDynamic("na")(na.asInstanceOf[js.Any])
    if (`null` != null) __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

