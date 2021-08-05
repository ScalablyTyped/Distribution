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
  
  inline def apply(): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
  
  extension [Self <: PeriodicWaveOptions](x: Self) {
    
    inline def setImag(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setImagUndefined: Self = StObject.set(x, "imag", js.undefined)
    
    inline def setImagVarargs(value: Double*): Self = StObject.set(x, "imag", js.Array(value :_*))
    
    inline def setReal(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
    
    inline def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
    
    inline def setRealVarargs(value: Double*): Self = StObject.set(x, "real", js.Array(value :_*))
  }
}
