package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Block
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderBlockProps extends RenderNodeProps {
  var node: Block
}

object RenderBlockProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: ReactNode,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Block,
    parent: Node,
    readOnly: Boolean
  ): RenderBlockProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent.asInstanceOf[js.Any], readOnly = readOnly)
  
    __obj.asInstanceOf[RenderBlockProps]
  }
}

