package typings
package prettyDashFormatLib.prettyDashFormatMod.prettyFormatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Call `toJSON()` on passed object.
           */
  var callToJSON: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Escape special characters in regular expressions.
           */
  var escapeRegex: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Highlight syntax for terminal (works only with `ReactTestComponent` and `ReactElement` plugins.
           */
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Number of spaces for indentation.
           */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /**
           * Print only this number of levels.
           */
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  /**
           * Print without whitespace.
           */
  var min: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * plugins to serialize application-specific data types
           */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /**
           * Print function names or just [Function].
           */
  var printFunctionName: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Syntax highlight theme.
           * Uses [ansi-styles colors](https://github.com/chalk/ansi-styles#colors) + `reset` for no color.
           */
  var theme: js.UndefOr[Theme] = js.undefined
}

