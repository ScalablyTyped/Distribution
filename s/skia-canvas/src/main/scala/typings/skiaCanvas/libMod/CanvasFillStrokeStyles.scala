package typings.skiaCanvas.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFillStrokeStyles extends StObject {
  
  def createConicGradient(startAngle: Double, x: Double, y: Double): CanvasGradient = js.native
  
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  
  def createPattern(image: CanvasImageSource): CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: String): CanvasPattern | Null = js.native
  
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
  
  def createTexture(spacing: Offset): CanvasTexture = js.native
  def createTexture(spacing: Offset, options: CreateTextureOptions): CanvasTexture = js.native
  
  var fillStyle: String | CanvasGradient | CanvasPattern | CanvasTexture = js.native
  
  var strokeStyle: String | CanvasGradient | CanvasPattern | CanvasTexture = js.native
}
