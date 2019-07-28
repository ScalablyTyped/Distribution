package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event
  var audiostart: Event
  var end: Event
  var error: SpeechRecognitionError
  var nomatch: SpeechRecognitionEvent
  var result: SpeechRecognitionEvent
  var soundend: Event
  var soundstart: Event
  var speechend: Event
  var speechstart: Event
  var start: Event
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: Event,
    audiostart: Event,
    end: Event,
    error: SpeechRecognitionError,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend, audiostart = audiostart, end = end, error = error, nomatch = nomatch, result = result, soundend = soundend, soundstart = soundstart, speechend = speechend, speechstart = speechstart, start = start)
  
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
}

