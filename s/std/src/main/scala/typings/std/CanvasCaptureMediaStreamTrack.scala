package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack) */
@js.native
trait CanvasCaptureMediaStreamTrack
  extends StObject
     with MediaStreamTrack {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/canvas) */
  /* standard dom */
  val canvas: HTMLCanvasElement = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/requestFrame) */
  /* standard dom */
  def requestFrame(): Unit = js.native
}
