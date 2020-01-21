package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event_
  var audiostart: Event_
  var end: Event_
  var error: SpeechRecognitionError
  var nomatch: SpeechRecognitionEvent
  var result: SpeechRecognitionEvent
  var soundend: Event_
  var soundstart: Event_
  var speechend: Event_
  var speechstart: Event_
  var start: Event_
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: Event_,
    audiostart: Event_,
    end: Event_,
    error: SpeechRecognitionError,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event_,
    soundstart: Event_,
    speechend: Event_,
    speechstart: Event_,
    start: Event_
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
}

