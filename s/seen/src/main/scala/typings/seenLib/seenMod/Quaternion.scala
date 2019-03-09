package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  var q: Point = js.native
  def multiply(q: Point): this.type = js.native
  def toMatrix(): Matrix = js.native
}

/* static members */
@JSImport("seen", "Quaternion")
@js.native
object Quaternion extends js.Object {
  var pixelsPerRadian: scala.Double = js.native
  def axisAngle(x: scala.Double, y: scala.Double, z: scala.Double, angleRads: scala.Double): seenLib.seenMod.Quaternion = js.native
  def pointAngle(p: seenLib.seenMod.Point, angleRads: scala.Double): seenLib.seenMod.Quaternion = js.native
  def xyToTransform(x: scala.Double, y: scala.Double): seenLib.seenMod.Matrix = js.native
}

