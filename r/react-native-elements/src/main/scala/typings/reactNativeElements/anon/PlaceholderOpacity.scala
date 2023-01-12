package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderOpacity extends StObject {
  
  var placeholderOpacity: Value
}
object PlaceholderOpacity {
  
  inline def apply(placeholderOpacity: Value): PlaceholderOpacity = {
    val __obj = js.Dynamic.literal(placeholderOpacity = placeholderOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceholderOpacity] (val x: Self) extends AnyVal {
    
    inline def setPlaceholderOpacity(value: Value): Self = StObject.set(x, "placeholderOpacity", value.asInstanceOf[js.Any])
  }
}
