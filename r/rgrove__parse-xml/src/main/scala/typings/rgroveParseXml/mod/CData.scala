package typings.rgroveParseXml.mod

import typings.rgroveParseXml.rgroveParseXmlStrings.cdata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CData
  extends NodeBase
     with Node {
  var text: String
  @JSName("type")
  var type_CData: cdata
}

object CData {
  @scala.inline
  def apply(text: String, `type`: cdata, parent: NodeBase = null): CData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CData]
  }
}

