package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageData extends StObject {
  
  /* standard dom */
  def createImageData(imagedata: ImageData): ImageData = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
  /* standard dom */
  def createImageData(sw: Double, sh: Double): ImageData = js.native
  def createImageData(sw: Double, sh: Double, settings: ImageDataSettings): ImageData = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
  /* standard dom */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double, settings: ImageDataSettings): ImageData = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
  /* standard dom */
  def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit = js.native
  /* standard dom */
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
}
