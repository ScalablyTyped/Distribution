package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchPropsIOS
  extends StObject
     with ViewProps {
  
  /**
    * Background color when the switch is turned on.
    *
    * @deprecated use trackColor instead
    */
  var onTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Color of the foreground switch grip.
    *
    * @deprecated use thumbColor instead
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Background color when the switch is turned off.
    *
    * @deprecated use trackColor instead
    */
  var tintColor: js.UndefOr[ColorValue] = js.undefined
}
object SwitchPropsIOS {
  
  @scala.inline
  def apply(): SwitchPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchPropsIOS]
  }
  
  @scala.inline
  implicit class SwitchPropsIOSMutableBuilder[Self <: SwitchPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnTintColor(value: ColorValue): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
