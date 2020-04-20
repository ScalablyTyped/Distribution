package typings.prettyFormat.typesMod

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
    val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], spacingInner = spacingInner.asInstanceOf[js.Any], spacingOuter = spacingOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

