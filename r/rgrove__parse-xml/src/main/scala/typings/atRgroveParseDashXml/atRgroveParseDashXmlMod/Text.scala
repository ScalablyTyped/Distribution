package typings.atRgroveParseDashXml.atRgroveParseDashXmlMod

import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends NodeBase
     with Node {
  var text: String
  @JSName("type")
  var type_Text: text
}

object Text {
  @scala.inline
  def apply(text: String, `type`: text, parent: NodeBase = null): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

