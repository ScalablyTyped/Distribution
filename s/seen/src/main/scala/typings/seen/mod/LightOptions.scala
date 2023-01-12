package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightOptions extends StObject {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var intensity: js.UndefOr[Double] = js.undefined
  
  var normal: js.UndefOr[Point] = js.undefined
  
  var point: js.UndefOr[Point] = js.undefined
}
object LightOptions {
  
  inline def apply(): LightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    inline def setNormal(value: Point): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
