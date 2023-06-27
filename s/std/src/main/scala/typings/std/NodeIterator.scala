package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator)
  */
trait NodeIterator extends StObject {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/detach)
    */
  /* standard dom */
  def detach(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter) */
  /* standard dom */
  val filter: NodeFilter | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode) */
  /* standard dom */
  def nextNode(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode) */
  /* standard dom */
  val pointerBeforeReferenceNode: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode) */
  /* standard dom */
  def previousNode(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode) */
  /* standard dom */
  val referenceNode: Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root) */
  /* standard dom */
  val root: Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow) */
  /* standard dom */
  val whatToShow: Double
}
object NodeIterator {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: NodeIterator] (val x: Self) extends AnyVal {
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setFilter(value: NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(value: /* node */ Node => Double): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setNextNode(value: () => Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setPointerBeforeReferenceNode(value: scala.Boolean): Self = StObject.set(x, "pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    
    inline def setPreviousNode(value: () => Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setReferenceNode(value: Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
