package typings.reactDashSketchapp.typesMod

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
    val __obj = js.Dynamic.literal(layout = layout, props = props, style = style, textStyle = textStyle)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[TreeNode]
  }
}

