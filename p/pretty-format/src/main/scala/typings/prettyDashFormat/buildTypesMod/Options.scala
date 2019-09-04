package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callToJSON: Boolean
  var escapeRegex: Boolean
  var escapeString: Boolean
  var highlight: Boolean
  var indent: Double
  var maxDepth: Double
  var min: Boolean
  var plugins: Plugins
  var printFunctionName: Boolean
  var theme: Theme
}

object Options {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    escapeRegex: Boolean,
    escapeString: Boolean,
    highlight: Boolean,
    indent: Double,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    theme: Theme
  ): Options = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON, escapeRegex = escapeRegex, escapeString = escapeString, highlight = highlight, indent = indent, maxDepth = maxDepth, min = min, plugins = plugins, printFunctionName = printFunctionName, theme = theme)
  
    __obj.asInstanceOf[Options]
  }
}

