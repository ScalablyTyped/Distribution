package typings.slate.slateMod

import typings.slate.slateStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Point")
@js.native
class Point () extends js.Object {
  val isSet: Boolean = js.native
  val isUnset: Boolean = js.native
  var key: String | Null = js.native
  var `object`: point = js.native
  var offset: Double = js.native
  var path: Path | Null = js.native
  def isAtEndOfNode(node: Node): Boolean = js.native
  def isAtStartOfNode(node: Node): Boolean = js.native
  def isInNode(node: Node): Boolean = js.native
  def moveBackward(): Point = js.native
  def moveBackward(n: Double): Point = js.native
  def moveForward(): Point = js.native
  def moveForward(n: Double): Point = js.native
  def moveTo(path: Path): Point = js.native
  def moveTo(path: Path, offset: Double): Point = js.native
  def moveToEndOfNode(node: Node): Point = js.native
  def moveToStartOfNode(node: Node): Point = js.native
  def normalize(node: Node): Point = js.native
  def setKey(key: String): Point = js.native
  def setOffset(offset: Double): Point = js.native
  def setPath(path: Path): Point = js.native
  def toJSON(options: js.Any): js.Object = js.native
  def unset(): Point = js.native
}

/* static members */
@JSImport("slate", "Point")
@js.native
object Point extends js.Object {
  def create(properties: Point): Point = js.native
  def create(properties: PointProperties): Point = js.native
  def createProperties(properties: Point): Point = js.native
  def createProperties(properties: PointProperties): Point = js.native
  def fromJS(properties: PointJSON): Point = js.native
  def fromJSON(properties: PointJSON): Point = js.native
  def isPoint(maybePoint: js.Any): /* is slate.slate.Point */ Boolean = js.native
}

