package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends NodeBase {
  var children: js.Array[NodeBase]
  @JSName("type")
  var type_Document: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.document
}

object Document {
  @scala.inline
  def apply(
    children: js.Array[NodeBase],
    `type`: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.document,
    parent: NodeBase = null
  ): Document = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Document]
  }
}

