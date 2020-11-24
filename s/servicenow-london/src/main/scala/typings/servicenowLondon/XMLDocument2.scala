package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLDocument2 extends js.Object {
  
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
  implicit class XMLDocument2Ops[Self <: XMLDocument2] (val x: Self) extends AnyVal {
    
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
    def setCreateElement(value: String => XMLNode): Self = this.set("createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementWithTextValue(value: (String, String) => XMLNode): Self = this.set("createElementWithTextValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDocumentElement(value: () => XMLNode): Self = this.set("getDocumentElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstNode(value: String => XMLNode): Self = this.set("getFirstNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNextNode(value: js.Object => XMLNode): Self = this.set("getNextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNode(value: String => XMLNode): Self = this.set("getNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeText(value: String => String): Self = this.set("getNodeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseXML(value: String => Unit): Self = this.set("parseXML", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCurrentElement(value: XMLNode => Unit): Self = this.set("setCurrentElement", js.Any.fromFunction1(value))
  }
}
