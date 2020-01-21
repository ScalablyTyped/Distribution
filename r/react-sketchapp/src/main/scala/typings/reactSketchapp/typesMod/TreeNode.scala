package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode extends js.Object {
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var layout: LayoutInfo
  var props: js.Any
  var style: ViewStyle
  var textStyle: TextStyle
  var `type`: String
}

object TreeNode {
  @scala.inline
  def apply(
    layout: LayoutInfo,
    props: js.Any,
    style: ViewStyle,
    textStyle: TextStyle,
    `type`: String,
    children: js.Array[TreeNode] = null
  ): TreeNode = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
}

