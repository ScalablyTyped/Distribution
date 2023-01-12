package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: AnimatedInterpolation[Double | String]
}
object Scale {
  
  inline def apply(scale: AnimatedInterpolation[Double | String]): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setScale(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
