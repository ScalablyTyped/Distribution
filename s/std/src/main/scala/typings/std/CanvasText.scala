package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasText extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText) */
  /* standard dom */
  def fillText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/measureText) */
  /* standard dom */
  def measureText(text: java.lang.String): TextMetrics = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText) */
  /* standard dom */
  def strokeText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
}
