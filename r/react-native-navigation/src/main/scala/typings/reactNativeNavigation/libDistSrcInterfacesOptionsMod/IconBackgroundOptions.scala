package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconBackgroundOptions extends StObject {
  
  /**
    * Set background color
    */
  var color: Color
  
  /**
    * Set corner radius
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Set background color on disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set height
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Set width
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IconBackgroundOptions {
  
  inline def apply(): IconBackgroundOptions = {
    val __obj = js.Dynamic.literal(color = null)
    __obj.asInstanceOf[IconBackgroundOptions]
  }
  
  extension [Self <: IconBackgroundOptions](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDisabledColor(value: Color): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColorNull: Self = StObject.set(x, "disabledColor", null)
    
    inline def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
