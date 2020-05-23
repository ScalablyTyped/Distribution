package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A fragment of a document that can contain nodes and parts of text nodes. */
@js.native
trait Range extends AbstractRange {
  val END_TO_END: Double = js.native
  val END_TO_START: Double = js.native
  val START_TO_END: Double = js.native
  val START_TO_START: Double = js.native
  /**
    * Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node.
    */
  val commonAncestorContainer: Node = js.native
  def cloneContents(): DocumentFragment = js.native
  def cloneRange(): Range = js.native
  def collapse(): Unit = js.native
  def collapse(toStart: scala.Boolean): Unit = js.native
  def compareBoundaryPoints(how: Double, sourceRange: Range): Double = js.native
  /**
    * Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range.
    */
  def comparePoint(node: Node, offset: Double): Double = js.native
  def createContextualFragment(fragment: java.lang.String): DocumentFragment = js.native
  def deleteContents(): Unit = js.native
  def detach(): Unit = js.native
  def extractContents(): DocumentFragment = js.native
  def getBoundingClientRect(): DOMRect = js.native
  def getClientRects(): DOMRectList = js.native
  def insertNode(node: Node): Unit = js.native
  /**
    * Returns whether range intersects node.
    */
  def intersectsNode(node: Node): scala.Boolean = js.native
  def isPointInRange(node: Node, offset: Double): scala.Boolean = js.native
  def selectNode(node: Node): Unit = js.native
  def selectNodeContents(node: Node): Unit = js.native
  def setEnd(node: Node, offset: Double): Unit = js.native
  def setEndAfter(node: Node): Unit = js.native
  def setEndBefore(node: Node): Unit = js.native
  def setStart(node: Node, offset: Double): Unit = js.native
  def setStartAfter(node: Node): Unit = js.native
  def setStartBefore(node: Node): Unit = js.native
  def surroundContents(newParent: Node): Unit = js.native
}

