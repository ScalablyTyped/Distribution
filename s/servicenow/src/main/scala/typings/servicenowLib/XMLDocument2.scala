package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XMLDocument2")
@js.native
class XMLDocument2 () extends js.Object {
  def createElement(name: java.lang.String): servicenowLib.servicenowNs.XMLNode = js.native
  def createElementWithTextValue(name: java.lang.String, value: java.lang.String): servicenowLib.servicenowNs.XMLNode = js.native
  def getDocumentElement(): servicenowLib.servicenowNs.XMLNode = js.native
  def getFirstNode(xpath: java.lang.String): servicenowLib.servicenowNs.XMLNode = js.native
  def getNextNode(prev: js.Object): servicenowLib.servicenowNs.XMLNode = js.native
  def getNode(xpath: java.lang.String): servicenowLib.servicenowNs.XMLNode = js.native
  def getNodeText(xpath: java.lang.String): java.lang.String = js.native
  def parseXML(xmlDoc: java.lang.String): scala.Unit = js.native
  def setCurrentElement(element: servicenowLib.servicenowNs.XMLNode): scala.Unit = js.native
}

