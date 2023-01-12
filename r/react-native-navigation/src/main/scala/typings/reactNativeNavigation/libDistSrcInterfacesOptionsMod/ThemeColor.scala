package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColor extends StObject {
  
  var dark: js.UndefOr[String | js.Symbol] = js.undefined
  
  var light: js.UndefOr[String | js.Symbol] = js.undefined
}
object ThemeColor {
  
  inline def apply(): ThemeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
    
    inline def setDark(value: String | js.Symbol): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: String | js.Symbol): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
