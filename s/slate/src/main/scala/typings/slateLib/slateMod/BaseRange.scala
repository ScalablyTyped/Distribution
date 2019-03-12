package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait BaseRange extends js.Object {
  val end: Point = js.native
  val isBackward: scala.Boolean = js.native
  val isCollapsed: scala.Boolean = js.native
  val isExpanded: scala.Boolean = js.native
  val isForward: scala.Boolean = js.native
  val isSet: scala.Boolean = js.native
  val isUnset: scala.Boolean = js.native
  val start: Point = js.native
  def flip(): RangeType = js.native
  def moveAnchorBackward(): RangeType = js.native
  def moveAnchorBackward(n: scala.Double): RangeType = js.native
  def moveAnchorForward(): RangeType = js.native
  def moveAnchorForward(n: scala.Double): RangeType = js.native
  def moveAnchorTo(path: Path): RangeType = js.native
  def moveAnchorTo(path: Path, offset: scala.Double): RangeType = js.native
  def moveAnchorToEndOfNode(node: Node): RangeType = js.native
  def moveAnchorToStartOfNode(node: Node): RangeType = js.native
  def moveBackward(): RangeType = js.native
  def moveBackward(n: scala.Double): RangeType = js.native
  def moveEndBackward(): RangeType = js.native
  def moveEndBackward(n: scala.Double): RangeType = js.native
  def moveEndForward(): RangeType = js.native
  def moveEndForward(n: scala.Double): RangeType = js.native
  def moveEndTo(path: Path): RangeType = js.native
  def moveEndTo(path: Path, offset: scala.Double): RangeType = js.native
  def moveEndToEndOfNode(node: Node): RangeType = js.native
  def moveEndToStartOfNode(node: Node): RangeType = js.native
  def moveFocusBackward(): RangeType = js.native
  def moveFocusBackward(n: scala.Double): RangeType = js.native
  def moveFocusForward(): RangeType = js.native
  def moveFocusForward(n: scala.Double): RangeType = js.native
  def moveFocusTo(path: Path): RangeType = js.native
  def moveFocusTo(path: Path, offset: scala.Double): RangeType = js.native
  def moveFocusToEndOfNode(node: Node): RangeType = js.native
  def moveFocusToStartOfNode(node: Node): RangeType = js.native
  def moveForward(): RangeType = js.native
  def moveForward(n: scala.Double): RangeType = js.native
  def moveStartBackward(): RangeType = js.native
  def moveStartBackward(n: scala.Double): RangeType = js.native
  def moveStartForward(): RangeType = js.native
  def moveStartForward(n: scala.Double): RangeType = js.native
  def moveStartTo(path: Path): RangeType = js.native
  def moveStartTo(path: Path, offset: scala.Double): RangeType = js.native
  def moveStartToEndOfNode(node: Node): RangeType = js.native
  def moveStartToStartOfNode(node: Node): RangeType = js.native
  def moveToAnchor(): RangeType = js.native
  def moveToEnd(): RangeType = js.native
  def moveToEndOfNode(node: Node): RangeType = js.native
  def moveToFocus(): RangeType = js.native
  def moveToRangeOfNode(start: Node): RangeType = js.native
  def moveToRangeOfNode(start: Node, end: Node): RangeType = js.native
  def moveToStart(): RangeType = js.native
  def moveToStartOfNode(node: Node): RangeType = js.native
  def normalize(node: Node): RangeType = js.native
  def setAnchor(anchor: Point): RangeType = js.native
  def setEnd(point: Point): RangeType = js.native
  def setFocus(focus: Point): RangeType = js.native
  def setIsAtomic(value: scala.Boolean): RangeType = js.native
  def setIsFocused(value: scala.Boolean): RangeType = js.native
  def setMarks(marks: immutableLib.immutableMod.Set[Mark]): RangeType = js.native
  def setPoints(values: js.Array[Point]): RangeType = js.native
  def setProperties(properties: java.lang.String): RangeType = js.native
  def setProperties(properties: RangeType): RangeType = js.native
  def setProperties(properties: RangeTypeProperties): RangeType = js.native
  def setStart(point: Point): RangeType = js.native
  def toJSON(): RangeTypeJSON = js.native
  def toRange(): RangeType = js.native
  def unset(): RangeType = js.native
  def updatePoints(updator: js.Function0[Point]): RangeType = js.native
}

