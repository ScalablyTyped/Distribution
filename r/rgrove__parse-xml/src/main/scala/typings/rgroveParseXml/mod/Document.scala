package typings.rgroveParseXml.mod

import typings.rgroveParseXml.rgroveParseXmlStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends NodeBase {
  var children: js.Array[NodeBase] = js.native
  @JSName("type")
  var type_Document: document = js.native
}

object Document {
  @scala.inline
  def apply(children: js.Array[NodeBase], `type`: document): Document = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: NodeBase*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[NodeBase]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: document): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

