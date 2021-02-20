package typings.reactNativeSizeMatters

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ScaledSheet {
    
    @JSImport("react-native-size-matters", "ScaledSheet.create")
    @js.native
    def create[T /* <: NamedStyles[_ | T] */](stylesObject: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: react-native.react-native.RegisteredStyle<T[P] & std.Record<std.Extract<keyof T[P], 'fontSize' | 'letterSpacing' | 'lineHeight' | 'textShadowRadius' | 'borderBottomLeftRadius' | 'borderBottomRightRadius' | 'borderTopLeftRadius' | 'borderTopRightRadius' | 'borderBottomWidth' | 'borderTopWidth' | 'borderRightWidth' | 'borderLeftWidth' | 'borderRadius' | 'shadowRadius' | 'borderWidth' | 'aspectRatio' | 'rotation' | 'scaleX' | 'scaleY' | 'translateX' | 'translateY'>, number>>}
      */ typings.reactNativeSizeMatters.reactNativeSizeMattersStrings.create with TopLevel[T] = js.native
  }
  
  @JSImport("react-native-size-matters", "moderateScale")
  @js.native
  def moderateScale(size: Double): Double = js.native
  @JSImport("react-native-size-matters", "moderateScale")
  @js.native
  def moderateScale(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "moderateVerticalScale")
  @js.native
  def moderateVerticalScale(size: Double): Double = js.native
  @JSImport("react-native-size-matters", "moderateVerticalScale")
  @js.native
  def moderateVerticalScale(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "ms")
  @js.native
  def ms(size: Double): Double = js.native
  @JSImport("react-native-size-matters", "ms")
  @js.native
  def ms(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "mvs")
  @js.native
  def mvs(size: Double): Double = js.native
  @JSImport("react-native-size-matters", "mvs")
  @js.native
  def mvs(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "s")
  @js.native
  def s(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "scale")
  @js.native
  def scale(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "verticalScale")
  @js.native
  def verticalScale(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters", "vs")
  @js.native
  def vs(size: Double): Double = js.native
  
  type NamedStyles[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle | react-native-size-matters.react-native-size-matters.StringifiedStyles}
    */ typings.reactNativeSizeMatters.reactNativeSizeMattersStrings.NamedStyles with TopLevel[js.Any]
  
  @js.native
  trait StringifiedStyles extends StObject {
    
    var aspectRatio: js.UndefOr[String | Double] = js.native
    
    var borderBottomLeftRadius: js.UndefOr[String | Double] = js.native
    
    var borderBottomRightRadius: js.UndefOr[String | Double] = js.native
    
    var borderBottomWidth: js.UndefOr[String | Double] = js.native
    
    var borderLeftWidth: js.UndefOr[String | Double] = js.native
    
    var borderRadius: js.UndefOr[String | Double] = js.native
    
    var borderRightWidth: js.UndefOr[String | Double] = js.native
    
    var borderTopLeftRadius: js.UndefOr[String | Double] = js.native
    
    var borderTopRightRadius: js.UndefOr[String | Double] = js.native
    
    var borderTopWidth: js.UndefOr[String | Double] = js.native
    
    var borderWidth: js.UndefOr[String | Double] = js.native
    
    var fontSize: js.UndefOr[String | Double] = js.native
    
    var letterSpacing: js.UndefOr[String | Double] = js.native
    
    var lineHeight: js.UndefOr[String | Double] = js.native
    
    var rotation: js.UndefOr[String | Double] = js.native
    
    var scaleX: js.UndefOr[String | Double] = js.native
    
    var scaleY: js.UndefOr[String | Double] = js.native
    
    var shadowRadius: js.UndefOr[String | Double] = js.native
    
    var textShadowRadius: js.UndefOr[String | Double] = js.native
    
    var translateX: js.UndefOr[String | Double] = js.native
    
    var translateY: js.UndefOr[String | Double] = js.native
  }
  object StringifiedStyles {
    
    @scala.inline
    def apply(): StringifiedStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifiedStyles]
    }
    
    @scala.inline
    implicit class StringifiedStylesMutableBuilder[Self <: StringifiedStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: String | Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setBorderBottomLeftRadius(value: String | Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomRightRadius(value: String | Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomWidth(value: String | Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      @scala.inline
      def setBorderLeftWidth(value: String | Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRightWidth(value: String | Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      @scala.inline
      def setBorderTopLeftRadius(value: String | Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderTopRightRadius(value: String | Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      @scala.inline
      def setBorderTopWidth(value: String | Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: String | Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: String | Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setRotation(value: String | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScaleX(value: String | Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: String | Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setShadowRadius(value: String | Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
      
      @scala.inline
      def setTextShadowRadius(value: String | Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
      
      @scala.inline
      def setTranslateX(value: String | Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      @scala.inline
      def setTranslateY(value: String | Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    }
  }
}
