package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The NodeIterator interface represents an iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends js.Object {
  val filter: NodeFilter | scala.Null
  val pointerBeforeReferenceNode: scala.Boolean
  val referenceNode: Node
  val root: Node
  val whatToShow: scala.Double
  def detach(): scala.Unit
  def nextNode(): Node | scala.Null
  def previousNode(): Node | scala.Null
}

@JSGlobal("NodeIterator")
@js.native
class NodeIteratorCls () extends NodeIterator {
  /* CompleteClass */
  override val filter: NodeFilter | scala.Null = js.native
  /* CompleteClass */
  override val pointerBeforeReferenceNode: scala.Boolean = js.native
  /* CompleteClass */
  override val referenceNode: Node = js.native
  /* CompleteClass */
  override val root: Node = js.native
  /* CompleteClass */
  override val whatToShow: scala.Double = js.native
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /* CompleteClass */
  override def nextNode(): Node | scala.Null = js.native
  /* CompleteClass */
  override def previousNode(): Node | scala.Null = js.native
}

@JSGlobal("NodeIterator")
@js.native
object NodeIterator
  extends org.scalablytyped.runtime.Instantiable0[NodeIterator]

