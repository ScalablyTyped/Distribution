package typings
package speakingurlLib.speakingurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeakingURLOptions extends js.Object {
  var custom: js.UndefOr[js.Array[java.lang.String] | Dictionary[java.lang.String]] = js.undefined
  var lang: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var maintainCase: js.UndefOr[scala.Boolean] = js.undefined
  var mark: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var symbols: js.UndefOr[scala.Boolean] = js.undefined
  var titleCase: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var truncate: js.UndefOr[scala.Double] = js.undefined
  var uric: js.UndefOr[scala.Boolean] = js.undefined
  var uricNoSlash: js.UndefOr[scala.Boolean] = js.undefined
}

object SpeakingURLOptions {
  @scala.inline
  def apply(
    custom: js.Array[java.lang.String] | Dictionary[java.lang.String] = null,
    lang: java.lang.String | scala.Boolean = null,
    maintainCase: js.UndefOr[scala.Boolean] = js.undefined,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    symbols: js.UndefOr[scala.Boolean] = js.undefined,
    titleCase: js.Array[java.lang.String] | scala.Boolean = null,
    truncate: scala.Int | scala.Double = null,
    uric: js.UndefOr[scala.Boolean] = js.undefined,
    uricNoSlash: js.UndefOr[scala.Boolean] = js.undefined
  ): SpeakingURLOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainCase)) __obj.updateDynamic("maintainCase")(maintainCase)
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols)
    if (titleCase != null) __obj.updateDynamic("titleCase")(titleCase.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (!js.isUndefined(uric)) __obj.updateDynamic("uric")(uric)
    if (!js.isUndefined(uricNoSlash)) __obj.updateDynamic("uricNoSlash")(uricNoSlash)
    __obj.asInstanceOf[SpeakingURLOptions]
  }
}

