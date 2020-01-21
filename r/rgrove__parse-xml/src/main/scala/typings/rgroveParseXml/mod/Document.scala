package typings.rgroveParseXml.mod

import typings.rgroveParseXml.rgroveParseXmlStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends NodeBase {
  var children: js.Array[NodeBase]
  @JSName("type")
  var type_Document: document
}

object Document {
  @scala.inline
  def apply(children: js.Array[NodeBase], `type`: document, parent: NodeBase = null): Document = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

