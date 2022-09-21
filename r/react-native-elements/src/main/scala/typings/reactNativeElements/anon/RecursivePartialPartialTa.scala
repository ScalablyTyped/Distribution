package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.toValue
import typings.reactNativeElements.themeProviderMod.RecursivePartial
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/tab/TabView.TabViewProps>> */
trait RecursivePartialPartialTa extends StObject {
  
  var animationConfig: js.UndefOr[
    RecursivePartial[js.UndefOr[Omit[SpringAnimationConfig & TimingAnimationConfig, toValue]]]
  ] = js.undefined
  
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[spring | timing]]] = js.undefined
  
  var onChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Any]]]] = js.undefined
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
}
object RecursivePartialPartialTa {
  
  inline def apply(): RecursivePartialPartialTa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialTa]
  }
  
  extension [Self <: RecursivePartialPartialTa](x: Self) {
    
    inline def setAnimationConfig(value: RecursivePartial[js.UndefOr[Omit[SpringAnimationConfig & TimingAnimationConfig, toValue]]]): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: RecursivePartial[js.UndefOr[spring | timing]]): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setOnChange(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Any]]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
