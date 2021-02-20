package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrix extends DOMMatrixReadOnly {
  
  def invertSelf(): DOMMatrix = js.native
  
  def multiplySelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  
  def preMultiplySelf(): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrixInit): DOMMatrix = js.native
  
  def rotateAxisAngleSelf(): DOMMatrix = js.native
  def rotateAxisAngleSelf(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    angle: Double
  ): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: js.UndefOr[scala.Nothing], y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: js.UndefOr[scala.Nothing], z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: js.UndefOr[scala.Nothing], z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: js.UndefOr[scala.Nothing], angle: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  
  def rotateFromVectorSelf(): DOMMatrix = js.native
  def rotateFromVectorSelf(x: js.UndefOr[scala.Nothing], y: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
  
  def rotateSelf(): DOMMatrix = js.native
  def rotateSelf(rotX: js.UndefOr[scala.Nothing], rotY: js.UndefOr[scala.Nothing], rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: js.UndefOr[scala.Nothing], rotY: Double): DOMMatrix = js.native
  def rotateSelf(rotX: js.UndefOr[scala.Nothing], rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: js.UndefOr[scala.Nothing], rotZ: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotateSelf(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  
  def scale3dSelf(): DOMMatrix = js.native
  def scale3dSelf(
    scale: js.UndefOr[scala.Nothing],
    originX: js.UndefOr[scala.Nothing],
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3dSelf(scale: js.UndefOr[scala.Nothing], originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
  def scale3dSelf(
    scale: js.UndefOr[scala.Nothing],
    originX: js.UndefOr[scala.Nothing],
    originY: Double,
    originZ: Double
  ): DOMMatrix = js.native
  def scale3dSelf(scale: js.UndefOr[scala.Nothing], originX: Double): DOMMatrix = js.native
  def scale3dSelf(
    scale: js.UndefOr[scala.Nothing],
    originX: Double,
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3dSelf(scale: js.UndefOr[scala.Nothing], originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: js.UndefOr[scala.Nothing], originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double): DOMMatrix = js.native
  def scale3dSelf(
    scale: Double,
    originX: js.UndefOr[scala.Nothing],
    originY: js.UndefOr[scala.Nothing],
    originZ: Double
  ): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: js.UndefOr[scala.Nothing], originZ: Double): DOMMatrix = js.native
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
  def translateSelf(tx: js.UndefOr[scala.Nothing], ty: js.UndefOr[scala.Nothing], tz: Double): DOMMatrix = js.native
  def translateSelf(tx: js.UndefOr[scala.Nothing], ty: Double): DOMMatrix = js.native
  def translateSelf(tx: js.UndefOr[scala.Nothing], ty: Double, tz: Double): DOMMatrix = js.native
  def translateSelf(tx: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: js.UndefOr[scala.Nothing], tz: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
}
