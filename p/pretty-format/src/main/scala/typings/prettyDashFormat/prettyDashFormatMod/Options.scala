package typings.prettyDashFormat.prettyDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Call `toJSON()` on passed object.
    */
  var callToJSON: js.UndefOr[Boolean] = js.undefined
  /**
    * Escape special characters in regular expressions.
    */
  var escapeRegex: js.UndefOr[Boolean] = js.undefined
  /**
    * Highlight syntax for terminal (works only with `ReactTestComponent` and `ReactElement` plugins.
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of spaces for indentation.
    */
  var indent: js.UndefOr[Double] = js.undefined
  /**
    * Print only this number of levels.
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /**
    * Print without whitespace.
    */
  var min: js.UndefOr[Boolean] = js.undefined
  /**
    * plugins to serialize application-specific data types
    */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /**
    * Print function names or just [Function].
    */
  var printFunctionName: js.UndefOr[Boolean] = js.undefined
  /**
    * Syntax highlight theme.
    * Uses [ansi-styles colors](https://github.com/chalk/ansi-styles#colors) + `reset` for no color.
    */
  var theme: js.UndefOr[Theme] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callToJSON: js.UndefOr[Boolean] = js.undefined,
    escapeRegex: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    indent: Int | Double = null,
    maxDepth: Int | Double = null,
    min: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[Plugin] = null,
    printFunctionName: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callToJSON)) __obj.updateDynamic("callToJSON")(callToJSON)
    if (!js.isUndefined(escapeRegex)) __obj.updateDynamic("escapeRegex")(escapeRegex)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(printFunctionName)) __obj.updateDynamic("printFunctionName")(printFunctionName)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[Options]
  }
}

