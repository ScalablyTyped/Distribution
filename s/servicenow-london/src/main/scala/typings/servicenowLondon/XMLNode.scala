package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLNode extends js.Object {
  def getAttribute(attribute: String): String = js.native
  def getChildNodeIterator(): XMLNodeIterator = js.native
  def getFirstChild(): XMLNode = js.native
  def getLastChild(): XMLNode = js.native
  def getNodeName(): String = js.native
  def getNodeValue(): String = js.native
  def getTextContent(): String = js.native
  def hasAttribute(name: String): Boolean = js.native
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
  @scala.inline
  implicit class XMLNodeOps[Self <: XMLNode] (val x: Self) extends AnyVal {
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
    def setGetAttribute(value: String => String): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildNodeIterator(value: () => XMLNodeIterator): Self = this.set("getChildNodeIterator", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFirstChild(value: () => XMLNode): Self = this.set("getFirstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastChild(value: () => XMLNode): Self = this.set("getLastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodeName(value: () => String): Self = this.set("getNodeName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodeValue(value: () => String): Self = this.set("getNodeValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextContent(value: () => String): Self = this.set("getTextContent", js.Any.fromFunction0(value))
    @scala.inline
    def setHasAttribute(value: String => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
  }
  
}

