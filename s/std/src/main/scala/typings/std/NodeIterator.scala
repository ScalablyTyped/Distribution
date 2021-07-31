package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends StObject {
  
  def detach(): Unit
  
  val filter: NodeFilter | Null
  
  def nextNode(): Node | Null
  
  val pointerBeforeReferenceNode: scala.Boolean
  
  def previousNode(): Node | Null
  
  val referenceNode: Node
  
  val root: Node
  
  val whatToShow: Double
}
object NodeIterator {
  
  @scala.inline
  def apply(
    detach: () => Unit,
    nextNode: () => Node | Null,
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: () => Node | Null,
    referenceNode: Node,
    root: Node,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[NodeIterator]
  }
  
  @scala.inline
  implicit class NodeIteratorMutableBuilder[Self <: NodeIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setNextNode(value: () => Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointerBeforeReferenceNode(value: scala.Boolean): Self = StObject.set(x, "pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNode(value: () => Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReferenceNode(value: Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
