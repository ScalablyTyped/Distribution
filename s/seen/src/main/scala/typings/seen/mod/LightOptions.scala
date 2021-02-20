package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightOptions extends StObject {
  
  var color: js.UndefOr[Color] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var intensity: js.UndefOr[Double] = js.native
  
  var normal: js.UndefOr[Point] = js.native
  
  var point: js.UndefOr[Point] = js.native
}
object LightOptions {
  
  @scala.inline
  def apply(): LightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightOptions]
  }
  
  @scala.inline
  implicit class LightOptionsMutableBuilder[Self <: LightOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    @scala.inline
    def setNormal(value: Point): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
