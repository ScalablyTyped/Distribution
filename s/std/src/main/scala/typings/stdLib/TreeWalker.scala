package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TreeWalker object represents the nodes of a document subtree and a position within them. */
trait TreeWalker extends js.Object {
  var currentNode: Node
  val filter: NodeFilter | scala.Null
  val root: Node
  val whatToShow: scala.Double
  def firstChild(): Node | scala.Null
  def lastChild(): Node | scala.Null
  def nextNode(): Node | scala.Null
  def nextSibling(): Node | scala.Null
  def parentNode(): Node | scala.Null
  def previousNode(): Node | scala.Null
  def previousSibling(): Node | scala.Null
}

@JSGlobal("TreeWalker")
@js.native
class TreeWalkerCls () extends TreeWalker {
  /* CompleteClass */
  override var currentNode: Node = js.native
  /* CompleteClass */
  override val filter: NodeFilter | scala.Null = js.native
  /* CompleteClass */
  override val root: Node = js.native
  /* CompleteClass */
  override val whatToShow: scala.Double = js.native
  /* CompleteClass */
  override def firstChild(): Node | scala.Null = js.native
  /* CompleteClass */
  override def lastChild(): Node | scala.Null = js.native
  /* CompleteClass */
  override def nextNode(): Node | scala.Null = js.native
  /* CompleteClass */
  override def nextSibling(): Node | scala.Null = js.native
  /* CompleteClass */
  override def parentNode(): Node | scala.Null = js.native
  /* CompleteClass */
  override def previousNode(): Node | scala.Null = js.native
  /* CompleteClass */
  override def previousSibling(): Node | scala.Null = js.native
}

@JSGlobal("TreeWalker")
@js.native
object TreeWalker
  extends org.scalablytyped.runtime.Instantiable0[TreeWalker]

