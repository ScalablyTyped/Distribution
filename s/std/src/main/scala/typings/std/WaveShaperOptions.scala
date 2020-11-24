package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaveShaperOptions extends AudioNodeOptions {
  
  var curve: js.UndefOr[js.Array[Double] | Float32Array] = js.native
  
  var oversample: js.UndefOr[OverSampleType] = js.native
}
object WaveShaperOptions {
  
  @scala.inline
  def apply(): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveShaperOptions]
  }
  
  @scala.inline
  implicit class WaveShaperOptionsOps[Self <: WaveShaperOptions] (val x: Self) extends AnyVal {
    
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
    def setCurveVarargs(value: Double*): Self = this.set("curve", js.Array(value :_*))
    
    @scala.inline
    def setCurve(value: js.Array[Double] | Float32Array): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setOversample(value: OverSampleType): Self = this.set("oversample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOversample: Self = this.set("oversample", js.undefined)
  }
}
