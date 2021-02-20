package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLDocument2 extends StObject {
  
  def createElement(name: String): XMLNode = js.native
  
  def createElementWithTextValue(name: String, value: String): XMLNode = js.native
  
  def getDocumentElement(): XMLNode = js.native
  
  def getFirstNode(xpath: String): XMLNode = js.native
  
  def getNextNode(prev: js.Object): XMLNode = js.native
  
  def getNode(xpath: String): XMLNode = js.native
  
  def getNodeText(xpath: String): String = js.native
  
  def parseXML(xmlDoc: String): Unit = js.native
  
  def setCurrentElement(element: XMLNode): Unit = js.native
}
object XMLDocument2 {
  
  @scala.inline
  def apply(
    createElement: String => XMLNode,
    createElementWithTextValue: (String, String) => XMLNode,
    getDocumentElement: () => XMLNode,
    getFirstNode: String => XMLNode,
    getNextNode: js.Object => XMLNode,
    getNode: String => XMLNode,
    getNodeText: String => String,
    parseXML: String => Unit,
    setCurrentElement: XMLNode => Unit
  ): XMLDocument2 = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement), createElementWithTextValue = js.Any.fromFunction2(createElementWithTextValue), getDocumentElement = js.Any.fromFunction0(getDocumentElement), getFirstNode = js.Any.fromFunction1(getFirstNode), getNextNode = js.Any.fromFunction1(getNextNode), getNode = js.Any.fromFunction1(getNode), getNodeText = js.Any.fromFunction1(getNodeText), parseXML = js.Any.fromFunction1(parseXML), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
    __obj.asInstanceOf[XMLDocument2]
  }
  
  @scala.inline
  implicit class XMLDocument2MutableBuilder[Self <: XMLDocument2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateElement(value: String => XMLNode): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementWithTextValue(value: (String, String) => XMLNode): Self = StObject.set(x, "createElementWithTextValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDocumentElement(value: () => XMLNode): Self = StObject.set(x, "getDocumentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstNode(value: String => XMLNode): Self = StObject.set(x, "getFirstNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNextNode(value: js.Object => XMLNode): Self = StObject.set(x, "getNextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNode(value: String => XMLNode): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeText(value: String => String): Self = StObject.set(x, "getNodeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseXML(value: String => Unit): Self = StObject.set(x, "parseXML", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCurrentElement(value: XMLNode => Unit): Self = StObject.set(x, "setCurrentElement", js.Any.fromFunction1(value))
  }
}
