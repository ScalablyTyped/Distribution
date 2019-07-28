package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderNodeProps extends js.Object {
  var attributes: RenderAttributes
  var children: ReactNode
  var editor: Editor
  var isFocused: Boolean
  var isSelected: Boolean
  var key: String
  var parent: Node
  var readOnly: Boolean
}

object RenderNodeProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: ReactNode,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    parent: Node,
    readOnly: Boolean
  ): RenderNodeProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, parent = parent.asInstanceOf[js.Any], readOnly = readOnly)
  
    __obj.asInstanceOf[RenderNodeProps]
  }
}

