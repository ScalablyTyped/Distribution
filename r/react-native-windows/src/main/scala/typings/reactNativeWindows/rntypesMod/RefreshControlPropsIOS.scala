package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshControlPropsIOS
  extends StObject
     with ViewProps {
  
  /**
    * The color of the refresh indicator.
    */
  var tintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * The title displayed under the refresh indicator.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Title color.
    */
  var titleColor: js.UndefOr[ColorValue] = js.undefined
}
object RefreshControlPropsIOS {
  
  inline def apply(): RefreshControlPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshControlPropsIOS]
  }
  
  extension [Self <: RefreshControlPropsIOS](x: Self) {
    
    inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
