package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasDrawPath extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath) */
  /* standard dom */
  def beginPath(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip) */
  /* standard dom */
  def clip(): Unit = js.native
  def clip(fillRule: CanvasFillRule): Unit = js.native
  /* standard dom */
  def clip(path: Path2D): Unit = js.native
  def clip(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill) */
  /* standard dom */
  def fill(): Unit = js.native
  def fill(fillRule: CanvasFillRule): Unit = js.native
  /* standard dom */
  def fill(path: Path2D): Unit = js.native
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  
  /* standard dom */
  def isPointInPath(path: Path2D, x: Double, y: Double): scala.Boolean = js.native
  def isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath) */
  /* standard dom */
  def isPointInPath(x: Double, y: Double): scala.Boolean = js.native
  def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  
  /* standard dom */
  def isPointInStroke(path: Path2D, x: Double, y: Double): scala.Boolean = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke) */
  /* standard dom */
  def isPointInStroke(x: Double, y: Double): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke) */
  /* standard dom */
  def stroke(): Unit = js.native
  /* standard dom */
  def stroke(path: Path2D): Unit = js.native
}
