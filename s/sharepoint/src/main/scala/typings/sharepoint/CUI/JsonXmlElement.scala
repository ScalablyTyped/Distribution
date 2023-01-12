package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonXmlElement extends StObject {
  
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement
  
  def appendChildNode(node: JsonXmlElement): JsonXmlElement
  
  def get_attributes(): js.Array[String]
  
  def get_childNodes(): js.Array[JsonXmlElement]
  
  def get_name(): String
}
object JsonXmlElement {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: JsonXmlElement] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: (String, js.Array[String]) => JsonXmlElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction2(value))
    
    inline def setAppendChildNode(value: JsonXmlElement => JsonXmlElement): Self = StObject.set(x, "appendChildNode", js.Any.fromFunction1(value))
    
    inline def setGet_attributes(value: () => js.Array[String]): Self = StObject.set(x, "get_attributes", js.Any.fromFunction0(value))
    
    inline def setGet_childNodes(value: () => js.Array[JsonXmlElement]): Self = StObject.set(x, "get_childNodes", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
  }
}
