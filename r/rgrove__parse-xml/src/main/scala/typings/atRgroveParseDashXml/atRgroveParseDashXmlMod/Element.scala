package typings.atRgroveParseDashXml.atRgroveParseDashXmlMod

import org.scalablytyped.runtime.StringDictionary
import typings.atRgroveParseDashXml.atRgroveParseDashXmlStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends NodeBase
     with Node {
  var attributes: StringDictionary[String]
  var children: js.Array[NodeBase]
  var name: String
  var preserveWhitespace: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_Element: element
}

object Element {
  @scala.inline
  def apply(
    attributes: StringDictionary[String],
    children: js.Array[NodeBase],
    name: String,
    `type`: element,
    parent: NodeBase = null,
    preserveWhitespace: String = null
  ): Element = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

