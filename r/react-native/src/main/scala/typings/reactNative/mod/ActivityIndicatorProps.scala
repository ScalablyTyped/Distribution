package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.large_
import typings.reactNative.reactNativeStrings.small_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityIndicatorProps
  extends StObject
     with ViewProps {
  
  /**
    * Whether to show the indicator (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The foreground color of the spinner (default is gray).
    */
  var color: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Whether the indicator should hide when not animating (true by default).
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[Double | small_ | large_] = js.undefined
}
object ActivityIndicatorProps {
  
  inline def apply(): ActivityIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorProps]
  }
  
  extension [Self <: ActivityIndicatorProps](x: Self) {
    
    inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHidesWhenStopped(value: Boolean): Self = StObject.set(x, "hidesWhenStopped", value.asInstanceOf[js.Any])
    
    inline def setHidesWhenStoppedUndefined: Self = StObject.set(x, "hidesWhenStopped", js.undefined)
    
    inline def setSize(value: Double | small_ | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
