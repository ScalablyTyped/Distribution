package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends js.Object {
  val filter: NodeFilter | Null
  val pointerBeforeReferenceNode: scala.Boolean
  val referenceNode: Node
  val root: Node
  val whatToShow: Double
  def detach(): Unit
  def nextNode(): Node | Null
  def previousNode(): Node | Null
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
    whatToShow: Double,
    filter: NodeFilter = null
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
}

