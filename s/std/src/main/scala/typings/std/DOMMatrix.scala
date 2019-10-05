package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
  def rotateAxisAngleSelf(x: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateSelf(): DOMMatrix = js.native
  def rotateSelf(rotX: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def scale3dSelf(): DOMMatrix = js.native
  def scale3dSelf(scale: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scaleSelf(
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    scaleZ: js.UndefOr[Double],
    originX: js.UndefOr[Double],
    originY: js.UndefOr[Double],
    originZ: js.UndefOr[Double]
  ): DOMMatrix = js.native
  def setMatrixValue(transformList: java.lang.String): DOMMatrix = js.native
  def skewXSelf(): DOMMatrix = js.native
  def skewXSelf(sx: Double): DOMMatrix = js.native
  def skewYSelf(): DOMMatrix = js.native
  def skewYSelf(sy: Double): DOMMatrix = js.native
  def translateSelf(): DOMMatrix = js.native
  def translateSelf(tx: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
}

@JSGlobal("DOMMatrix")
@js.native
object DOMMatrix
  extends Instantiable0[DOMMatrix]
     with Instantiable1[(/* init */ js.Array[Double]) | (/* init */ java.lang.String), DOMMatrix] {
  def fromFloat32Array(array32: Float32Array): DOMMatrix = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrix = js.native
  def fromMatrix(): DOMMatrix = js.native
  def fromMatrix(other: DOMMatrixInit): DOMMatrix = js.native
}

