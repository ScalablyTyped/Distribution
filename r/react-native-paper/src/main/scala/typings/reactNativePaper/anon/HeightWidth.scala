package typings.reactNativePaper.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightWidth extends StObject {
  
  var height: AnimatedInterpolation[Double | String]
  
  var width: typings.reactNative.mod.Animated.Value
}
object HeightWidth {
  
  inline def apply(height: AnimatedInterpolation[Double | String], width: typings.reactNative.mod.Animated.Value): HeightWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeightWidth] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: typings.reactNative.mod.Animated.Value): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
