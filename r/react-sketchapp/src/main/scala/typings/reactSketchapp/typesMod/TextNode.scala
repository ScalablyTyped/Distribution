package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextNode extends js.Object {
  var content: String
  var textStyles: TextStyle
}

object TextNode {
  @scala.inline
  def apply(content: String, textStyles: TextStyle): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
}

