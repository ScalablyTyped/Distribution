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
object NodeIterator extends Instantiable0[NodeIterator]

