package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event
  var audiostart: Event
  var end: Event
  var error: Event
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
    error: Event,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
}

