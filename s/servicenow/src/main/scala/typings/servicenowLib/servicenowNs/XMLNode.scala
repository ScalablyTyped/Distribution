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

