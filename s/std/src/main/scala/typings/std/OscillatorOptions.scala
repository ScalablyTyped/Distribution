package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OscillatorOptions extends AudioNodeOptions {
  var detune: js.UndefOr[Double] = js.native
  var frequency: js.UndefOr[Double] = js.native
  var periodicWave: js.UndefOr[PeriodicWave] = js.native
  var `type`: js.UndefOr[OscillatorType] = js.native
}

object OscillatorOptions {
  @scala.inline
  def apply(): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptions]
  }
  @scala.inline
  implicit class OscillatorOptionsOps[Self <: OscillatorOptions] (val x: Self) extends AnyVal {
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
    def setDetune(value: Double): Self = this.set("detune", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetune: Self = this.set("detune", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setPeriodicWave(value: PeriodicWave): Self = this.set("periodicWave", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodicWave: Self = this.set("periodicWave", js.undefined)
    @scala.inline
    def setType(value: OscillatorType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

