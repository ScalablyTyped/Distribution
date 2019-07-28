package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object used to filter the nodes in a NodeIterator or TreeWalker. They don't know anything about the DOM or how to traverse nodes; they just know how to evaluate a single node against the provided filter. */
trait NodeFilter extends js.Object {
  def acceptNode(node: Node): Double
}

@JSGlobal("NodeFilter")
@js.native
object NodeFilter extends js.Object {
  val FILTER_ACCEPT: Double = js.native
  val FILTER_REJECT: Double = js.native
  val FILTER_SKIP: Double = js.native
  val SHOW_ALL: Double = js.native
  val SHOW_ATTRIBUTE: Double = js.native
  val SHOW_CDATA_SECTION: Double = js.native
  val SHOW_COMMENT: Double = js.native
  val SHOW_DOCUMENT: Double = js.native
  val SHOW_DOCUMENT_FRAGMENT: Double = js.native
  val SHOW_DOCUMENT_TYPE: Double = js.native
  val SHOW_ELEMENT: Double = js.native
  val SHOW_ENTITY: Double = js.native
  val SHOW_ENTITY_REFERENCE: Double = js.native
  val SHOW_NOTATION: Double = js.native
  val SHOW_PROCESSING_INSTRUCTION: Double = js.native
  val SHOW_TEXT: Double = js.native
}

