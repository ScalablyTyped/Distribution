package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Immutable.Record(object) * / any */ @js.native
trait BaseRange extends js.Object {
  val end: Point = js.native
  val isBackward: Boolean = js.native
  val isCollapsed: Boolean = js.native
  val isExpanded: Boolean = js.native
  val isForward: Boolean = js.native
  val isSet: Boolean = js.native
  val isUnset: Boolean = js.native
  val start: Point = js.native
  def flip(): RangeType = js.native
  def moveAnchorBackward(): RangeType = js.native
  def moveAnchorBackward(n: Double): RangeType = js.native
  def moveAnchorForward(): RangeType = js.native
  def moveAnchorForward(n: Double): RangeType = js.native
  def moveAnchorTo(path: String): RangeType = js.native
  def moveAnchorTo(path: String, offset: Double): RangeType = js.native
  def moveAnchorTo(path: Double): RangeType = js.native
  def moveAnchorTo(path: Double, offset: Double): RangeType = js.native
  def moveAnchorTo(path: List[Double]): RangeType = js.native
  def moveAnchorTo(path: List[Double], offset: Double): RangeType = js.native
  def moveAnchorToEndOfNode(node: Node): RangeType = js.native
  def moveAnchorToStartOfNode(node: Node): RangeType = js.native
  def moveBackward(): RangeType = js.native
  def moveBackward(n: Double): RangeType = js.native
  def moveEndBackward(): RangeType = js.native
  def moveEndBackward(n: Double): RangeType = js.native
  def moveEndForward(): RangeType = js.native
  def moveEndForward(n: Double): RangeType = js.native
  def moveEndTo(path: String): RangeType = js.native
  def moveEndTo(path: String, offset: Double): RangeType = js.native
  def moveEndTo(path: Double): RangeType = js.native
  def moveEndTo(path: Double, offset: Double): RangeType = js.native
  def moveEndTo(path: List[Double]): RangeType = js.native
  def moveEndTo(path: List[Double], offset: Double): RangeType = js.native
  def moveEndToEndOfNode(node: Node): RangeType = js.native
  def moveEndToStartOfNode(node: Node): RangeType = js.native
  def moveFocusBackward(): RangeType = js.native
  def moveFocusBackward(n: Double): RangeType = js.native
  def moveFocusForward(): RangeType = js.native
  def moveFocusForward(n: Double): RangeType = js.native
  def moveFocusTo(path: String): RangeType = js.native
  def moveFocusTo(path: String, offset: Double): RangeType = js.native
  def moveFocusTo(path: Double): RangeType = js.native
  def moveFocusTo(path: Double, offset: Double): RangeType = js.native
  def moveFocusTo(path: List[Double]): RangeType = js.native
  def moveFocusTo(path: List[Double], offset: Double): RangeType = js.native
  def moveFocusToEndOfNode(node: Node): RangeType = js.native
  def moveFocusToStartOfNode(node: Node): RangeType = js.native
  def moveForward(): RangeType = js.native
  def moveForward(n: Double): RangeType = js.native
  def moveStartBackward(): RangeType = js.native
  def moveStartBackward(n: Double): RangeType = js.native
  def moveStartForward(): RangeType = js.native
  def moveStartForward(n: Double): RangeType = js.native
  def moveStartTo(path: String): RangeType = js.native
  def moveStartTo(path: String, offset: Double): RangeType = js.native
  def moveStartTo(path: Double): RangeType = js.native
  def moveStartTo(path: Double, offset: Double): RangeType = js.native
  def moveStartTo(path: List[Double]): RangeType = js.native
  def moveStartTo(path: List[Double], offset: Double): RangeType = js.native
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
  def setIsAtomic(value: Boolean): RangeType = js.native
  def setIsFocused(value: Boolean): RangeType = js.native
  def setMarks(marks: Set[Mark]): RangeType = js.native
  def setPoints(values: js.Array[Point]): RangeType = js.native
  def setProperties(properties: RangeType): RangeType = js.native
  def setProperties(properties: RangeTypeJSON): RangeType = js.native
  def setProperties(properties: RangeTypeProperties): RangeType = js.native
  def setStart(point: Point): RangeType = js.native
  def toJS(): RangeTypeJSON = js.native
  def toJSON(): RangeTypeJSON = js.native
  def toRange(): RangeType = js.native
  def unset(): RangeType = js.native
  def updatePoints(updater: js.Function1[/* point */ Point, Point]): RangeType = js.native
}

