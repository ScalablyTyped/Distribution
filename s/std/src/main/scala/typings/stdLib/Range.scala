package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends AbstractRange {
  val END_TO_END: scala.Double = js.native
  val END_TO_START: scala.Double = js.native
  val START_TO_END: scala.Double = js.native
  val START_TO_START: scala.Double = js.native
  /**
       * Returns the node, furthest away from
       * the document, that is an ancestor of both range's start node and end node.
       */
  val commonAncestorContainer: Node = js.native
  def cloneContents(): DocumentFragment = js.native
  def cloneRange(): Range = js.native
  def collapse(): scala.Unit = js.native
  def collapse(toStart: scala.Boolean): scala.Unit = js.native
  def compareBoundaryPoints(how: scala.Double, sourceRange: Range): scala.Double = js.native
  /**
       * Returns −1 if the point is before the range, 0 if the point is
       * in the range, and 1 if the point is after the range.
       */
  def comparePoint(node: Node, offset: scala.Double): scala.Double = js.native
  def createContextualFragment(fragment: java.lang.String): DocumentFragment = js.native
  def deleteContents(): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def extractContents(): DocumentFragment = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def insertNode(node: Node): scala.Unit = js.native
  /**
       * Returns whether range intersects node.
       */
  def intersectsNode(node: Node): scala.Boolean = js.native
  def isPointInRange(node: Node, offset: scala.Double): scala.Boolean = js.native
  def selectNode(node: Node): scala.Unit = js.native
  def selectNodeContents(node: Node): scala.Unit = js.native
  def setEnd(node: Node, offset: scala.Double): scala.Unit = js.native
  def setEndAfter(node: Node): scala.Unit = js.native
  def setEndBefore(node: Node): scala.Unit = js.native
  def setStart(node: Node, offset: scala.Double): scala.Unit = js.native
  def setStartAfter(node: Node): scala.Unit = js.native
  def setStartBefore(node: Node): scala.Unit = js.native
  def surroundContents(newParent: Node): scala.Unit = js.native
}

@JSGlobal("Range")
@js.native
object Range
  extends org.scalablytyped.runtime.Instantiable0[Range] {
  val END_TO_END: scala.Double = js.native
  val END_TO_START: scala.Double = js.native
  val START_TO_END: scala.Double = js.native
  val START_TO_START: scala.Double = js.native
}

