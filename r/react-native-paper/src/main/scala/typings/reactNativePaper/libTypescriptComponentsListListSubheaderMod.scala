package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNativePaper.anon.PickTextPropsstyleStylePr
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAdjustsFontSizeToFit
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAllowFontScaling
import typings.reactNativePaper.anon.TextPropsstyleStylePropTe
import typings.reactNativePaper.anon.ThemeTheme
import typings.reactNativePaper.anon.`22`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListSubheaderMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListSubheader", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & `22`, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
      ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
      js.Object
    ])
  ]) & ThemeTheme
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & `22`, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsListListSubheaderMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[ComponentType[Props] & `22`, js.Object]) = default
}
