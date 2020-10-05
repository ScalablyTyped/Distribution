package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioWorkletNodeOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.native
  var numberOfOutputs: js.UndefOr[Double] = js.native
  var outputChannelCount: js.UndefOr[js.Array[Double]] = js.native
  var parameterData: js.UndefOr[Record[java.lang.String, Double]] = js.native
  var processorOptions: js.UndefOr[js.Any] = js.native
}

object AudioWorkletNodeOptions {
  @scala.inline
  def apply(): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
  @scala.inline
  implicit class AudioWorkletNodeOptionsOps[Self <: AudioWorkletNodeOptions] (val x: Self) extends AnyVal {
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
    def setNumberOfInputs(value: Double): Self = this.set("numberOfInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfInputs: Self = this.set("numberOfInputs", js.undefined)
    @scala.inline
    def setNumberOfOutputs(value: Double): Self = this.set("numberOfOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfOutputs: Self = this.set("numberOfOutputs", js.undefined)
    @scala.inline
    def setOutputChannelCountVarargs(value: Double*): Self = this.set("outputChannelCount", js.Array(value :_*))
    @scala.inline
    def setOutputChannelCount(value: js.Array[Double]): Self = this.set("outputChannelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputChannelCount: Self = this.set("outputChannelCount", js.undefined)
    @scala.inline
    def setParameterData(value: Record[java.lang.String, Double]): Self = this.set("parameterData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterData: Self = this.set("parameterData", js.undefined)
    @scala.inline
    def setProcessorOptions(value: js.Any): Self = this.set("processorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessorOptions: Self = this.set("processorOptions", js.undefined)
  }
  
}

