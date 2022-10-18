package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.libTypescriptComponentsTextInputTypesMod.RenderProps
import typings.reactNativePaper.libTypescriptComponentsTextInputTypesMod.TextInputLabelProp
import typings.reactNativePaper.reactNativePaperStrings.flat
import typings.reactNativePaper.reactNativePaperStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveOutlineColor extends StObject {
  
  /**
    * Active outline color of the input.
    */
  var activeOutlineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Active underline color of the input.
    */
  var activeUnderlineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets min height with densed layout. For `TextInput` in `flat` mode
    * height is `64dp` or in dense layout - `52dp` with label or `40dp` without label.
    * For `TextInput` in `outlined` mode
    * height is `56dp` or in dense layout - `40dp` regardless of label.
    * When you apply `height` prop in style the `dense` prop affects only `paddingVertical` inside `TextInput`
    */
  var dense: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, user won't be able to interact with the component.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to style the TextInput with error style.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text or component to use for the floating label.
    */
  var label: js.UndefOr[TextInputLabelProp] = js.undefined
  
  var left: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Mode of the TextInput.
    * - `flat` - flat input with an underline.
    * - `outlined` - input with an outline.
    *
    * In `outlined` mode, the background color of the label is derived from `colors.background` in theme or the `backgroundColor` style.
    * This component render TextInputOutlined or TextInputFlat based on that props
    */
  var mode: js.UndefOr[flat | outlined] = js.undefined
  
  /**
    * Whether the input can have multiple lines.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of lines to show in the input (Android only).
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback that is called when the text input is blurred.
    */
  var onBlur: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input's text changes. Changed text is passed as an argument to the callback handler.
    */
  var onChangeText: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback that is called when the text input is focused.
    */
  var onFocus: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
  
  /**
    * Inactive outline color of the input.
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Placeholder for the input.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Callback to render a custom input component such as `react-native-text-input-mask`
    * instead of the default `TextInput` component from `react-native`.
    *
    * Example:
    * ```js
    * <TextInput
    *   label="Phone number"
    *   render={props =>
    *     <TextInputMask
    *       {...props}
    *       mask="+[00] [000] [000] [000]"
    *     />
    *   }
    * />
    * ```
    */
  var render: js.UndefOr[js.Function1[/* props */ RenderProps, ReactNode]] = js.undefined
  
  var right: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Selection color of the input
    */
  var selectionColor: js.UndefOr[String] = js.undefined
  
  /**
    * Pass `fontSize` prop to modify the font size inside `TextInput`.
    * Pass `height` prop to set `TextInput` height. When `height` is passed,
    * `dense` prop will affect only input's `paddingVertical`.
    * Pass `paddingHorizontal` to modify horizontal padding.
    * This can be used to get MD Guidelines v1 TextInput look.
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Inactive underline color of the input.
    */
  var underlineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the text input.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ActiveOutlineColor {
  
  inline def apply(theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): ActiveOutlineColor = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOutlineColor]
  }
  
  extension [Self <: ActiveOutlineColor](x: Self) {
    
    inline def setActiveOutlineColor(value: String): Self = StObject.set(x, "activeOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setActiveOutlineColorUndefined: Self = StObject.set(x, "activeOutlineColor", js.undefined)
    
    inline def setActiveUnderlineColor(value: String): Self = StObject.set(x, "activeUnderlineColor", value.asInstanceOf[js.Any])
    
    inline def setActiveUnderlineColorUndefined: Self = StObject.set(x, "activeUnderlineColor", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabel(value: TextInputLabelProp): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMode(value: flat | outlined): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnBlur(value: /* args */ Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChangeText(value: js.Function): Self = StObject.set(x, "onChangeText", value.asInstanceOf[js.Any])
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnFocus(value: /* args */ Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRender(value: /* props */ RenderProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColor(value: String): Self = StObject.set(x, "underlineColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColorUndefined: Self = StObject.set(x, "underlineColor", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
