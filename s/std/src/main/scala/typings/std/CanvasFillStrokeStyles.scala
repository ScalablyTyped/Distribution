package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFillStrokeStyles extends StObject {
  
  /* standard dom */
  def createConicGradient(startAngle: Double, x: Double, y: Double): CanvasGradient = js.native
  
  /* standard dom */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  
  /* standard dom */
  def createPattern(image: CanvasImageSource): CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | Null = js.native
  
  /* standard dom */
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
  
  /* standard dom */
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  
  /* standard dom */
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
}
