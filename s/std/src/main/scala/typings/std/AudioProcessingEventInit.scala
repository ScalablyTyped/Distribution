package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioProcessingEventInit extends EventInit {
  var inputBuffer: AudioBuffer = js.native
  var outputBuffer: AudioBuffer = js.native
  var playbackTime: Double = js.native
}

object AudioProcessingEventInit {
  @scala.inline
  def apply(inputBuffer: AudioBuffer, outputBuffer: AudioBuffer, playbackTime: Double): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal(inputBuffer = inputBuffer.asInstanceOf[js.Any], outputBuffer = outputBuffer.asInstanceOf[js.Any], playbackTime = playbackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
  @scala.inline
  implicit class AudioProcessingEventInitOps[Self <: AudioProcessingEventInit] (val x: Self) extends AnyVal {
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
    def setInputBuffer(value: AudioBuffer): Self = this.set("inputBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputBuffer(value: AudioBuffer): Self = this.set("outputBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybackTime(value: Double): Self = this.set("playbackTime", value.asInstanceOf[js.Any])
  }
  
}

