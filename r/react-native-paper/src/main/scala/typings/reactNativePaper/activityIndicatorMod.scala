package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Animating
import typings.reactNativePaper.anon.PickViewPropsRefAttribute
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/ActivityIndicator", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Animating
  
  type _To = ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `activityIndicatorMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttribute] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVie] & (js.Function1[
      /* hasAnimatingIndicatorColorHidesWhenStoppedIndicatorSizeStyleThemeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
