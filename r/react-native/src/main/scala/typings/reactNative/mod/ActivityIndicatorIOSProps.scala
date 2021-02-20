package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.large_
import typings.reactNative.reactNativeStrings.small_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityIndicatorIOSProps extends ViewProps {
  
  /**
    * Whether to show the indicator (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  
  /**
    * The foreground color of the spinner (default is gray).
    */
  var color: js.UndefOr[ColorValue] = js.native
  
  /**
    * Whether the indicator should hide when not animating (true by default).
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.native
  
  /**
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[small_ | large_] = js.native
}
object ActivityIndicatorIOSProps {
  
  @scala.inline
  def apply(): ActivityIndicatorIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorIOSProps]
  }
  
  @scala.inline
  implicit class ActivityIndicatorIOSPropsMutableBuilder[Self <: ActivityIndicatorIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHidesWhenStopped(value: Boolean): Self = StObject.set(x, "hidesWhenStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidesWhenStoppedUndefined: Self = StObject.set(x, "hidesWhenStopped", js.undefined)
    
    @scala.inline
    def setSize(value: small_ | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
