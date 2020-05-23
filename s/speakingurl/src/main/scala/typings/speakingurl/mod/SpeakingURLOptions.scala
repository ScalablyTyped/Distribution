package typings.speakingurl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeakingURLOptions extends js.Object {
  var custom: js.UndefOr[js.Array[String] | Dictionary[String]] = js.undefined
  var lang: js.UndefOr[String | Boolean] = js.undefined
  var maintainCase: js.UndefOr[Boolean] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var symbols: js.UndefOr[Boolean] = js.undefined
  var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var uric: js.UndefOr[Boolean] = js.undefined
  var uricNoSlash: js.UndefOr[Boolean] = js.undefined
}

object SpeakingURLOptions {
  @scala.inline
  def apply(
    custom: js.Array[String] | Dictionary[String] = null,
    lang: String | Boolean = null,
    maintainCase: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    symbols: js.UndefOr[Boolean] = js.undefined,
    titleCase: js.Array[String] | Boolean = null,
    truncate: js.UndefOr[Double] = js.undefined,
    uric: js.UndefOr[Boolean] = js.undefined,
    uricNoSlash: js.UndefOr[Boolean] = js.undefined
  ): SpeakingURLOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainCase)) __obj.updateDynamic("maintainCase")(maintainCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.get.asInstanceOf[js.Any])
    if (titleCase != null) __obj.updateDynamic("titleCase")(titleCase.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uric)) __obj.updateDynamic("uric")(uric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uricNoSlash)) __obj.updateDynamic("uricNoSlash")(uricNoSlash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakingURLOptions]
  }
}

