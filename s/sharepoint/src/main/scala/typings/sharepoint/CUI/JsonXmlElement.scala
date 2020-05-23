package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonXmlElement extends js.Object {
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement
  def appendChildNode(node: JsonXmlElement): JsonXmlElement
  def get_attributes(): js.Array[String]
  def get_childNodes(): js.Array[JsonXmlElement]
  def get_name(): String
}

object JsonXmlElement {
  @scala.inline
  def apply(
    appendChild: (String, js.Array[String]) => JsonXmlElement,
    appendChildNode: JsonXmlElement => JsonXmlElement,
    get_attributes: () => js.Array[String],
    get_childNodes: () => js.Array[JsonXmlElement],
    get_name: () => String
  ): JsonXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), appendChildNode = js.Any.fromFunction1(appendChildNode), get_attributes = js.Any.fromFunction0(get_attributes), get_childNodes = js.Any.fromFunction0(get_childNodes), get_name = js.Any.fromFunction0(get_name))
    __obj.asInstanceOf[JsonXmlElement]
  }
}

