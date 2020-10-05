package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The nodes of a document subtree and a position within them. */
@js.native
trait TreeWalker extends js.Object {
  var currentNode: Node = js.native
  val filter: NodeFilter | Null = js.native
  val root: Node = js.native
  val whatToShow: Double = js.native
  def firstChild(): Node | Null = js.native
  def lastChild(): Node | Null = js.native
  def nextNode(): Node | Null = js.native
  def nextSibling(): Node | Null = js.native
  def parentNode(): Node | Null = js.native
  def previousNode(): Node | Null = js.native
  def previousSibling(): Node | Null = js.native
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
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  @scala.inline
  implicit class TreeWalkerOps[Self <: TreeWalker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentNode(value: Node): Self = this.set("currentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: () => Node | Null): Self = this.set("firstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setLastChild(value: () => Node | Null): Self = this.set("lastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNode(value: () => Node | Null): Self = this.set("nextNode", js.Any.fromFunction0(value))
    @scala.inline
    def setNextSibling(value: () => Node | Null): Self = this.set("nextSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setParentNode(value: () => Node | Null): Self = this.set("parentNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousNode(value: () => Node | Null): Self = this.set("previousNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousSibling(value: () => Node | Null): Self = this.set("previousSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setRoot(value: Node): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhatToShow(value: Double): Self = this.set("whatToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: NodeFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
  }
  
}

