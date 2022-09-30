package typings.reactNativeReanimated.anon

import typings.reactNativeReanimated.mod.Animated.Extrapolate
import typings.reactNativeReanimated.mod.Animated.ExtrapolateParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrapolateLeft
  extends StObject
     with ExtrapolateParameter {
  
  var extrapolateLeft: js.UndefOr[Extrapolate] = js.undefined
  
  var extrapolateRight: js.UndefOr[Extrapolate] = js.undefined
}
object ExtrapolateLeft {
  
  inline def apply(): ExtrapolateLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrapolateLeft]
  }
  
  extension [Self <: ExtrapolateLeft](x: Self) {
    
    inline def setExtrapolateLeft(value: Extrapolate): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
    
    inline def setExtrapolateRight(value: Extrapolate): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
  }
}
