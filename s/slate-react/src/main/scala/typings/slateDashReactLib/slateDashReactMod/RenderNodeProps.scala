package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderNodeProps extends js.Object {
  var attributes: RenderAttributes
  var children: reactLib.reactMod.ReactNode
  var editor: slateLib.slateMod.Editor
  var isFocused: scala.Boolean
  var isSelected: scala.Boolean
  var key: java.lang.String
  var node: slateLib.slateMod.Block | slateLib.slateMod.Inline
  var parent: slateLib.slateMod.Node
  var readOnly: scala.Boolean
}

object RenderNodeProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: reactLib.reactMod.ReactNode,
    editor: slateLib.slateMod.Editor,
    isFocused: scala.Boolean,
    isSelected: scala.Boolean,
    key: java.lang.String,
    node: slateLib.slateMod.Block | slateLib.slateMod.Inline,
    parent: slateLib.slateMod.Node,
    readOnly: scala.Boolean
  ): RenderNodeProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readOnly = readOnly)
  
    __obj.asInstanceOf[RenderNodeProps]
  }
}

