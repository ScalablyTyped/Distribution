package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrix
  extends StObject
     with DOMMatrixReadOnly {
  
  /* standard dom */
  def invertSelf(): DOMMatrix = js.native
  
  /* standard dom */
  def multiplySelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  
  /* standard dom */
  def preMultiplySelf(): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  
  /* standard dom */
  def rotateAxisAngleSelf(): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Unit, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Unit, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Unit, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
  
  /* standard dom */
  def rotateFromVectorSelf(): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Unit, y: Double): DOMMatrix = js.native
  
  /* standard dom */
  def rotateSelf(): DOMMatrix = js.native
  def rotateSelf(rotX: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Unit, rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Unit, rotY: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Unit, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Unit, rotY: Unit, rotZ: Double): DOMMatrix = js.native
  
  /* standard dom */
  def scale3dSelf(): DOMMatrix = js.native
  def scale3dSelf(scale: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
  
  /* standard dom */
  def scaleSelf(
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    scaleZ: js.UndefOr[Double],
    originX: js.UndefOr[Double],
    originY: js.UndefOr[Double],
    originZ: js.UndefOr[Double]
  ): DOMMatrix = js.native
  
  /* standard dom */
  def setMatrixValue(transformList: java.lang.String): DOMMatrix = js.native
  
  /* standard dom */
  def skewXSelf(): DOMMatrix = js.native
  def skewXSelf(sx: Double): DOMMatrix = js.native
  
  /* standard dom */
  def skewYSelf(): DOMMatrix = js.native
  def skewYSelf(sy: Double): DOMMatrix = js.native
  
  /* standard dom */
  def translateSelf(): DOMMatrix = js.native
  def translateSelf(tx: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Unit, tz: Double): DOMMatrix = js.native
  def translateSelf(tx: Unit, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Unit, ty: Double, tz: Double): DOMMatrix = js.native
  def translateSelf(tx: Unit, ty: Unit, tz: Double): DOMMatrix = js.native
}
