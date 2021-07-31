package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodicWaveOptions
  extends StObject
     with PeriodicWaveConstraints {
  
  var imag: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
  
  var real: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
}
object PeriodicWaveOptions {
  
  @scala.inline
  def apply(): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
  
  @scala.inline
  implicit class PeriodicWaveOptionsMutableBuilder[Self <: PeriodicWaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImag(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagUndefined: Self = StObject.set(x, "imag", js.undefined)
    
    @scala.inline
    def setImagVarargs(value: Double*): Self = StObject.set(x, "imag", js.Array(value :_*))
    
    @scala.inline
    def setReal(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
    
    @scala.inline
    def setRealVarargs(value: Double*): Self = StObject.set(x, "real", js.Array(value :_*))
  }
}
