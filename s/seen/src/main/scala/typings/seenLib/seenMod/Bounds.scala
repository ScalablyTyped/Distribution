package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Bounds")
@js.native
class Bounds () extends js.Object {
  def add(p: Point): this.type = js.native
  def center(): Point = js.native
  def contains(p: Point): scala.Boolean = js.native
  def copy(): this.type = js.native
  def depth(): scala.Double = js.native
  def height(): scala.Double = js.native
  def intersect(box: Bounds): this.type = js.native
  def maxX(): scala.Double = js.native
  def maxY(): scala.Double = js.native
  def maxZ(): scala.Double = js.native
  def minX(): scala.Double = js.native
  def minY(): scala.Double = js.native
  def minZ(): scala.Double = js.native
  def pad(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  def reset(): this.type = js.native
  def valid(): scala.Boolean = js.native
  def width(): scala.Double = js.native
}

/* static members */
@JSImport("seen", "Bounds")
@js.native
object Bounds extends js.Object {
  def points(points: js.Array[seenLib.seenMod.Point]): seenLib.seenMod.Bounds = js.native
  def xywh(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): seenLib.seenMod.Bounds = js.native
  def xyzwhd(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double,
    h: scala.Double,
    d: scala.Double
  ): seenLib.seenMod.Bounds = js.native
}

