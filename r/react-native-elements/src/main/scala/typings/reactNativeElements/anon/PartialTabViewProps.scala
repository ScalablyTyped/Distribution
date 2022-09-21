package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.toValue
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/tab/TabView.TabViewProps> */
trait PartialTabViewProps extends StObject {
  
  var animationConfig: js.UndefOr[Omit[SpringAnimationConfig & TimingAnimationConfig, toValue]] = js.undefined
  
  var animationType: js.UndefOr[spring | timing] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Any]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PartialTabViewProps {
  
  inline def apply(): PartialTabViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabViewProps]
  }
  
  extension [Self <: PartialTabViewProps](x: Self) {
    
    inline def setAnimationConfig(value: Omit[SpringAnimationConfig & TimingAnimationConfig, toValue]): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setOnChange(value: /* value */ Double => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
