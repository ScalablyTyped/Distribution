package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Point")
@js.native
class Point () extends js.Object {
  val isSet: scala.Boolean = js.native
  val isUnset: scala.Boolean = js.native
  var key: java.lang.String | scala.Null = js.native
  var `object`: slateLib.slateLibStrings.point = js.native
  var offset: scala.Double = js.native
  var path: Path | scala.Null = js.native
  def isAtEndOfNode(node: Node): scala.Boolean = js.native
  def isAtStartOfNode(node: Node): scala.Boolean = js.native
  def isInNode(node: Node): scala.Boolean = js.native
  def moveBackward(): Point = js.native
  def moveBackward(n: scala.Double): Point = js.native
  def moveForward(): Point = js.native
  def moveForward(n: scala.Double): Point = js.native
  def moveTo(path: Path): Point = js.native
  def moveTo(path: Path, offset: scala.Double): Point = js.native
  def moveToEndOfNode(node: Node): Point = js.native
  def moveToStartOfNode(node: Node): Point = js.native
  def normalize(node: Node): Point = js.native
  def setKey(key: java.lang.String): Point = js.native
  def setOffset(offset: scala.Double): Point = js.native
  def setPath(path: Path): Point = js.native
  def toJSON(options: js.Any): js.Object = js.native
  def unset(): Point = js.native
}

/* static members */
@JSImport("slate", "Point")
@js.native
object Point extends js.Object {
  def create(properties: slateLib.slateMod.Point): slateLib.slateMod.Point = js.native
  def create(properties: slateLib.slateMod.PointProperties): slateLib.slateMod.Point = js.native
  def createProperties(properties: slateLib.slateMod.Point): slateLib.slateMod.Point = js.native
  def createProperties(properties: slateLib.slateMod.PointProperties): slateLib.slateMod.Point = js.native
  def fromJS(properties: slateLib.slateMod.PointJSON): slateLib.slateMod.Point = js.native
  def fromJSON(properties: slateLib.slateMod.PointJSON): slateLib.slateMod.Point = js.native
  def isPoint(maybePoint: js.Any): /* is slate.slate.Point */ scala.Boolean = js.native
}

