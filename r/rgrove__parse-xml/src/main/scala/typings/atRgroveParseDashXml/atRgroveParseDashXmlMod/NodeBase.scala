package typings.atRgroveParseDashXml.atRgroveParseDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var parent: js.UndefOr[NodeBase] = js.undefined
  var `type`: String
}

object NodeBase {
  @scala.inline
  def apply(`type`: String, parent: NodeBase = null): NodeBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeBase]
  }
}

