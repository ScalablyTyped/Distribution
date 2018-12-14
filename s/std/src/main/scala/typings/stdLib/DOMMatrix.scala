package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix extends DOMMatrixReadOnly {
  def invertSelf(): DOMMatrix = js.native
  def multiplySelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  def preMultiplySelf(): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  def rotateAxisAngleSelf(): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: scala.Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: scala.Double, y: scala.Double, z: scala.Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: scala.Double, y: scala.Double, z: scala.Double, angle: scala.Double): DOMMatrix = js.native
  def rotateFromVectorSelf(): DOMMatrix = js.native
  def rotateFromVectorSelf(x: scala.Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def rotateSelf(): DOMMatrix = js.native
  def rotateSelf(rotX: scala.Double): DOMMatrix = js.native
  def rotateSelf(rotX: scala.Double, rotY: scala.Double): DOMMatrix = js.native
  def rotateSelf(rotX: scala.Double, rotY: scala.Double, rotZ: scala.Double): DOMMatrix = js.native
  def scale3dSelf(): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double, originY: scala.Double, originZ: scala.Double): DOMMatrix = js.native
  def scaleSelf(
    scaleX: js.UndefOr[scala.Double],
    scaleY: js.UndefOr[scala.Double],
    scaleZ: js.UndefOr[scala.Double],
    originX: js.UndefOr[scala.Double],
    originY: js.UndefOr[scala.Double],
    originZ: js.UndefOr[scala.Double]
  ): DOMMatrix = js.native
  def setMatrixValue(transformList: java.lang.String): DOMMatrix = js.native
  def skewXSelf(): DOMMatrix = js.native
  def skewXSelf(sx: scala.Double): DOMMatrix = js.native
  def skewYSelf(): DOMMatrix = js.native
  def skewYSelf(sy: scala.Double): DOMMatrix = js.native
  def translateSelf(): DOMMatrix = js.native
  def translateSelf(tx: scala.Double): DOMMatrix = js.native
  def translateSelf(tx: scala.Double, ty: scala.Double): DOMMatrix = js.native
  def translateSelf(tx: scala.Double, ty: scala.Double, tz: scala.Double): DOMMatrix = js.native
}

@JSGlobal("DOMMatrix")
@js.native
object DOMMatrix
  extends org.scalablytyped.runtime.Instantiable0[DOMMatrix]
     with org.scalablytyped.runtime.Instantiable1[(/* init */ java.lang.String) | (/* init */ js.Array[scala.Double]), DOMMatrix] {
  def fromFloat32Array(array32: stdLib.Float32Array): stdLib.DOMMatrix = js.native
  def fromFloat64Array(array64: stdLib.Float64Array): stdLib.DOMMatrix = js.native
  def fromMatrix(): stdLib.DOMMatrix = js.native
  def fromMatrix(other: stdLib.DOMMatrixInit): stdLib.DOMMatrix = js.native
}

