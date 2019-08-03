package typings.slateDashReact.slateDashReactMod

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Set
import typings.react.reactMod.ReactNode
import typings.slate.slateMod.Annotation
import typings.slate.slateMod.Decoration
import typings.slate.slateMod.Mark
import typings.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDecorationProps extends RenderProps {
  var children: ReactNode
  var decoration: Decoration
}

object RenderDecorationProps {
  @scala.inline
  def apply(
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    children: ReactNode,
    decoration: Decoration,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderDecorationProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes, children = children.asInstanceOf[js.Any], decoration = decoration, decorations = decorations.asInstanceOf[js.Any], editor = editor, marks = marks, node = node, offset = offset, text = text)
  
    __obj.asInstanceOf[RenderDecorationProps]
  }
}

