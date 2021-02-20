package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderPropsAndroid extends ViewProps {
  
  /**
    * Color of the foreground switch grip.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.native
}
object SliderPropsAndroid {
  
  @scala.inline
  def apply(): SliderPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsAndroid]
  }
  
  @scala.inline
  implicit class SliderPropsAndroidMutableBuilder[Self <: SliderPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
  }
}
