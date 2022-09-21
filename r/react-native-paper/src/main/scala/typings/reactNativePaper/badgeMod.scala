package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod._Text
import typings.reactNativePaper.anon.AnimatedPropsTextPropsRef
import typings.reactNativePaper.anon.PickAnimatedPropsTextProp
import typings.reactNativePaper.anon.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Badge", JSImport.Default)
  @js.native
  val default: ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentProps[AnimatedComponent[Instantiable0[_Text]]] & Ref
  
  type _To = ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: ComponentType[PickAnimatedPropsTextProp] & (NonReactStatics[
    ComponentType[AnimatedPropsTextPropsRef] & (js.Function1[/* hasChildrenSizeStyleThemeVisibleRest */ Props, Element]), 
    js.Object
  ]) = default
}
