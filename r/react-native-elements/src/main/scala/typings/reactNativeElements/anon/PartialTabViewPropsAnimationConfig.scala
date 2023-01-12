package typings.reactNativeElements.anon

import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/tab/TabView.TabViewProps> */
trait PartialTabViewPropsAnimationConfig extends StObject {
  
  var animationConfig: js.UndefOr[OmitSpringAnimationConfig] = js.undefined
  
  var animationType: js.UndefOr[spring | timing] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Any]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PartialTabViewPropsAnimationConfig {
  
  inline def apply(): PartialTabViewPropsAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabViewPropsAnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTabViewPropsAnimationConfig] (val x: Self) extends AnyVal {
    
    inline def setAnimationConfig(value: OmitSpringAnimationConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setOnChange(value: /* value */ Double => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
