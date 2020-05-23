package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends js.Object {
  var currentNode: Node
  val filter: NodeFilter | Null
  val root: Node
  val whatToShow: Double
  def firstChild(): Node | Null
  def lastChild(): Node | Null
  def nextNode(): Node | Null
  def nextSibling(): Node | Null
  def parentNode(): Node | Null
  def previousNode(): Node | Null
  def previousSibling(): Node | Null
}

object TreeWalker {
  @scala.inline
  def apply(
    currentNode: Node,
    firstChild: () => Node | Null,
    lastChild: () => Node | Null,
    nextNode: () => Node | Null,
    nextSibling: () => Node | Null,
    parentNode: () => Node | Null,
    previousNode: () => Node | Null,
    previousSibling: () => Node | Null,
    root: Node,
    whatToShow: Double,
    filter: NodeFilter = null
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
}

