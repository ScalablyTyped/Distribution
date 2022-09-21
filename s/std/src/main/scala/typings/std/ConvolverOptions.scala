package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvolverOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var buffer: js.UndefOr[AudioBuffer | Null] = js.undefined
  
  /* standard dom */
  var disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
}
object ConvolverOptions {
  
  inline def apply(): ConvolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvolverOptions]
  }
  
  extension [Self <: ConvolverOptions](x: Self) {
    
    inline def setBuffer(value: AudioBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferNull: Self = StObject.set(x, "buffer", null)
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setDisableNormalization(value: scala.Boolean): Self = StObject.set(x, "disableNormalization", value.asInstanceOf[js.Any])
    
    inline def setDisableNormalizationUndefined: Self = StObject.set(x, "disableNormalization", js.undefined)
  }
}
