package typings.atRgroveParseDashXml.atRgroveParseDashXmlMod

import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.comment
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
    val __obj = js.Dynamic.literal(content = content)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Comment]
  }
}

