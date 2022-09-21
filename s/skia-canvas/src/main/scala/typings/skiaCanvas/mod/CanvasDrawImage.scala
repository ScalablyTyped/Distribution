package typings.skiaCanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasDrawImage extends StObject {
  
  def drawCanvas(image: Canvas, dx: Double, dy: Double): Unit = js.native
  def drawCanvas(image: Canvas, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  def drawCanvas(
    image: Canvas,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
  
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double): Unit = js.native
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
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
