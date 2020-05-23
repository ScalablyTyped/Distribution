package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends js.Object {
  val anchorNode: Node | Null = js.native
  val anchorOffset: Double = js.native
  val focusNode: Node | Null = js.native
  val focusOffset: Double = js.native
  val isCollapsed: scala.Boolean = js.native
  val rangeCount: Double = js.native
  val `type`: java.lang.String = js.native
  def addRange(range: Range): Unit = js.native
  def collapse(): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  def collapse(node: Node): Unit = js.native
  def collapse(node: Node, offset: Double): Unit = js.native
  def collapseToEnd(): Unit = js.native
  def collapseToStart(): Unit = js.native
  def containsNode(node: Node): scala.Boolean = js.native
  def containsNode(node: Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  def deleteFromDocument(): Unit = js.native
  def empty(): Unit = js.native
  def extend(node: Node): Unit = js.native
  def extend(node: Node, offset: Double): Unit = js.native
  def getRangeAt(index: Double): Range = js.native
  def removeAllRanges(): Unit = js.native
  def removeRange(range: Range): Unit = js.native
  def selectAllChildren(node: Node): Unit = js.native
  def setBaseAndExtent(anchorNode: Node, anchorOffset: Double, focusNode: Node, focusOffset: Double): Unit = js.native
  def setPosition(): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  def setPosition(node: Node): Unit = js.native
  def setPosition(node: Node, offset: Double): Unit = js.native
}

