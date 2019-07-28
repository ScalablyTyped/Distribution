package typings.slateDashReact.slateDashReactMod

import typings.immutable.immutableMod.Set
import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Mark
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMarkProps extends js.Object {
  var attributes: RenderAttributes
  var children: ReactNode
  var editor: Editor
  var mark: Mark
  var marks: Set[Mark]
  var node: Node
  var offset: Double
  var text: String
}

object RenderMarkProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: ReactNode,
    editor: Editor,
    mark: Mark,
    marks: Set[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderMarkProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, mark = mark, marks = marks, node = node.asInstanceOf[js.Any], offset = offset, text = text)
  
    __obj.asInstanceOf[RenderMarkProps]
  }
}

