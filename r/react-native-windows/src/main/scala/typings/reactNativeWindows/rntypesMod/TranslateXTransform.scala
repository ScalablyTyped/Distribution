package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateXTransform extends StObject {
  
  var translateX: Double
}
object TranslateXTransform {
  
  inline def apply(translateX: Double): TranslateXTransform = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTransform]
  }
  
  extension [Self <: TranslateXTransform](x: Self) {
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
  }
}
