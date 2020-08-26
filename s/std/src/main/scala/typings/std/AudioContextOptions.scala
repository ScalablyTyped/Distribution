package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioContextOptions extends js.Object {
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
}

object AudioContextOptions {
  @scala.inline
  def apply(): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextOptions]
  }
  @scala.inline
  implicit class AudioContextOptionsOps[Self <: AudioContextOptions] (val x: Self) extends AnyVal {
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
    def setLatencyHint(value: AudioContextLatencyCategory | Double): Self = this.set("latencyHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatencyHint: Self = this.set("latencyHint", js.undefined)
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
  
}

