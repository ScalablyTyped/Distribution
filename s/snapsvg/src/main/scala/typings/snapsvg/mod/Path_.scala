package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path_ extends js.Object {
  def bezierBBox(args: Double*): BBox = js.native
  def bezierBBox(bez: js.Array[Double]): BBox = js.native
  def findDotsAtSegment(
    p1x: Double,
    p1y: Double,
    c1x: Double,
    c1y: Double,
    c2x: Double,
    c2y: Double,
    p2x: Double,
    p2y: Double,
    t: Double
  ): js.Object = js.native
  def getBBox(path: String): BBox = js.native
  def getPointAtLength(path: String, length: Double): js.Object = js.native
  def getSubpath(path: String, from: Double, to: Double): String = js.native
  def getTotalLength(path: String): Double = js.native
  def intersection(path1: String, path2: String): js.Array[IntersectionDot] = js.native
  def isBBoxIntersect(bbox1: BBox, bbox2: BBox): Boolean = js.native
  def isPointInside(path: String, x: Double, y: Double): Boolean = js.native
  def isPointInsideBBox(bbox: BBox, x: Double, y: Double): Boolean = js.native
  def map(path: String, matrix: js.Object): String = js.native
  def map(path: String, matrix: Matrix_): String = js.native
  def toAbsolute(path: String): js.Array[_] = js.native
  def toCubic(pathString: String): js.Array[_] = js.native
  def toCubic(pathString: js.Array[String]): js.Array[_] = js.native
  def toRelative(path: String): js.Array[_] = js.native
}

