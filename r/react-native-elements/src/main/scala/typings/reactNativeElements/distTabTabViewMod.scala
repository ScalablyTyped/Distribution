package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.ViewProps
import typings.reactNativeElements.anon.OmitSpringAnimationConfig
import typings.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabTabViewMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tab/TabView", JSImport.Default)
  @js.native
  val default: TabView = js.native
  
  @js.native
  trait TabView
    extends StObject
       with FunctionComponent[TabViewProps & Partial[ThemeProps[TabViewProps]]] {
    
    var Item: RneFunctionComponent[ViewProps] = js.native
  }
  
  trait TabViewProps extends StObject {
    
    var animationConfig: js.UndefOr[OmitSpringAnimationConfig] = js.undefined
    
    var animationType: js.UndefOr[spring | timing] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Any]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object TabViewProps {
    
    inline def apply(): TabViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabViewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = TabView
  
  /* This means you don't have to write `default`, but can instead just say `distTabTabViewMod.foo` */
  override def _to: TabView = default
}
