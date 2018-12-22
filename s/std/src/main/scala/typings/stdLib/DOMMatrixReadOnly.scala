package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrixReadOnly extends js.Object {
  val a: scala.Double = js.native
  val b: scala.Double = js.native
  val c: scala.Double = js.native
  val d: scala.Double = js.native
  val e: scala.Double = js.native
  val f: scala.Double = js.native
  val is2D: scala.Boolean = js.native
  val isIdentity: scala.Boolean = js.native
  val m11: scala.Double = js.native
  val m12: scala.Double = js.native
  val m13: scala.Double = js.native
  val m14: scala.Double = js.native
  val m21: scala.Double = js.native
  val m22: scala.Double = js.native
  val m23: scala.Double = js.native
  val m24: scala.Double = js.native
  val m31: scala.Double = js.native
  val m32: scala.Double = js.native
  val m33: scala.Double = js.native
  val m34: scala.Double = js.native
  val m41: scala.Double = js.native
  val m42: scala.Double = js.native
  val m43: scala.Double = js.native
  val m44: scala.Double = js.native
  def flipX(): DOMMatrix = js.native
  def flipY(): DOMMatrix = js.native
  def inverse(): DOMMatrix = js.native
  def multiply(): DOMMatrix = js.native
  def multiply(other: DOMMatrixInit): DOMMatrix = js.native
  def rotate(): DOMMatrix = js.native
  def rotate(rotX: scala.Double): DOMMatrix = js.native
  def rotate(rotX: scala.Double, rotY: scala.Double): DOMMatrix = js.native
  def rotate(rotX: scala.Double, rotY: scala.Double, rotZ: scala.Double): DOMMatrix = js.native
  def rotateAxisAngle(): DOMMatrix = js.native
  def rotateAxisAngle(x: scala.Double): DOMMatrix = js.native
  def rotateAxisAngle(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def rotateAxisAngle(x: scala.Double, y: scala.Double, z: scala.Double): DOMMatrix = js.native
  def rotateAxisAngle(x: scala.Double, y: scala.Double, z: scala.Double, angle: scala.Double): DOMMatrix = js.native
  def rotateFromVector(): DOMMatrix = js.native
  def rotateFromVector(x: scala.Double): DOMMatrix = js.native
  def rotateFromVector(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def scale(
    scaleX: js.UndefOr[scala.Double],
    scaleY: js.UndefOr[scala.Double],
    scaleZ: js.UndefOr[scala.Double],
    originX: js.UndefOr[scala.Double],
    originY: js.UndefOr[scala.Double],
    originZ: js.UndefOr[scala.Double]
  ): DOMMatrix = js.native
  def scale3d(): DOMMatrix = js.native
  def scale3d(scale: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double, originY: scala.Double, originZ: scala.Double): DOMMatrix = js.native
  def skewX(): DOMMatrix = js.native
  def skewX(sx: scala.Double): DOMMatrix = js.native
  def skewY(): DOMMatrix = js.native
  def skewY(sy: scala.Double): DOMMatrix = js.native
  def toFloat32Array(): Float32Array = js.native
  def toFloat64Array(): Float64Array = js.native
  def toJSON(): js.Any = js.native
  def transformPoint(): DOMPoint = js.native
  def transformPoint(point: DOMPointInit): DOMPoint = js.native
  def translate(): DOMMatrix = js.native
  def translate(tx: scala.Double): DOMMatrix = js.native
  def translate(tx: scala.Double, ty: scala.Double): DOMMatrix = js.native
  def translate(tx: scala.Double, ty: scala.Double, tz: scala.Double): DOMMatrix = js.native
}

@JSGlobal("DOMMatrixReadOnly")
@js.native
object DOMMatrixReadOnly
  extends org.scalablytyped.runtime.Instantiable0[DOMMatrixReadOnly]
     with org.scalablytyped.runtime.Instantiable1[
      (/* init */ js.Array[scala.Double]) | (/* init */ java.lang.String), 
      DOMMatrixReadOnly
    ] {
  def fromFloat32Array(array32: stdLib.Float32Array): stdLib.DOMMatrixReadOnly = js.native
  def fromFloat64Array(array64: stdLib.Float64Array): stdLib.DOMMatrixReadOnly = js.native
  def fromMatrix(): stdLib.DOMMatrixReadOnly = js.native
  def fromMatrix(other: stdLib.DOMMatrixInit): stdLib.DOMMatrixReadOnly = js.native
}

