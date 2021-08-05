package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaveShaperOptions
  extends StObject
     with AudioNodeOptions {
  
  var curve: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
  
  var oversample: js.UndefOr[OverSampleType] = js.undefined
}
object WaveShaperOptions {
  
  inline def apply(): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveShaperOptions]
  }
  
  extension [Self <: WaveShaperOptions](x: Self) {
    
    inline def setCurve(value: js.Array[Double] | Float32Array): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setCurveVarargs(value: Double*): Self = StObject.set(x, "curve", js.Array(value :_*))
    
    inline def setOversample(value: OverSampleType): Self = StObject.set(x, "oversample", value.asInstanceOf[js.Any])
    
    inline def setOversampleUndefined: Self = StObject.set(x, "oversample", js.undefined)
  }
}
