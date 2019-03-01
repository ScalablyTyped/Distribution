package typings
package atRgroveParseDashXmlLib.atRgroveParseDashXmlMod.parseXmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends NodeBase
     with Node {
  var attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var children: js.Array[NodeBase]
  var name: java.lang.String
  var preserveWhitespace: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Element: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.element
}

object Element {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    children: js.Array[NodeBase],
    name: java.lang.String,
    `type`: atRgroveParseDashXmlLib.atRgroveParseDashXmlLibStrings.element,
    parent: NodeBase = null,
    preserveWhitespace: java.lang.String = null
  ): Element = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    __obj.asInstanceOf[Element]
  }
}

