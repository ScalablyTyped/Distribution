package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Selection extends js.Object {
  val anchorNode: Node
  val anchorOffset: scala.Double
  val baseNode: Node
  val baseOffset: scala.Double
  val extentNode: Node
  val extentOffset: scala.Double
  val focusNode: Node
  val focusOffset: scala.Double
  val isCollapsed: scala.Boolean
  val rangeCount: scala.Double
  val `type`: java.lang.String
  def addRange(range: Range): scala.Unit
  def collapse(parentNode: Node, offset: scala.Double): scala.Unit
  def collapseToEnd(): scala.Unit
  def collapseToStart(): scala.Unit
  def containsNode(node: Node, partlyContained: scala.Boolean): scala.Boolean
  def deleteFromDocument(): scala.Unit
  def empty(): scala.Unit
  def extend(newNode: Node, offset: scala.Double): scala.Unit
  def getRangeAt(index: scala.Double): Range
  def removeAllRanges(): scala.Unit
  def removeRange(range: Range): scala.Unit
  def selectAllChildren(parentNode: Node): scala.Unit
  def setBaseAndExtent(baseNode: Node, baseOffset: scala.Double, extentNode: Node, extentOffset: scala.Double): scala.Unit
  def setPosition(parentNode: Node, offset: scala.Double): scala.Unit
}

@JSGlobal("Selection")
@js.native
object Selection
  extends org.scalablytyped.runtime.Instantiable0[Selection]

