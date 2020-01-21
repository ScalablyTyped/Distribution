package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.AnonPreserveKeys
import typings.slate.slateStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "Point")
@js.native
class Point () extends js.Object {
  val isSet: Boolean = js.native
  val isUnset: Boolean = js.native
  var key: String = js.native
  var `object`: point = js.native
  var offset: Double = js.native
  var path: List[Double] = js.native
  def isAfterPoint(point: Point): Boolean = js.native
  def isAfterRange(range: RangeType): Boolean = js.native
  def isAtEndOfNode(node: Node): Boolean = js.native
  def isAtEndofRange(range: RangeType): Boolean = js.native
  def isAtStartOfNode(node: Node): Boolean = js.native
  def isAtStartOfRange(range: RangeType): Boolean = js.native
  def isBeforePoint(point: Point): Boolean = js.native
  def isBeforeRange(range: RangeType): Boolean = js.native
  def isInNode(node: Node): Boolean = js.native
  def isInRange(range: RangeType): Boolean = js.native
  def moveBackward(): this.type = js.native
  def moveBackward(n: Double): this.type = js.native
  def moveForward(): this.type = js.native
  def moveForward(n: Double): this.type = js.native
  def moveTo(path: String): this.type = js.native
  def moveTo(path: String, offset: Double): this.type = js.native
  def moveTo(path: Double): this.type = js.native
  def moveTo(path: Double, offset: Double): this.type = js.native
  def moveTo(path: List[Double]): this.type = js.native
  def moveTo(path: List[Double], offset: Double): this.type = js.native
  def moveToEndOfNode(node: Node): this.type = js.native
  def moveToStartOfNode(node: Node): this.type = js.native
  def normalize(node: Node): this.type = js.native
  def setKey(key: String): this.type = js.native
  def setOffset(offset: Double): this.type = js.native
  def setPath(path: js.Array[Double]): this.type = js.native
  def setPath(path: List[Double]): this.type = js.native
  def toJS(): PointJSON = js.native
  def toJS(options: AnonPreserveKeys): PointJSON = js.native
  def toJSON(): PointJSON = js.native
  def toJSON(options: AnonPreserveKeys): PointJSON = js.native
  def unset(): this.type = js.native
}

/* static members */
@JSImport("slate", "Point")
@js.native
object Point extends js.Object {
  def create(properties: Point): Point = js.native
  def create(properties: PointJSON): Point = js.native
  def create(properties: PointProperties): Point = js.native
  def createProperties(properties: Point): Point = js.native
  def createProperties(properties: PointJSON): Point = js.native
  def createProperties(properties: PointProperties): Point = js.native
  def fromJS(properties: PointJSON): Point = js.native
  def fromJS(properties: PointProperties): Point = js.native
  def fromJSON(properties: PointJSON): Point = js.native
  def fromJSON(properties: PointProperties): Point = js.native
  def isPoint(maybePoint: js.Any): /* is slate.slate.Point */ Boolean = js.native
}

