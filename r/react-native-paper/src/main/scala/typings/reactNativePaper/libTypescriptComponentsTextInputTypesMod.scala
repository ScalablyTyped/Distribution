package typings.reactNativePaper

import typings.react.mod.ReactElement
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.TextInput
import typings.reactNativePaper.anon.ForceFocus
import typings.reactNativePaper.anon.Measured
import typings.reactNativePaper.anon.PaddingRight
import typings.reactNativePaper.anon.Width
import typings.reactNativePaper.libTypescriptComponentsTextInputTextInputMod.Props
import typings.reactNativePaper.libTypescriptTypesMod.Omit
import typings.reactNativePaper.reactNativePaperStrings.`100`
import typings.reactNativePaper.reactNativePaperStrings.`200`
import typings.reactNativePaper.reactNativePaperStrings.`300`
import typings.reactNativePaper.reactNativePaperStrings.`400`
import typings.reactNativePaper.reactNativePaperStrings.`500`
import typings.reactNativePaper.reactNativePaperStrings.`600`
import typings.reactNativePaper.reactNativePaperStrings.`700`
import typings.reactNativePaper.reactNativePaperStrings.`800`
import typings.reactNativePaper.reactNativePaperStrings.`900`
import typings.reactNativePaper.reactNativePaperStrings.bold
import typings.reactNativePaper.reactNativePaperStrings.flat
import typings.reactNativePaper.reactNativePaperStrings.mode
import typings.reactNativePaper.reactNativePaperStrings.normal
import typings.reactNativePaper.reactNativePaperStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputTypesMod {
  
  type ChildTextInputProps = ForceFocus & TextInputTypesWithoutMode
  
  trait InputLabelProps extends StObject {
    
    var labelBackground: js.UndefOr[Any] = js.undefined
    
    var labelProps: LabelProps
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var parentState: State
  }
  object InputLabelProps {
    
    inline def apply(labelProps: LabelProps, parentState: State): InputLabelProps = {
      val __obj = js.Dynamic.literal(labelProps = labelProps.asInstanceOf[js.Any], parentState = parentState.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputLabelProps] (val x: Self) extends AnyVal {
      
      inline def setLabelBackground(value: Any): Self = StObject.set(x, "labelBackground", value.asInstanceOf[js.Any])
      
      inline def setLabelBackgroundUndefined: Self = StObject.set(x, "labelBackground", js.undefined)
      
      inline def setLabelProps(value: LabelProps): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setParentState(value: State): Self = StObject.set(x, "parentState", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelBackgroundProps extends StObject {
    
    var labelProps: LabelProps
    
    var labelStyle: Any
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var parentState: State
  }
  object LabelBackgroundProps {
    
    inline def apply(labelProps: LabelProps, labelStyle: Any, parentState: State): LabelBackgroundProps = {
      val __obj = js.Dynamic.literal(labelProps = labelProps.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], parentState = parentState.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelBackgroundProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelBackgroundProps] (val x: Self) extends AnyVal {
      
      inline def setLabelProps(value: LabelProps): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
      
      inline def setLabelStyle(value: Any): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setParentState(value: State): Self = StObject.set(x, "parentState", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelProps extends StObject {
    
    var activeColor: String
    
    var backgroundColor: js.UndefOr[ColorValue] = js.undefined
    
    var baseLabelTranslateX: Double
    
    var baseLabelTranslateY: Double
    
    var error: js.UndefOr[Boolean | Null] = js.undefined
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var font: Any
    
    var fontSize: Double
    
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.undefined
    
    var hasActiveOutline: js.UndefOr[Boolean | Null] = js.undefined
    
    var label: js.UndefOr[TextInputLabelProp | Null] = js.undefined
    
    var labelScale: Double
    
    var labelTranslationXOffset: js.UndefOr[Double] = js.undefined
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var mode: js.UndefOr[flat | outlined] = js.undefined
    
    def onLayoutAnimatedText(args: Any): Unit
    
    var paddingOffset: js.UndefOr[PaddingRight | Null] = js.undefined
    
    var placeholderColor: String | Null
    
    var placeholderOpacity: Double | Value | (AnimatedInterpolation[Double | String])
    
    var placeholderStyle: Any
    
    var roundness: Double
    
    var topPosition: Double
    
    var wiggleOffsetX: Double
  }
  object LabelProps {
    
    inline def apply(
      activeColor: String,
      baseLabelTranslateX: Double,
      baseLabelTranslateY: Double,
      font: Any,
      fontSize: Double,
      labelScale: Double,
      onLayoutAnimatedText: Any => Unit,
      placeholderOpacity: Double | Value | (AnimatedInterpolation[Double | String]),
      placeholderStyle: Any,
      roundness: Double,
      topPosition: Double,
      wiggleOffsetX: Double
    ): LabelProps = {
      val __obj = js.Dynamic.literal(activeColor = activeColor.asInstanceOf[js.Any], baseLabelTranslateX = baseLabelTranslateX.asInstanceOf[js.Any], baseLabelTranslateY = baseLabelTranslateY.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], labelScale = labelScale.asInstanceOf[js.Any], onLayoutAnimatedText = js.Any.fromFunction1(onLayoutAnimatedText), placeholderOpacity = placeholderOpacity.asInstanceOf[js.Any], placeholderStyle = placeholderStyle.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any], wiggleOffsetX = wiggleOffsetX.asInstanceOf[js.Any], placeholderColor = null)
      __obj.asInstanceOf[LabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelProps] (val x: Self) extends AnyVal {
      
      inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBaseLabelTranslateX(value: Double): Self = StObject.set(x, "baseLabelTranslateX", value.asInstanceOf[js.Any])
      
      inline def setBaseLabelTranslateY(value: Double): Self = StObject.set(x, "baseLabelTranslateY", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFont(value: Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHasActiveOutline(value: Boolean): Self = StObject.set(x, "hasActiveOutline", value.asInstanceOf[js.Any])
      
      inline def setHasActiveOutlineNull: Self = StObject.set(x, "hasActiveOutline", null)
      
      inline def setHasActiveOutlineUndefined: Self = StObject.set(x, "hasActiveOutline", js.undefined)
      
      inline def setLabel(value: TextInputLabelProp): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelScale(value: Double): Self = StObject.set(x, "labelScale", value.asInstanceOf[js.Any])
      
      inline def setLabelTranslationXOffset(value: Double): Self = StObject.set(x, "labelTranslationXOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelTranslationXOffsetUndefined: Self = StObject.set(x, "labelTranslationXOffset", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setMode(value: flat | outlined): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnLayoutAnimatedText(value: Any => Unit): Self = StObject.set(x, "onLayoutAnimatedText", js.Any.fromFunction1(value))
      
      inline def setPaddingOffset(value: PaddingRight): Self = StObject.set(x, "paddingOffset", value.asInstanceOf[js.Any])
      
      inline def setPaddingOffsetNull: Self = StObject.set(x, "paddingOffset", null)
      
      inline def setPaddingOffsetUndefined: Self = StObject.set(x, "paddingOffset", js.undefined)
      
      inline def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderColorNull: Self = StObject.set(x, "placeholderColor", null)
      
      inline def setPlaceholderOpacity(value: Double | Value | (AnimatedInterpolation[Double | String])): Self = StObject.set(x, "placeholderOpacity", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderStyle(value: Any): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def setRoundness(value: Double): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
      
      inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
      
      inline def setWiggleOffsetX(value: Double): Self = StObject.set(x, "wiggleOffsetX", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderProps extends StObject {
    
    var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    var numberOfLines: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.native
    
    var onChangeText: js.UndefOr[js.Function1[/* a */ String, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var placeholderTextColor: js.UndefOr[ColorValue] = js.native
    
    def ref(): Unit = js.native
    def ref(a: TextInput): Unit = js.native
    
    var selectionColor: js.UndefOr[String] = js.native
    
    var style: Any = js.native
    
    var underlineColorAndroid: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  
  trait State extends StObject {
    
    var error: Value
    
    var focused: Boolean
    
    var labelLayout: Measured
    
    var labeled: Value
    
    var leftLayout: Width
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rightLayout: Width
    
    var value: js.UndefOr[String] = js.undefined
  }
  object State {
    
    inline def apply(
      error: Value,
      focused: Boolean,
      labelLayout: Measured,
      labeled: Value,
      leftLayout: Width,
      rightLayout: Width
    ): State = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], labeled = labeled.asInstanceOf[js.Any], leftLayout = leftLayout.asInstanceOf[js.Any], rightLayout = rightLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setError(value: Value): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setLabelLayout(value: Measured): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
      
      inline def setLabeled(value: Value): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      inline def setLeftLayout(value: Width): Self = StObject.set(x, "leftLayout", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRightLayout(value: Width): Self = StObject.set(x, "rightLayout", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TextInputLabelProp = String | ReactElement
  
  type TextInputTypesWithoutMode = Omit[Props, mode]
}
