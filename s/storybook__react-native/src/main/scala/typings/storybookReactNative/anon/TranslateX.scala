package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateX extends StObject {
  
  var translateX: AnimatedInterpolation[Double | String]
}
object TranslateX {
  
  inline def apply(translateX: AnimatedInterpolation[Double | String]): TranslateX = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateX] (val x: Self) extends AnyVal {
    
    inline def setTranslateX(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
  }
}
