package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyserOptions extends AudioNodeOptions {
  var fftSize: js.UndefOr[Double] = js.native
  var maxDecibels: js.UndefOr[Double] = js.native
  var minDecibels: js.UndefOr[Double] = js.native
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}

object AnalyserOptions {
  @scala.inline
  def apply(): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyserOptions]
  }
  @scala.inline
  implicit class AnalyserOptionsOps[Self <: AnalyserOptions] (val x: Self) extends AnyVal {
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
    def setFftSize(value: Double): Self = this.set("fftSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFftSize: Self = this.set("fftSize", js.undefined)
    @scala.inline
    def setMaxDecibels(value: Double): Self = this.set("maxDecibels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDecibels: Self = this.set("maxDecibels", js.undefined)
    @scala.inline
    def setMinDecibels(value: Double): Self = this.set("minDecibels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDecibels: Self = this.set("minDecibels", js.undefined)
    @scala.inline
    def setSmoothingTimeConstant(value: Double): Self = this.set("smoothingTimeConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothingTimeConstant: Self = this.set("smoothingTimeConstant", js.undefined)
  }
  
}

