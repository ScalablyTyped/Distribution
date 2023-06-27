package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTransform extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform) */
  /* standard dom */
  def getTransform(): DOMMatrix = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform) */
  /* standard dom */
  def resetTransform(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate) */
  /* standard dom */
  def rotate(angle: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale) */
  /* standard dom */
  def scale(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def setTransform(): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
  /* standard dom */
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform) */
  /* standard dom */
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate) */
  /* standard dom */
  def translate(x: Double, y: Double): Unit = js.native
}
