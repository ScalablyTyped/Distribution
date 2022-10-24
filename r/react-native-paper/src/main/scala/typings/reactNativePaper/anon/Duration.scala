package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsButtonMod.Props
import typings.reactNativePaper.reactNativePaperStrings.children
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /**
    * Label and press callback for the action button. It should contain the following properties:
    * - `label` - Label of the action button
    * - `onPress` - Callback that is called when action button is pressed.
    */
  var action: js.UndefOr[
    (Omit[
      ComponentProps[
        (ComponentType[
          PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
        ]) & (NonReactStatics[ComponentType[Props] & (js.Function1[/* param0 */ Props, Element]), js.Object])
      ], 
      children
    ]) & LabelString
  ] = js.undefined
  
  /**
    * Text content of the Snackbar.
    */
  var children: ReactNode
  
  /**
    * The duration for which the Snackbar is shown.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback called when Snackbar is dismissed. The `visible` prop needs to be updated when this is called.
    */
  def onDismiss(): Unit
  
  var ref: js.UndefOr[RefObject[View]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether the Snackbar is currently visible.
    */
  var visible: Boolean
  
  /**
    * Style for the wrapper of the snackbar
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object Duration {
  
  inline def apply(
    onDismiss: () => Unit,
    theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme,
    visible: Boolean
  ): Duration = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss), theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setAction(
      value: (Omit[
          ComponentProps[
            (ComponentType[
              PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
            ]) & (NonReactStatics[ComponentType[Props] & (js.Function1[/* param0 */ Props, Element]), js.Object])
          ], 
          children
        ]) & LabelString
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setRef(value: RefObject[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
