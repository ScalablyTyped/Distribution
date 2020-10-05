package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioBufferSourceOptions extends js.Object {
  var buffer: js.UndefOr[AudioBuffer | Null] = js.native
  var detune: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[scala.Boolean] = js.native
  var loopEnd: js.UndefOr[Double] = js.native
  var loopStart: js.UndefOr[Double] = js.native
  var playbackRate: js.UndefOr[Double] = js.native
}

object AudioBufferSourceOptions {
  @scala.inline
  def apply(): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
  @scala.inline
  implicit class AudioBufferSourceOptionsOps[Self <: AudioBufferSourceOptions] (val x: Self) extends AnyVal {
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
    def setBuffer(value: AudioBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setBufferNull: Self = this.set("buffer", null)
    @scala.inline
    def setDetune(value: Double): Self = this.set("detune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetune: Self = this.set("detune", js.undefined)
    @scala.inline
    def setLoop(value: scala.Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopEnd(value: Double): Self = this.set("loopEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopEnd: Self = this.set("loopEnd", js.undefined)
    @scala.inline
    def setLoopStart(value: Double): Self = this.set("loopStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopStart: Self = this.set("loopStart", js.undefined)
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
  }
  
}

