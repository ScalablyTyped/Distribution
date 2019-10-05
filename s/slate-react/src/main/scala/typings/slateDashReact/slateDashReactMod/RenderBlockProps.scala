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
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Block,
    parent: Node,
    readOnly: Boolean,
    children: ReactNode = null
  ): RenderBlockProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent, readOnly = readOnly)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBlockProps]
  }
}

