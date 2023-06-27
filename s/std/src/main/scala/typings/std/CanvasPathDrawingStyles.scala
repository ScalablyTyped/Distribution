package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPathDrawingStyles extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash) */
  /* standard dom */
  def getLineDash(): js.Array[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap) */
  /* standard dom */
  var lineCap: CanvasLineCap = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset) */
  /* standard dom */
  var lineDashOffset: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin) */
  /* standard dom */
  var lineJoin: CanvasLineJoin = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth) */
  /* standard dom */
  var lineWidth: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit) */
  /* standard dom */
  var miterLimit: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash) */
  /* standard dom */
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash) */
  /* standard dom.iterable */
  def setLineDash(segments: js.Iterable[Double]): Unit = js.native
}
