package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends js.Object {
  val anchorNode: Node | scala.Null = js.native
  val anchorOffset: scala.Double = js.native
  val focusNode: Node | scala.Null = js.native
  val focusOffset: scala.Double = js.native
  val isCollapsed: scala.Boolean = js.native
  val rangeCount: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def addRange(range: Range): scala.Unit = js.native
  def collapse(): scala.Unit = js.native
  def collapse(node: scala.Null, offset: scala.Double): scala.Unit = js.native
  def collapse(node: Node): scala.Unit = js.native
  def collapse(node: Node, offset: scala.Double): scala.Unit = js.native
  def collapseToEnd(): scala.Unit = js.native
  def collapseToStart(): scala.Unit = js.native
  def containsNode(node: Node): scala.Boolean = js.native
  def containsNode(node: Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  def deleteFromDocument(): scala.Unit = js.native
  def empty(): scala.Unit = js.native
  def extend(node: Node): scala.Unit = js.native
  def extend(node: Node, offset: scala.Double): scala.Unit = js.native
  def getRangeAt(index: scala.Double): Range = js.native
  def removeAllRanges(): scala.Unit = js.native
  def removeRange(range: Range): scala.Unit = js.native
  def selectAllChildren(node: Node): scala.Unit = js.native
  def setBaseAndExtent(anchorNode: Node, anchorOffset: scala.Double, focusNode: Node, focusOffset: scala.Double): scala.Unit = js.native
  def setPosition(): scala.Unit = js.native
  def setPosition(node: scala.Null, offset: scala.Double): scala.Unit = js.native
  def setPosition(node: Node): scala.Unit = js.native
  def setPosition(node: Node, offset: scala.Double): scala.Unit = js.native
}

@JSGlobal("Selection")
@js.native
class SelectionCls () extends Selection

@JSGlobal("Selection")
@js.native
object Selection
  extends org.scalablytyped.runtime.Instantiable0[Selection]

