package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderlessButtonProperties
  extends StObject
     with BaseButtonProperties {
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
}
object BorderlessButtonProperties {
  
  inline def apply(): BorderlessButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderlessButtonProperties]
  }
  
  extension [Self <: BorderlessButtonProperties](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
  }
}
