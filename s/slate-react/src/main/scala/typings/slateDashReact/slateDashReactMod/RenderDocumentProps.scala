package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Document
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDocumentProps extends RenderNodeProps {
  var node: Document
}

object RenderDocumentProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Document,
    parent: Node,
    readOnly: Boolean,
    children: ReactNode = null
  ): RenderDocumentProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent, readOnly = readOnly)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDocumentProps]
  }
}

