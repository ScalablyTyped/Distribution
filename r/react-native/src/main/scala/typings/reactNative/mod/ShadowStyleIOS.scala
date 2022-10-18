package typings.reactNative.mod

import typings.reactNative.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowStyleIOS extends StObject {
  
  var shadowColor: js.UndefOr[ColorValue] = js.undefined
  
  var shadowOffset: js.UndefOr[Width] = js.undefined
  
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  
  var shadowRadius: js.UndefOr[Double] = js.undefined
}
object ShadowStyleIOS {
  
  inline def apply(): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowStyleIOS]
  }
  
  extension [Self <: ShadowStyleIOS](x: Self) {
    
    inline def setShadowColor(value: ColorValue): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffset(value: Width): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
  }
}
