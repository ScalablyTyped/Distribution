package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateXTranslateY extends StObject {
  
  var translateX: Unit
  
  var translateY: AnimatedInterpolation[Double | String]
}
object TranslateXTranslateY {
  
  inline def apply(translateX: Unit, translateY: AnimatedInterpolation[Double | String]): TranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTranslateY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateXTranslateY] (val x: Self) extends AnyVal {
    
    inline def setTranslateX(value: Unit): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
