package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
  */
@js.native
trait OfflineAudioCompletionEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer) */
  /* standard dom */
  val renderedBuffer: AudioBuffer = js.native
}
