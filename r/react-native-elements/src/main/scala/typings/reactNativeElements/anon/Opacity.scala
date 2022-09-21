package typings.reactNativeElements.anon

import typings.reactNativeElements.reactNativeElementsStrings.absolute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var backgroundColor: String
  
  var opacity: Double
  
  var position: absolute
}
object Opacity {
  
  inline def apply(backgroundColor: String, opacity: Double): Opacity = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = "absolute")
    __obj.asInstanceOf[Opacity]
  }
  
  extension [Self <: Opacity](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
