package typings.atRgroveParseDashXml.atRgroveParseDashXmlMod

import org.scalablytyped.runtime.StringDictionary
import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.cdata
import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.comment
import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.element
import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atRgroveParseDashXml.atRgroveParseDashXmlMod.CData
  - typings.atRgroveParseDashXml.atRgroveParseDashXmlMod.Comment
  - typings.atRgroveParseDashXml.atRgroveParseDashXmlMod.Element
  - typings.atRgroveParseDashXml.atRgroveParseDashXmlMod.Text
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def CData(text: String, `type`: cdata, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Comment(content: String, `type`: comment, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Element(
    attributes: StringDictionary[String],
    children: js.Array[NodeBase],
    name: String,
    `type`: element,
    parent: NodeBase = null,
    preserveWhitespace: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Text(text: String, `type`: text, parent: NodeBase = null): Node = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

