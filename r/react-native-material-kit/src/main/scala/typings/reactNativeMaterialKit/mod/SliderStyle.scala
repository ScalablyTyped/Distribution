package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStyle extends StObject {
  
  var lowerTrackColor: js.UndefOr[String] = js.undefined
  
  var upperTrackColor: js.UndefOr[String] = js.undefined
}
object SliderStyle {
  
  @scala.inline
  def apply(): SliderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStyle]
  }
  
  @scala.inline
  implicit class SliderStyleMutableBuilder[Self <: SliderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerTrackColor(value: String): Self = StObject.set(x, "lowerTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerTrackColorUndefined: Self = StObject.set(x, "lowerTrackColor", js.undefined)
    
    @scala.inline
    def setUpperTrackColor(value: String): Self = StObject.set(x, "upperTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperTrackColorUndefined: Self = StObject.set(x, "upperTrackColor", js.undefined)
  }
}
