package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodicWaveOptions extends PeriodicWaveConstraints {
  
  var imag: js.UndefOr[js.Array[Double] | Float32Array] = js.native
  
  var real: js.UndefOr[js.Array[Double] | Float32Array] = js.native
}
object PeriodicWaveOptions {
  
  @scala.inline
  def apply(): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
  
  @scala.inline
  implicit class PeriodicWaveOptionsOps[Self <: PeriodicWaveOptions] (val x: Self) extends AnyVal {
    
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
    def setImagVarargs(value: Double*): Self = this.set("imag", js.Array(value :_*))
    
    @scala.inline
    def setImag(value: js.Array[Double] | Float32Array): Self = this.set("imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImag: Self = this.set("imag", js.undefined)
    
    @scala.inline
    def setRealVarargs(value: Double*): Self = this.set("real", js.Array(value :_*))
    
    @scala.inline
    def setReal(value: js.Array[Double] | Float32Array): Self = this.set("real", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReal: Self = this.set("real", js.undefined)
  }
}
