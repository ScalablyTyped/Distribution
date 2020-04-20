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
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisUtteranceEventMap]
  }
}

