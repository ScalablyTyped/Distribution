package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Inline
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInlineProps extends RenderNodeProps {
  var node: Inline
}

object RenderInlineProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Inline,
    parent: Node,
    readOnly: Boolean,
    children: ReactNode = null
  ): RenderInlineProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent, readOnly = readOnly)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInlineProps]
  }
}

