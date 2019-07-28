package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("TreeWalker")
@js.native
class TreeWalkerCls () extends TreeWalker {
  /* CompleteClass */
  override var currentNode: Node = js.native
  /* CompleteClass */
  override val filter: NodeFilter | Null = js.native
  /* CompleteClass */
  override val root: Node = js.native
  /* CompleteClass */
  override val whatToShow: Double = js.native
  /* CompleteClass */
  override def firstChild(): Node | Null = js.native
  /* CompleteClass */
  override def lastChild(): Node | Null = js.native
  /* CompleteClass */
  override def nextNode(): Node | Null = js.native
  /* CompleteClass */
  override def nextSibling(): Node | Null = js.native
  /* CompleteClass */
  override def parentNode(): Node | Null = js.native
  /* CompleteClass */
  override def previousNode(): Node | Null = js.native
  /* CompleteClass */
  override def previousSibling(): Node | Null = js.native
}

@JSGlobal("TreeWalker")
@js.native
object TreeWalker extends Instantiable0[TreeWalker]

