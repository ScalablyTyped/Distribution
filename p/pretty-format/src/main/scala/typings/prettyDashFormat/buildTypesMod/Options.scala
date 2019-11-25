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
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

