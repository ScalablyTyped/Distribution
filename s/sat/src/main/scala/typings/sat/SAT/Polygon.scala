package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends js.Object {
  var angle: Double
  var calcPoints: js.Array[Vector]
  var edges: js.Array[Vector]
  var normals: js.Array[Vector]
  var offset: Vector
  var points: js.Array[Vector]
  var pos: Vector
  def getAABB(): Polygon
  def getCentroid(): Vector
  def rotate(angle: Double): Polygon
  def setAngle(angle: Double): Polygon
  def setOffset(offset: Vector): Polygon
  def setPoints(points: js.Array[Vector]): Polygon
  def translate(x: Double, y: Double): Polygon
}

object Polygon {
  @scala.inline
  def apply(
    angle: Double,
    calcPoints: js.Array[Vector],
    edges: js.Array[Vector],
    getAABB: () => Polygon,
    getCentroid: () => Vector,
    normals: js.Array[Vector],
    offset: Vector,
    points: js.Array[Vector],
    pos: Vector,
    rotate: Double => Polygon,
    setAngle: Double => Polygon,
    setOffset: Vector => Polygon,
    setPoints: js.Array[Vector] => Polygon,
    translate: (Double, Double) => Polygon
  ): Polygon = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], calcPoints = calcPoints.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getAABB = js.Any.fromFunction0(getAABB), getCentroid = js.Any.fromFunction0(getCentroid), normals = normals.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rotate = js.Any.fromFunction1(rotate), setAngle = js.Any.fromFunction1(setAngle), setOffset = js.Any.fromFunction1(setOffset), setPoints = js.Any.fromFunction1(setPoints), translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[Polygon]
  }
}

