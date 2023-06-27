package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPath extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc) */
  /* standard dom */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo) */
  /* standard dom */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo) */
  /* standard dom */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath) */
  /* standard dom */
  def closePath(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse) */
  /* standard dom */
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double
  ): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo) */
  /* standard dom */
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo) */
  /* standard dom */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo) */
  /* standard dom */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect) */
  /* standard dom */
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect) */
  /* standard dom */
  def roundRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def roundRect(x: Double, y: Double, w: Double, h: Double, radii: js.Array[Double | DOMPointInit]): Unit = js.native
  def roundRect(x: Double, y: Double, w: Double, h: Double, radii: js.Iterable[Double | DOMPointInit]): Unit = js.native
  def roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double): Unit = js.native
  def roundRect(x: Double, y: Double, w: Double, h: Double, radii: DOMPointInit): Unit = js.native
}
