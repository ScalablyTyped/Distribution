package typings.rgroveParseXml.mod

import typings.rgroveParseXml.rgroveParseXmlStrings.cdata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CData
  extends NodeBase
     with Node {
  var text: String = js.native
  @JSName("type")
  var type_CData: cdata = js.native
}

object CData {
  @scala.inline
  def apply(text: String, `type`: cdata): CData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CData]
  }
  @scala.inline
  implicit class CDataOps[Self <: CData] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: cdata): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

