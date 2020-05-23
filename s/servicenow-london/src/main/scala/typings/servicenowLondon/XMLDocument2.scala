package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLDocument2 extends js.Object {
  def createElement(name: String): XMLNode
  def createElementWithTextValue(name: String, value: String): XMLNode
  def getDocumentElement(): XMLNode
  def getFirstNode(xpath: String): XMLNode
  def getNextNode(prev: js.Object): XMLNode
  def getNode(xpath: String): XMLNode
  def getNodeText(xpath: String): String
  def parseXML(xmlDoc: String): Unit
  def setCurrentElement(element: XMLNode): Unit
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
}

