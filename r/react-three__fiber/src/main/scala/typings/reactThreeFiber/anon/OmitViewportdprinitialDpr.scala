package typings.reactThreeFiber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/store.Viewport, 'dpr' | 'initialDpr'> */
trait OmitViewportdprinitialDpr extends StObject {
  
  var aspect: Double
  
  var distance: Double
  
  var factor: Double
  
  var height: Double
  
  var left: Double
  
  var top: Double
  
  var updateStyle: js.UndefOr[Boolean] = js.undefined
  
  var width: Double
}
object OmitViewportdprinitialDpr {
  
  inline def apply(
    aspect: Double,
    distance: Double,
    factor: Double,
    height: Double,
    left: Double,
    top: Double,
    width: Double
  ): OmitViewportdprinitialDpr = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitViewportdprinitialDpr]
  }
  
  extension [Self <: OmitViewportdprinitialDpr](x: Self) {
    
    inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setUpdateStyle(value: Boolean): Self = StObject.set(x, "updateStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateStyleUndefined: Self = StObject.set(x, "updateStyle", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
