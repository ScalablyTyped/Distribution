package typings.slateReact.mod

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.slate.mod.Annotation
import typings.slate.mod.Decoration
import typings.slate.mod.Mark
import typings.slate.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var annotations: List[Annotation] | js.Array[Annotation]
  var attributes: RenderAttributes
  var decorations: List[Decoration] | js.Array[Annotation]
  var editor: Editor
  var marks: Set_[Mark]
  var node: Node
  var offset: Double
  var text: String
}

object RenderProps {
  @scala.inline
  def apply(
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set_[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderProps]
  }
}

