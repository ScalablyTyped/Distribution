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
object TreeWalker extends Instantiable0[TreeWalker]

