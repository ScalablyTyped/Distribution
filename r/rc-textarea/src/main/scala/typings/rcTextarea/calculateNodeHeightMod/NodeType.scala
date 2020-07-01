package typings.rcTextarea.calculateNodeHeightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeType extends js.Object {
  var borderSize: Double
  var boxSizing: String
  var paddingSize: Double
  var sizingStyle: String
}

object NodeType {
  @scala.inline
  def apply(borderSize: Double, boxSizing: String, paddingSize: Double, sizingStyle: String): NodeType = {
    val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeType]
  }
}

