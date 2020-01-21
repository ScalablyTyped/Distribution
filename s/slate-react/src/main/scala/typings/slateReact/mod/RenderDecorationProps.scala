package typings.slateReact.mod

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.react.mod.ReactNode
import typings.slate.mod.Annotation
import typings.slate.mod.Decoration
import typings.slate.mod.Mark
import typings.slate.mod.Node
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
    decoration: Decoration,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set_[Mark],
    node: Node,
    offset: Double,
    text: String,
    children: ReactNode = null
  ): RenderDecorationProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDecorationProps]
  }
}

