package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The nodes of a document subtree and a position within them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker)
  */
trait TreeWalker extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode) */
  /* standard dom */
  var currentNode: Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter) */
  /* standard dom */
  val filter: NodeFilter | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild) */
  /* standard dom */
  def firstChild(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild) */
  /* standard dom */
  def lastChild(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode) */
  /* standard dom */
  def nextNode(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling) */
  /* standard dom */
  def nextSibling(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode) */
  /* standard dom */
  def parentNode(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode) */
  /* standard dom */
  def previousNode(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling) */
  /* standard dom */
  def previousSibling(): Node | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root) */
  /* standard dom */
  val root: Node
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow) */
  /* standard dom */
  val whatToShow: Double
}
object TreeWalker {
  
  inline def apply(
    currentNode: Node,
    firstChild: () => Node | Null,
    lastChild: () => Node | Null,
    nextNode: () => Node | Null,
    nextSibling: () => Node | Null,
    parentNode: () => Node | Null,
    previousNode: () => Node | Null,
    previousSibling: () => Node | Null,
    root: Node,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[TreeWalker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeWalker] (val x: Self) extends AnyVal {
    
    inline def setCurrentNode(value: Node): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(value: /* node */ Node => Double): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFirstChild(value: () => Node | Null): Self = StObject.set(x, "firstChild", js.Any.fromFunction0(value))
    
    inline def setLastChild(value: () => Node | Null): Self = StObject.set(x, "lastChild", js.Any.fromFunction0(value))
    
    inline def setNextNode(value: () => Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setNextSibling(value: () => Node | Null): Self = StObject.set(x, "nextSibling", js.Any.fromFunction0(value))
    
    inline def setParentNode(value: () => Node | Null): Self = StObject.set(x, "parentNode", js.Any.fromFunction0(value))
    
    inline def setPreviousNode(value: () => Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setPreviousSibling(value: () => Node | Null): Self = StObject.set(x, "previousSibling", js.Any.fromFunction0(value))
    
    inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
