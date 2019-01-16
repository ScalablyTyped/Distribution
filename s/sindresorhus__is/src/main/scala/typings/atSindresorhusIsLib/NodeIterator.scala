package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object NodeIterator
  extends org.scalablytyped.runtime.Instantiable0[NodeIterator]

