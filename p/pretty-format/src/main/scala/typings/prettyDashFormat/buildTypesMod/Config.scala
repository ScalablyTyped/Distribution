package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var callToJSON: Boolean
  var colors: Colors
  var escapeRegex: Boolean
  var escapeString: Boolean
  var indent: String
  var maxDepth: Double
  var min: Boolean
  var plugins: Plugins
  var printFunctionName: Boolean
  var spacingInner: String
  var spacingOuter: String
}

object Config {
  @scala.inline
  def apply(
    callToJSON: Boolean,
    colors: Colors,
    escapeRegex: Boolean,
    escapeString: Boolean,
    indent: String,
    maxDepth: Double,
    min: Boolean,
    plugins: Plugins,
    printFunctionName: Boolean,
    spacingInner: String,
    spacingOuter: String
  ): Config = {
    val __obj = js.Dynamic.literal(callToJSON = callToJSON, colors = colors, escapeRegex = escapeRegex, escapeString = escapeString, indent = indent, maxDepth = maxDepth, min = min, plugins = plugins, printFunctionName = printFunctionName, spacingInner = spacingInner, spacingOuter = spacingOuter)
  
    __obj.asInstanceOf[Config]
  }
}

