package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var edgeSpacing: String
  var min: Boolean
  var spacing: String
}

object PluginOptions {
  @scala.inline
  def apply(edgeSpacing: String, min: Boolean, spacing: String): PluginOptions = {
    val __obj = js.Dynamic.literal(edgeSpacing = edgeSpacing, min = min, spacing = spacing)
  
    __obj.asInstanceOf[PluginOptions]
  }
}

