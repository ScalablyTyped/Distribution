package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("NodeIterator")
@js.native
class NodeIteratorCls () extends NodeIterator {
  /* CompleteClass */
  override val filter: NodeFilter | Null = js.native
  /* CompleteClass */
  override val pointerBeforeReferenceNode: scala.Boolean = js.native
  /* CompleteClass */
  override val referenceNode: Node = js.native
  /* CompleteClass */
  override val root: Node = js.native
  /* CompleteClass */
  override val whatToShow: Double = js.native
  /* CompleteClass */
  override def detach(): Unit = js.native
  /* CompleteClass */
  override def nextNode(): Node | Null = js.native
  /* CompleteClass */
  override def previousNode(): Node | Null = js.native
}

@JSGlobal("NodeIterator")
@js.native
object NodeIterator extends Instantiable0[NodeIterator]

