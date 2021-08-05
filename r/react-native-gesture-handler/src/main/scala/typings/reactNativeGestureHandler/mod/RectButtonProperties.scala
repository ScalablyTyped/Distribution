package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectButtonProperties
  extends StObject
     with BaseButtonProperties {
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var underlayColor: js.UndefOr[String] = js.undefined
}
object RectButtonProperties {
  
  inline def apply(): RectButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectButtonProperties]
  }
  
  extension [Self <: RectButtonProperties](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
  }
}
