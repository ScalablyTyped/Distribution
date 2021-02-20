package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PressableAndroidRippleConfig extends StObject {
  
  var borderless: js.UndefOr[Null | Boolean] = js.native
  
  var color: js.UndefOr[Null | ColorValue] = js.native
  
  var radius: js.UndefOr[Null | Double] = js.native
}
object PressableAndroidRippleConfig {
  
  @scala.inline
  def apply(): PressableAndroidRippleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressableAndroidRippleConfig]
  }
  
  @scala.inline
  implicit class PressableAndroidRippleConfigMutableBuilder[Self <: PressableAndroidRippleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessNull: Self = StObject.set(x, "borderless", null)
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusNull: Self = StObject.set(x, "radius", null)
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
