package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderBlockProps extends RenderNodeProps {
  var node: slateLib.slateMod.Block
}

object RenderBlockProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: reactLib.reactMod.ReactNode,
    editor: slateLib.slateMod.Editor,
    isFocused: scala.Boolean,
    isSelected: scala.Boolean,
    key: java.lang.String,
    node: slateLib.slateMod.Block,
    parent: slateLib.slateMod.Node,
    readOnly: scala.Boolean
  ): RenderBlockProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent.asInstanceOf[js.Any], readOnly = readOnly)
  
    __obj.asInstanceOf[RenderBlockProps]
  }
}

