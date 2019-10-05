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

trait RenderAnnotationProps extends RenderProps {
  var annotation: Annotation
  var children: ReactNode
}

object RenderAnnotationProps {
  @scala.inline
  def apply(
    annotation: Annotation,
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set[Mark],
    node: Node,
    offset: Double,
    text: String,
    children: ReactNode = null
  ): RenderAnnotationProps = {
    val __obj = js.Dynamic.literal(annotation = annotation, annotations = annotations.asInstanceOf[js.Any], attributes = attributes, decorations = decorations.asInstanceOf[js.Any], editor = editor, marks = marks, node = node, offset = offset, text = text)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderAnnotationProps]
  }
}

