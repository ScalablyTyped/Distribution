package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaveShaperOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var curve: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.undefined
  
  /* standard dom */
  var oversample: js.UndefOr[OverSampleType] = js.undefined
}
object WaveShaperOptions {
  
  inline def apply(): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveShaperOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaveShaperOptions] (val x: Self) extends AnyVal {
    
    inline def setCurve(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setCurveVarargs(value: Double*): Self = StObject.set(x, "curve", js.Array(value*))
    
    inline def setOversample(value: OverSampleType): Self = StObject.set(x, "oversample", value.asInstanceOf[js.Any])
    
    inline def setOversampleUndefined: Self = StObject.set(x, "oversample", js.undefined)
  }
}
