package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A fragment of a document that can contain nodes and parts of text nodes.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range)
  */
@js.native
trait Range
  extends StObject
     with AbstractRange {
  
  /* standard dom */
  val END_TO_END: `2` = js.native
  
  /* standard dom */
  val END_TO_START: `3` = js.native
  
  /* standard dom */
  val START_TO_END: `1` = js.native
  
  /* standard dom */
  val START_TO_START: `0` = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneContents) */
  /* standard dom */
  def cloneContents(): DocumentFragment = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneRange) */
  /* standard dom */
  def cloneRange(): Range = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/collapse) */
  /* standard dom */
  def collapse(): Unit = js.native
  def collapse(toStart: scala.Boolean): Unit = js.native
  
  /**
    * Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/commonAncestorContainer)
    */
  /* standard dom */
  val commonAncestorContainer: Node = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/compareBoundaryPoints) */
  /* standard dom */
  def compareBoundaryPoints(how: Double, sourceRange: Range): Double = js.native
  
  /**
    * Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/comparePoint)
    */
  /* standard dom */
  def comparePoint(node: Node, offset: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/createContextualFragment) */
  /* standard dom */
  def createContextualFragment(fragment: java.lang.String): DocumentFragment = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/deleteContents) */
  /* standard dom */
  def deleteContents(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/detach) */
  /* standard dom */
  def detach(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/extractContents) */
  /* standard dom */
  def extractContents(): DocumentFragment = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getBoundingClientRect) */
  /* standard dom */
  def getBoundingClientRect(): DOMRect = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getClientRects) */
  /* standard dom */
  def getClientRects(): DOMRectList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/insertNode) */
  /* standard dom */
  def insertNode(node: Node): Unit = js.native
  
  /**
    * Returns whether range intersects node.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/intersectsNode)
    */
  /* standard dom */
  def intersectsNode(node: Node): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/isPointInRange) */
  /* standard dom */
  def isPointInRange(node: Node, offset: Double): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNode) */
  /* standard dom */
  def selectNode(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNodeContents) */
  /* standard dom */
  def selectNodeContents(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEnd) */
  /* standard dom */
  def setEnd(node: Node, offset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndAfter) */
  /* standard dom */
  def setEndAfter(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndBefore) */
  /* standard dom */
  def setEndBefore(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStart) */
  /* standard dom */
  def setStart(node: Node, offset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartAfter) */
  /* standard dom */
  def setStartAfter(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartBefore) */
  /* standard dom */
  def setStartBefore(node: Node): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/surroundContents) */
  /* standard dom */
  def surroundContents(newParent: Node): Unit = js.native
}
