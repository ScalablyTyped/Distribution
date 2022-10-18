package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AnimatedPropsTextPropsRefAccessibilityActions
import typings.reactNativePaper.anon.Padding
import typings.reactNativePaper.anon.PickAnimatedPropsTextPropAccessibilityActions
import typings.reactNativePaper.anon.PickOmitOmitPickPickAnima
import typings.reactNativePaper.anon.PickPickAnimatedPropsText
import typings.reactNativePaper.anon.Type
import typings.reactNativePaper.anon.themeDeepPartialThemeunde
import typings.reactNativePaper.libTypescriptTypesMod.Omit
import typings.reactNativePaper.reactNativePaperStrings.`type`
import typings.reactNativePaper.reactNativePaperStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsHelperTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/HelperText", JSImport.Default)
  @js.native
  val default: ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = (Omit[
    Omit[
      ComponentPropsWithRef[
        ComponentType[PickAnimatedPropsTextPropAccessibilityActions] & (NonReactStatics[
          ComponentType[AnimatedPropsTextPropsRefAccessibilityActions] & (/* import warning: importer.ImportType#apply Failed type conversion: typeof AnimatedText */ js.Any), 
          js.Object
        ])
      ], 
      padding
    ], 
    `type`
  ]) & Padding
  
  type _To = ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsHelperTextMod.foo` */
  override def _to: ComponentType[PickOmitOmitPickPickAnima] & (NonReactStatics[
    (ComponentType[
      (Omit[Omit[PickPickAnimatedPropsText | themeDeepPartialThemeunde, padding], `type`]) & Type
    ]) & (js.Function1[/* hasStyleTypeVisibleThemeOnLayoutPaddingRest */ Props, Element]), 
    js.Object
  ]) = default
}
