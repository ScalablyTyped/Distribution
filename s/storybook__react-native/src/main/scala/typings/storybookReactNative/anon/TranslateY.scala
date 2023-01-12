package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateY extends StObject {
  
  var translateX: AnimatedInterpolation[Double | String]
  
  var translateY: Unit
}
object TranslateY {
  
  inline def apply(translateX: AnimatedInterpolation[Double | String], translateY: Unit): TranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateY] (val x: Self) extends AnyVal {
    
    inline def setTranslateX(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: Unit): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
