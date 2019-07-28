package typings.slateDashReact.slateDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Document
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDocumentProps extends RenderNodeProps {
  var node: Document[StringDictionary[_]]
}

object RenderDocumentProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: ReactNode,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Document[StringDictionary[_]],
    parent: Node,
    readOnly: Boolean
  ): RenderDocumentProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, isFocused = isFocused, isSelected = isSelected, key = key, node = node, parent = parent.asInstanceOf[js.Any], readOnly = readOnly)
  
    __obj.asInstanceOf[RenderDocumentProps]
  }
}

