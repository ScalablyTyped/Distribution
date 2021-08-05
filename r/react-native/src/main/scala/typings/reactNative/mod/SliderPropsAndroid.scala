package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderPropsAndroid
  extends StObject
     with ViewProps {
  
  /**
    * Color of the foreground switch grip.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.undefined
}
object SliderPropsAndroid {
  
  inline def apply(): SliderPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsAndroid]
  }
  
  extension [Self <: SliderPropsAndroid](x: Self) {
    
    inline def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
  }
}
