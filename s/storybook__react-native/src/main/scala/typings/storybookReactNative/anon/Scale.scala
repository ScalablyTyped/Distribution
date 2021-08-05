package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: AnimatedInterpolation
}
object Scale {
  
  inline def apply(scale: AnimatedInterpolation): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setScale(value: AnimatedInterpolation): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
