package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrapolationConfig
  extends StObject
     with _ExtrapolationType {
  
  var extrapolateLeft: js.UndefOr[Extrapolation | String] = js.undefined
  
  var extrapolateRight: js.UndefOr[Extrapolation | String] = js.undefined
}
object ExtrapolationConfig {
  
  inline def apply(): ExtrapolationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrapolationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtrapolationConfig] (val x: Self) extends AnyVal {
    
    inline def setExtrapolateLeft(value: Extrapolation | String): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
    
    inline def setExtrapolateRight(value: Extrapolation | String): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
  }
}
