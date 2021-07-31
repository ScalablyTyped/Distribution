package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNode extends StObject {
  
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
  
  @scala.inline
  implicit class XMLNodeMutableBuilder[Self <: XMLNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildNodeIterator(value: () => XMLNodeIterator): Self = StObject.set(x, "getChildNodeIterator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstChild(value: () => XMLNode): Self = StObject.set(x, "getFirstChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastChild(value: () => XMLNode): Self = StObject.set(x, "getLastChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeName(value: () => String): Self = StObject.set(x, "getNodeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeValue(value: () => String): Self = StObject.set(x, "getNodeValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextContent(value: () => String): Self = StObject.set(x, "getTextContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttribute(value: String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
  }
}
