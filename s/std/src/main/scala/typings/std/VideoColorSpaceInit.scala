package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoColorSpaceInit extends StObject {
  
  /* standard dom */
  var fullRange: js.UndefOr[scala.Boolean | Null] = js.undefined
  
  /* standard dom */
  var matrix: js.UndefOr[VideoMatrixCoefficients | Null] = js.undefined
  
  /* standard dom */
  var primaries: js.UndefOr[VideoColorPrimaries | Null] = js.undefined
  
  /* standard dom */
  var transfer: js.UndefOr[VideoTransferCharacteristics | Null] = js.undefined
}
object VideoColorSpaceInit {
  
  inline def apply(): VideoColorSpaceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoColorSpaceInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoColorSpaceInit] (val x: Self) extends AnyVal {
    
    inline def setFullRange(value: scala.Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeNull: Self = StObject.set(x, "fullRange", null)
    
    inline def setFullRangeUndefined: Self = StObject.set(x, "fullRange", js.undefined)
    
    inline def setMatrix(value: VideoMatrixCoefficients): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixNull: Self = StObject.set(x, "matrix", null)
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setPrimaries(value: VideoColorPrimaries): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesNull: Self = StObject.set(x, "primaries", null)
    
    inline def setPrimariesUndefined: Self = StObject.set(x, "primaries", js.undefined)
    
    inline def setTransfer(value: VideoTransferCharacteristics): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferNull: Self = StObject.set(x, "transfer", null)
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
  }
}
