package typings.rgroveParseXml.mod

import typings.rgroveParseXml.rgroveParseXmlStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends NodeBase
     with Node {
  var content: String
  @JSName("type")
  var type_Comment: comment
}

object Comment {
  @scala.inline
  def apply(content: String, `type`: comment, parent: NodeBase = null): Comment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

