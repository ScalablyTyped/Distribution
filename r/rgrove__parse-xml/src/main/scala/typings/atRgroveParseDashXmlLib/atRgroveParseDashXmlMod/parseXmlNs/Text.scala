package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends NodeBase
     with Node {
  var text: java.lang.String
  @JSName("type")
  var type_Text: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.text
}

object Text {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.text,
    parent: NodeBase = null
  ): Text = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Text]
  }
}

