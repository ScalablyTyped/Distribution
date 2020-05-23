package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface. */
@js.native
trait OfflineAudioCompletionEvent extends Event {
  val renderedBuffer: AudioBuffer = js.native
}

