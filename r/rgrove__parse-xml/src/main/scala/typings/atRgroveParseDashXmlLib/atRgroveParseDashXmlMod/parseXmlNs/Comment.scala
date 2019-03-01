package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends NodeBase
     with Node {
  var content: java.lang.String
  @JSName("type")
  var type_Comment: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.comment
}

object Comment {
  @scala.inline
  def apply(
    content: java.lang.String,
    `type`: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.comment,
    parent: NodeBase = null
  ): Comment = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Comment]
  }
}

