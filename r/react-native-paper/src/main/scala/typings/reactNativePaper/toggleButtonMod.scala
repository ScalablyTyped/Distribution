package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AccessibilityLabelColor
import typings.reactNativePaper.anon.PickiconIconSourcesizenum
import typings.reactNativePaper.anon.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/ToggleButton", JSImport.Default)
  @js.native
  val default: ComponentType[PickiconIconSourcesizenum] & (NonReactStatics[
    ComponentType[AccessibilityLabelColor] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ AccessibilityLabelColor, 
      Element
    ]), 
    js.Object
  ]) & Row = js.native
  
  type _To = ComponentType[PickiconIconSourcesizenum] & (NonReactStatics[
    ComponentType[AccessibilityLabelColor] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ AccessibilityLabelColor, 
      Element
    ]), 
    js.Object
  ]) & Row
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonMod.foo` */
  override def _to: ComponentType[PickiconIconSourcesizenum] & (NonReactStatics[
    ComponentType[AccessibilityLabelColor] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ AccessibilityLabelColor, 
      Element
    ]), 
    js.Object
  ]) & Row = default
}
