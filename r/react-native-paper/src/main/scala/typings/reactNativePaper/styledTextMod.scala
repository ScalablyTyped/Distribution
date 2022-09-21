package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Alpha
import typings.reactNativePaper.anon.PickTextPropsstyleStylePr
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAlpha
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAndroidhyphenationFrequency
import typings.reactNativePaper.anon.TextPropsstyleStylePropTe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/StyledText", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
      ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
      js.Object
    ])
  ]) & Alpha
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `styledTextMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAlpha | PickthemeDeepPartialThemeAndroidhyphenationFrequency
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasThemeAlphaFamilyStyleRest */ Props, Element]), 
    js.Object
  ]) = default
}
