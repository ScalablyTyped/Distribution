package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var parent: js.UndefOr[NodeBase] = js.undefined
  var `type`: java.lang.String
}

object NodeBase {
  @scala.inline
  def apply(`type`: java.lang.String, parent: NodeBase = null): NodeBase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[NodeBase]
  }
}

