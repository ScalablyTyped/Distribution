package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  def bezierBBox(args: scala.Double*): BBox = js.native
  def bezierBBox(bez: js.Array[scala.Double]): BBox = js.native
  def findDotsAtSegment(
    p1x: scala.Double,
    p1y: scala.Double,
    c1x: scala.Double,
    c1y: scala.Double,
    c2x: scala.Double,
    c2y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double,
    t: scala.Double
  ): js.Object = js.native
  def getBBox(path: java.lang.String): BBox = js.native
  def getPointAtLength(path: java.lang.String, length: scala.Double): js.Object = js.native
  def getSubpath(path: java.lang.String, from: scala.Double, to: scala.Double): java.lang.String = js.native
  def getTotalLength(path: java.lang.String): scala.Double = js.native
  def intersection(path1: java.lang.String, path2: java.lang.String): js.Array[IntersectionDot] = js.native
  def isBBoxIntersect(bbox1: BBox, bbox2: BBox): scala.Boolean = js.native
  def isPointInside(path: java.lang.String, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInsideBBox(bbox: BBox, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def map(path: java.lang.String, matrix: js.Object): java.lang.String = js.native
  def map(path: java.lang.String, matrix: Matrix): java.lang.String = js.native
  def toAbsolute(path: java.lang.String): js.Array[_] = js.native
  def toCubic(pathString: java.lang.String): js.Array[_] = js.native
  def toCubic(pathString: js.Array[java.lang.String]): js.Array[_] = js.native
  def toRelative(path: java.lang.String): js.Array[_] = js.native
}

