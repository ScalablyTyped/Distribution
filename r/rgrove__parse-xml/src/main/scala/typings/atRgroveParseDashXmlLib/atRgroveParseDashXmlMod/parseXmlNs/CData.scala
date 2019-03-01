package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CData
  extends NodeBase
     with Node {
  var text: java.lang.String
  @JSName("type")
  var type_CData: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.cdata
}

object CData {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.cdata,
    parent: NodeBase = null
  ): CData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("text")(text)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[CData]
  }
}

