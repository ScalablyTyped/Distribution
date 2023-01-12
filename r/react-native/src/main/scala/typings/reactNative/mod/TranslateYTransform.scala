package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateYTransform extends StObject {
  
  var translateY: Double
}
object TranslateYTransform {
  
  inline def apply(translateY: Double): TranslateYTransform = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateYTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateYTransform] (val x: Self) extends AnyVal {
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
