package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisUtteranceEventMap extends js.Object {
  var boundary: SpeechSynthesisEvent
  var end: SpeechSynthesisEvent
  var error: SpeechSynthesisErrorEvent
  var mark: SpeechSynthesisEvent
  var pause: SpeechSynthesisEvent
  var resume: SpeechSynthesisEvent
  var start: SpeechSynthesisEvent
}

object SpeechSynthesisUtteranceEventMap {
  @scala.inline
  def apply(
    boundary: SpeechSynthesisEvent,
    end: SpeechSynthesisEvent,
    error: SpeechSynthesisErrorEvent,
    mark: SpeechSynthesisEvent,
    pause: SpeechSynthesisEvent,
    resume: SpeechSynthesisEvent,
    start: SpeechSynthesisEvent
  ): SpeechSynthesisUtteranceEventMap = {
    val __obj = js.Dynamic.literal(boundary = boundary, end = end, error = error, mark = mark, pause = pause, resume = resume, start = start)
  
    __obj.asInstanceOf[SpeechSynthesisUtteranceEventMap]
  }
}

