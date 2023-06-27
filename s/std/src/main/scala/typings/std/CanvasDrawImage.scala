package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasDrawImage extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage) */
  /* standard dom */
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double): Unit = js.native
  /* standard dom */
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  /* standard dom */
  def drawImage(
    image: CanvasImageSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
}
