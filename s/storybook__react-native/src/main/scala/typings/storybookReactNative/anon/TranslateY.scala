package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateY extends StObject {
  
  var translateX: AnimatedInterpolation
  
  var translateY: Unit
}
object TranslateY {
  
  inline def apply(translateX: AnimatedInterpolation, translateY: Unit): TranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
  
  extension [Self <: TranslateY](x: Self) {
    
    inline def setTranslateX(value: AnimatedInterpolation): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: Unit): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
