package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNative.mod.Text
import typings.reactNativePaper.anon.PickTextPropsstyleStylePr
import typings.reactNativePaper.anon.StyleThemeTheme
import typings.reactNativePaper.anon.TextPropsstyleStylePropTe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTypographyTextMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/Text", JSImport.Default)
  @js.native
  val default: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = js.native
  
  type Props = ComponentProps[Instantiable0[Text]] & StyleThemeTheme
  
  type _To = ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTypographyTextMod.foo` */
  override def _to: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = default
}
