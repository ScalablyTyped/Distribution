package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.JsonXmlElement")
@js.native
class JsonXmlElement protected () extends js.Object {
  def this(name: String, attrs: js.Array[String]) = this()
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement = js.native
  def appendChildNode(node: JsonXmlElement): JsonXmlElement = js.native
  def get_attributes(): js.Array[String] = js.native
  def get_childNodes(): js.Array[JsonXmlElement] = js.native
  def get_name(): String = js.native
}

