package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod._Text
import typings.reactNativePaper.anon.AnimatedPropsTextPropsRefAccessibilityActions
import typings.reactNativePaper.anon.PickAnimatedPropsTextPropAccessibilityActions
import typings.reactNativePaper.anon.StyleThemeTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/AnimatedText", JSImport.Default)
  @js.native
  val default: ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[AnimatedComponent[Instantiable0[_Text]]] & StyleThemeTheme
  
  type _To = ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `animatedTextMod.foo` */
  override def _to: ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (js.Function1[/* hasStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
