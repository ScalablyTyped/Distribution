package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainVideoFacingModeParameters extends StObject {
  
  var exact: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.undefined
  
  var ideal: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.undefined
}
object ConstrainVideoFacingModeParameters {
  
  inline def apply(): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
  
  extension [Self <: ConstrainVideoFacingModeParameters](x: Self) {
    
    inline def setExact(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setExactVarargs(value: VideoFacingModeEnum*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    inline def setIdeal(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setIdealVarargs(value: VideoFacingModeEnum*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
