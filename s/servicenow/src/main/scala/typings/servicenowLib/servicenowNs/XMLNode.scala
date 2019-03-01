package typings
package servicenowLib.servicenowNs

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
    getAttribute: js.Function1[java.lang.String, java.lang.String],
    getChildNodeIterator: js.Function0[XMLNodeIterator],
    getFirstChild: js.Function0[XMLNode],
    getLastChild: js.Function0[XMLNode],
    getNodeName: js.Function0[java.lang.String],
    getNodeValue: js.Function0[java.lang.String],
    getTextContent: js.Function0[java.lang.String],
    hasAttribute: js.Function1[java.lang.String, scala.Boolean],
    toString: js.Function0[java.lang.String]
  ): XMLNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getChildNodeIterator")(getChildNodeIterator)
    __obj.updateDynamic("getFirstChild")(getFirstChild)
    __obj.updateDynamic("getLastChild")(getLastChild)
    __obj.updateDynamic("getNodeName")(getNodeName)
    __obj.updateDynamic("getNodeValue")(getNodeValue)
    __obj.updateDynamic("getTextContent")(getTextContent)
    __obj.updateDynamic("hasAttribute")(hasAttribute)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[XMLNode]
  }
}

