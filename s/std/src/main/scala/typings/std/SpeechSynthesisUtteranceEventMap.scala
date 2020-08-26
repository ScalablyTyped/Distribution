package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisUtteranceEventMap extends js.Object {
  var boundary: SpeechSynthesisEvent = js.native
  var end: SpeechSynthesisEvent = js.native
  var error: SpeechSynthesisErrorEvent = js.native
  var mark: SpeechSynthesisEvent = js.native
  var pause: SpeechSynthesisEvent = js.native
  var resume: SpeechSynthesisEvent = js.native
  var start: SpeechSynthesisEvent = js.native
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
  @scala.inline
  implicit class SpeechSynthesisUtteranceEventMapOps[Self <: SpeechSynthesisUtteranceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundary(value: SpeechSynthesisEvent): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: SpeechSynthesisEvent): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: SpeechSynthesisErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMark(value: SpeechSynthesisEvent): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: SpeechSynthesisEvent): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: SpeechSynthesisEvent): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: SpeechSynthesisEvent): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

