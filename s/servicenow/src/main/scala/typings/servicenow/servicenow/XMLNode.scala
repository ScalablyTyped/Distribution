package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNode extends js.Object {
  def getAttribute(attribute: String): String
  def getChildNodeIterator(): XMLNodeIterator
  def getFirstChild(): XMLNode
  def getLastChild(): XMLNode
  def getNodeName(): String
  def getNodeValue(): String
  def getTextContent(): String
  def hasAttribute(name: String): Boolean
}

object XMLNode {
  @scala.inline
  def apply(
    getAttribute: String => String,
    getChildNodeIterator: () => XMLNodeIterator,
    getFirstChild: () => XMLNode,
    getLastChild: () => XMLNode,
    getNodeName: () => String,
    getNodeValue: () => String,
    getTextContent: () => String,
    hasAttribute: String => Boolean
  ): XMLNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getChildNodeIterator = js.Any.fromFunction0(getChildNodeIterator), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getNodeName = js.Any.fromFunction0(getNodeName), getNodeValue = js.Any.fromFunction0(getNodeValue), getTextContent = js.Any.fromFunction0(getTextContent), hasAttribute = js.Any.fromFunction1(hasAttribute))
    __obj.asInstanceOf[XMLNode]
  }
}

