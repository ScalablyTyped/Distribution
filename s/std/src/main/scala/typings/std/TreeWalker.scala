package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends StObject {
  
  var currentNode: Node
  
  val filter: NodeFilter | Null
  
  def firstChild(): Node | Null
  
  def lastChild(): Node | Null
  
  def nextNode(): Node | Null
  
  def nextSibling(): Node | Null
  
  def parentNode(): Node | Null
  
  def previousNode(): Node | Null
  
  def previousSibling(): Node | Null
  
  val root: Node
  
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
  
  extension [Self <: TreeWalker](x: Self) {
    
    inline def setCurrentNode(value: Node): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
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
