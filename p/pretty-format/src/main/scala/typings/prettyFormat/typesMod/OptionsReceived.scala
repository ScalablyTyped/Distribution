package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsReceived extends js.Object {
  var callToJSON: js.UndefOr[Boolean] = js.undefined
  var escapeRegex: js.UndefOr[Boolean] = js.undefined
  var escapeString: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[Plugins] = js.undefined
  var printFunctionName: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ThemeReceived] = js.undefined
}

object OptionsReceived {
  @scala.inline
  def apply(
    callToJSON: js.UndefOr[Boolean] = js.undefined,
    escapeRegex: js.UndefOr[Boolean] = js.undefined,
    escapeString: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    indent: js.UndefOr[Double] = js.undefined,
    maxDepth: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Boolean] = js.undefined,
    plugins: Plugins = null,
    printFunctionName: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeReceived = null
  ): OptionsReceived = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callToJSON)) __obj.updateDynamic("callToJSON")(callToJSON.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeRegex)) __obj.updateDynamic("escapeRegex")(escapeRegex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeString)) __obj.updateDynamic("escapeString")(escapeString.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(printFunctionName)) __obj.updateDynamic("printFunctionName")(printFunctionName.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsReceived]
  }
}

