package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface. */
@js.native
trait OfflineAudioCompletionEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val renderedBuffer: AudioBuffer = js.native
}
