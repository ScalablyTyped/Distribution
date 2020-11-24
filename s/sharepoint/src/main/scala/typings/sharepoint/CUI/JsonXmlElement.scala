package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonXmlElement extends js.Object {
  
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement = js.native
  
  def appendChildNode(node: JsonXmlElement): JsonXmlElement = js.native
  
  def get_attributes(): js.Array[String] = js.native
  
  def get_childNodes(): js.Array[JsonXmlElement] = js.native
  
  def get_name(): String = js.native
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
  
  @scala.inline
  implicit class JsonXmlElementOps[Self <: JsonXmlElement] (val x: Self) extends AnyVal {
    
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
    def setAppendChild(value: (String, js.Array[String]) => JsonXmlElement): Self = this.set("appendChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppendChildNode(value: JsonXmlElement => JsonXmlElement): Self = this.set("appendChildNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_attributes(value: () => js.Array[String]): Self = this.set("get_attributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_childNodes(value: () => js.Array[JsonXmlElement]): Self = this.set("get_childNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
  }
}
