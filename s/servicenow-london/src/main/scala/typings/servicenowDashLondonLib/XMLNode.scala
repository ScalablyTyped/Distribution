package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNode extends js.Object {
  def getAttribute(attribute: java.lang.String): java.lang.String
  def getChildNodeIterator(): XMLNodeIterator
  def getFirstChild(): XMLNode
  def getLastChild(): XMLNode
  def getNodeName(): java.lang.String
  def getNodeValue(): java.lang.String
  def getTextContent(): java.lang.String
  def hasAttribute(name: java.lang.String): scala.Boolean
}

object XMLNode {
  @scala.inline
  def apply(
    getAttribute: java.lang.String => java.lang.String,
    getChildNodeIterator: () => XMLNodeIterator,
    getFirstChild: () => XMLNode,
    getLastChild: () => XMLNode,
    getNodeName: () => java.lang.String,
    getNodeValue: () => java.lang.String,
    getTextContent: () => java.lang.String,
    hasAttribute: java.lang.String => scala.Boolean,
    toString: () => java.lang.String
  ): XMLNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getChildNodeIterator = js.Any.fromFunction0(getChildNodeIterator), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getNodeName = js.Any.fromFunction0(getNodeName), getNodeValue = js.Any.fromFunction0(getNodeValue), getTextContent = js.Any.fromFunction0(getTextContent), hasAttribute = js.Any.fromFunction1(hasAttribute), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[XMLNode]
  }
}

