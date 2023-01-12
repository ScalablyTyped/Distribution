package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarOptions extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object NavigationBarOptions {
  
  inline def apply(): NavigationBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBarOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
