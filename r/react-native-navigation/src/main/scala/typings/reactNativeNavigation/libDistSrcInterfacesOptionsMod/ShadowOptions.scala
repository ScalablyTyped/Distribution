package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowOptions extends StObject {
  
  /**
    * The color of the shadow
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * The opacity of the shadow
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The blur radius used to create the shadow
    */
  var radius: js.UndefOr[Double] = js.undefined
}
object ShadowOptions {
  
  inline def apply(): ShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
