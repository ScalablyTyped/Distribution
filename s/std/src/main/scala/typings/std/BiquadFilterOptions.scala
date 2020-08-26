package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiquadFilterOptions extends AudioNodeOptions {
  var Q: js.UndefOr[Double] = js.native
  var detune: js.UndefOr[Double] = js.native
  var frequency: js.UndefOr[Double] = js.native
  var gain: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[BiquadFilterType] = js.native
}

object BiquadFilterOptions {
  @scala.inline
  def apply(): BiquadFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiquadFilterOptions]
  }
  @scala.inline
  implicit class BiquadFilterOptionsOps[Self <: BiquadFilterOptions] (val x: Self) extends AnyVal {
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
    def setQ(value: Double): Self = this.set("Q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("Q", js.undefined)
    @scala.inline
    def setDetune(value: Double): Self = this.set("detune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetune: Self = this.set("detune", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setGain(value: Double): Self = this.set("gain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGain: Self = this.set("gain", js.undefined)
    @scala.inline
    def setType(value: BiquadFilterType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

