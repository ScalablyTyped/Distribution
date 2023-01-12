package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodicWaveOptions
  extends StObject
     with PeriodicWaveConstraints {
  
  /* standard dom */
  var imag: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.undefined
  
  /* standard dom */
  var real: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.undefined
}
object PeriodicWaveOptions {
  
  inline def apply(): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeriodicWaveOptions] (val x: Self) extends AnyVal {
    
    inline def setImag(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setImagUndefined: Self = StObject.set(x, "imag", js.undefined)
    
    inline def setImagVarargs(value: Double*): Self = StObject.set(x, "imag", js.Array(value*))
    
    inline def setReal(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
    
    inline def setRealUndefined: Self = StObject.set(x, "real", js.undefined)
    
    inline def setRealVarargs(value: Double*): Self = StObject.set(x, "real", js.Array(value*))
  }
}
