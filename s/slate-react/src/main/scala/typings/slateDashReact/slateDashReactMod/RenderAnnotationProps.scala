package typings.slateDashReact.slateDashReactMod

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set
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
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderAnnotationProps]
  }
}

