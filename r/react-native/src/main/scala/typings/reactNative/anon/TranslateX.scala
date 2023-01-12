package typings.reactNative.anon

import typings.reactNative.mod.Animated.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateX extends StObject {
  
  var translateX: AnimatedValue
}
object TranslateX {
  
  inline def apply(translateX: AnimatedValue): TranslateX = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateX] (val x: Self) extends AnyVal {
    
    inline def setTranslateX(value: AnimatedValue): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
  }
}
