package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.RippleAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RippleBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[ColorValue] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_RippleBackgroundPropType: RippleAndroid = js.native
}
object RippleBackgroundPropType {
  
  @scala.inline
  def apply(`type`: RippleAndroid): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
  
  @scala.inline
  implicit class RippleBackgroundPropTypeMutableBuilder[Self <: RippleBackgroundPropType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setType(value: RippleAndroid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
