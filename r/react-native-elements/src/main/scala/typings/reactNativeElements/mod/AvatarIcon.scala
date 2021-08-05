package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarIcon
  extends StObject
     with IconObject {
  
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object AvatarIcon {
  
  inline def apply(): AvatarIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarIcon]
  }
  
  extension [Self <: AvatarIcon](x: Self) {
    
    inline def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
  }
}
