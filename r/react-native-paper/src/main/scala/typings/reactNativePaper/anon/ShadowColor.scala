package typings.reactNativePaper.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowColor extends StObject {
  
  var shadowColor: String
  
  var shadowOffset: HeightWidth
  
  var shadowOpacity: AnimatedInterpolation[Double | String]
  
  var shadowRadius: AnimatedInterpolation[Double | String]
}
object ShadowColor {
  
  inline def apply(
    shadowColor: String,
    shadowOffset: HeightWidth,
    shadowOpacity: AnimatedInterpolation[Double | String],
    shadowRadius: AnimatedInterpolation[Double | String]
  ): ShadowColor = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowColor]
  }
  
  extension [Self <: ShadowColor](x: Self) {
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: HeightWidth): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacity(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
  }
}
