package typings.reactNativePaper

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNativePaper.anon.AdornmentConfigArray
import typings.reactNativePaper.anon.AffixHeight
import typings.reactNativePaper.anon.LabelYOffset
import typings.reactNativePaper.anon.PaddingBottom
import typings.reactNativePaper.anon.PaddingRight
import typings.reactNativePaper.libTypescriptComponentsTextInputTypesMod.TextInputLabelProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputHelpersMod {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustPaddingFlat(hasPadScaleMultilineLabelHeightOffsetDenseFontSizeIsAndroidStyles: AdjProps): Padding = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustPaddingFlat")(hasPadScaleMultilineLabelHeightOffsetDenseFontSizeIsAndroidStyles.asInstanceOf[js.Any]).asInstanceOf[Padding]
  
  inline def adjustPaddingOut(hasPadMultilineLabelScaleHeightFontSizeLineHeightDenseOffsetIsAndroid: AdjProps): Padding = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustPaddingOut")(hasPadMultilineLabelScaleHeightFontSizeLineHeightDenseOffsetIsAndroid.asInstanceOf[js.Any]).asInstanceOf[Padding]
  
  inline def calculateFlatAffixTopPosition(hasHeightPaddingTopPaddingBottomAffixHeight: AffixHeight): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateFlatAffixTopPosition")(hasHeightPaddingTopPaddingBottomAffixHeight.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateFlatInputHorizontalPadding(hasAdornmentConfig: AdornmentConfigArray): PaddingRight = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateFlatInputHorizontalPadding")(hasAdornmentConfig.asInstanceOf[js.Any]).asInstanceOf[PaddingRight]
  
  inline def calculateInputHeight(labelHeight: Double, height: Any, minHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInputHeight")(labelHeight.asInstanceOf[js.Any], height.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateLabelTopPosition(labelHeight: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateLabelTopPosition")(labelHeight.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculateLabelTopPosition(labelHeight: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLabelTopPosition")(labelHeight.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateLabelTopPosition(labelHeight: Double, height: Double, optionalPadding: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLabelTopPosition")(labelHeight.asInstanceOf[js.Any], height.asInstanceOf[js.Any], optionalPadding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateLabelTopPosition(labelHeight: Double, height: Unit, optionalPadding: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLabelTopPosition")(labelHeight.asInstanceOf[js.Any], height.asInstanceOf[js.Any], optionalPadding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateOutlinedIconAndAffixTopPosition(hasHeightAffixHeightLabelYOffset: LabelYOffset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateOutlinedIconAndAffixTopPosition")(hasHeightAffixHeightLabelYOffset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculatePadding(props: PaddingProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePadding")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def interpolatePlaceholder(labeled: Value): AnimatedInterpolation[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePlaceholder")(labeled.asInstanceOf[js.Any]).asInstanceOf[AnimatedInterpolation[Double | String]]
  inline def interpolatePlaceholder(labeled: Value, hasActiveOutline: Boolean): AnimatedInterpolation[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePlaceholder")(labeled.asInstanceOf[js.Any], hasActiveOutline.asInstanceOf[js.Any])).asInstanceOf[AnimatedInterpolation[Double | String]]
  
  trait AdjProps
    extends StObject
       with PaddingProps {
    
    var pad: Double
  }
  object AdjProps {
    
    inline def apply(
      fontSize: Double,
      isAndroid: Boolean,
      labelHalfHeight: Double,
      offset: Double,
      pad: Double,
      scale: Double,
      styles: PaddingBottom,
      topPosition: Double
    ): AdjProps = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], labelHalfHeight = labelHalfHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any], dense = null, height = null, multiline = null)
      __obj.asInstanceOf[AdjProps]
    }
    
    extension [Self <: AdjProps](x: Self) {
      
      inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    }
  }
  
  trait Padding extends StObject {
    
    var paddingBottom: Double
    
    var paddingTop: Double
  }
  object Padding {
    
    inline def apply(paddingBottom: Double, paddingTop: Double): Padding = {
      val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    extension [Self <: Padding](x: Self) {
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaddingProps extends StObject {
    
    var dense: Boolean | Null
    
    var fontSize: Double
    
    var height: Double | Null
    
    var isAndroid: Boolean
    
    var label: js.UndefOr[TextInputLabelProp | Null] = js.undefined
    
    var labelHalfHeight: Double
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var multiline: Boolean | Null
    
    var offset: Double
    
    var scale: Double
    
    var styles: PaddingBottom
    
    var topPosition: Double
  }
  object PaddingProps {
    
    inline def apply(
      fontSize: Double,
      isAndroid: Boolean,
      labelHalfHeight: Double,
      offset: Double,
      scale: Double,
      styles: PaddingBottom,
      topPosition: Double
    ): PaddingProps = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], labelHalfHeight = labelHalfHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any], dense = null, height = null, multiline = null)
      __obj.asInstanceOf[PaddingProps]
    }
    
    extension [Self <: PaddingProps](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseNull: Self = StObject.set(x, "dense", null)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: TextInputLabelProp): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelHalfHeight(value: Double): Self = StObject.set(x, "labelHalfHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineNull: Self = StObject.set(x, "multiline", null)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: PaddingBottom): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
    }
  }
}
