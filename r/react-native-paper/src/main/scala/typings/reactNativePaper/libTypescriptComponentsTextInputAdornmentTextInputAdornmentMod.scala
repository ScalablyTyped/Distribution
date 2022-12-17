package typings.reactNativePaper

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.anon.Affix
import typings.reactNativePaper.anon.Right
import typings.reactNativePaper.anon.`28`
import typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
import typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentStyleAdjustmentForNativeInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputAdornmentTextInputAdornmentMod {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAdornment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAdornment", JSImport.Default)
  @js.native
  val default: FunctionComponent[TextInputAdornmentProps] = js.native
  
  inline def getAdornmentConfig(param0: Right): js.Array[AdornmentConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdornmentConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[AdornmentConfig]]
  
  inline def getAdornmentStyleAdjustmentForNativeInput(param0: typings.reactNativePaper.anon.AdornmentConfig): AdornmentStyleAdjustmentForNativeInput | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdornmentStyleAdjustmentForNativeInput")(param0.asInstanceOf[js.Any]).asInstanceOf[AdornmentStyleAdjustmentForNativeInput | js.Object]
  
  trait TextInputAdornmentProps extends StObject {
    
    var adornmentConfig: js.Array[AdornmentConfig]
    
    def forceFocus(): Unit
    
    var isTextInputFocused: Boolean
    
    var left: js.UndefOr[ReactNode] = js.undefined
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var onAffixChange: `28`
    
    var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var right: js.UndefOr[ReactNode] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var topPosition: Affix
    
    var visible: js.UndefOr[Value] = js.undefined
  }
  object TextInputAdornmentProps {
    
    inline def apply(
      adornmentConfig: js.Array[AdornmentConfig],
      forceFocus: () => Unit,
      isTextInputFocused: Boolean,
      onAffixChange: `28`,
      topPosition: Affix
    ): TextInputAdornmentProps = {
      val __obj = js.Dynamic.literal(adornmentConfig = adornmentConfig.asInstanceOf[js.Any], forceFocus = js.Any.fromFunction0(forceFocus), isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], onAffixChange = onAffixChange.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputAdornmentProps]
    }
    
    extension [Self <: TextInputAdornmentProps](x: Self) {
      
      inline def setAdornmentConfig(value: js.Array[AdornmentConfig]): Self = StObject.set(x, "adornmentConfig", value.asInstanceOf[js.Any])
      
      inline def setAdornmentConfigVarargs(value: AdornmentConfig*): Self = StObject.set(x, "adornmentConfig", js.Array(value*))
      
      inline def setForceFocus(value: () => Unit): Self = StObject.set(x, "forceFocus", js.Any.fromFunction0(value))
      
      inline def setIsTextInputFocused(value: Boolean): Self = StObject.set(x, "isTextInputFocused", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setOnAffixChange(value: `28`): Self = StObject.set(x, "onAffixChange", value.asInstanceOf[js.Any])
      
      inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
      
      inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
      
      inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTopPosition(value: Affix): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Value): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
