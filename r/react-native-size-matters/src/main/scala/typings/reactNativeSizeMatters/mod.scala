package typings.reactNativeSizeMatters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-size-matters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ScaledSheet {
    
    @JSImport("react-native-size-matters", "ScaledSheet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T /* <: NamedStyles[Any | T] */](stylesObject: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: react-native.react-native.RegisteredStyle<T[P] & std.Record<std.Extract<keyof T[P], 'fontSize' | 'letterSpacing' | 'lineHeight' | 'textShadowRadius' | 'borderBottomLeftRadius' | 'borderBottomRightRadius' | 'borderTopLeftRadius' | 'borderTopRightRadius' | 'borderBottomWidth' | 'borderTopWidth' | 'borderRightWidth' | 'borderLeftWidth' | 'borderRadius' | 'shadowRadius' | 'borderWidth' | 'aspectRatio' | 'rotation' | 'scaleX' | 'scaleY' | 'translateX' | 'translateY'>, number>>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stylesObject.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: react-native.react-native.RegisteredStyle<T[P] & std.Record<std.Extract<keyof T[P], 'fontSize' | 'letterSpacing' | 'lineHeight' | 'textShadowRadius' | 'borderBottomLeftRadius' | 'borderBottomRightRadius' | 'borderTopLeftRadius' | 'borderTopRightRadius' | 'borderBottomWidth' | 'borderTopWidth' | 'borderRightWidth' | 'borderLeftWidth' | 'borderRadius' | 'shadowRadius' | 'borderWidth' | 'aspectRatio' | 'rotation' | 'scaleX' | 'scaleY' | 'translateX' | 'translateY'>, number>>} */ js.Any]
  }
  
  inline def moderateScale(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("moderateScale")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def moderateScale(size: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("moderateScale")(size.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def moderateVerticalScale(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("moderateVerticalScale")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def moderateVerticalScale(size: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("moderateVerticalScale")(size.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ms(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def ms(size: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ms")(size.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mvs(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mvs")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mvs(size: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mvs")(size.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def s(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def scale(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def verticalScale(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("verticalScale")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def vs(size: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("vs")(size.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: react-native.react-native.ViewStyle | react-native.react-native.TextStyle | react-native.react-native.ImageStyle | react-native-size-matters.react-native-size-matters.StringifiedStyles}
    }}}
    */
  @js.native
  trait NamedStyles[T] extends StObject
  
  trait StringifiedStyles extends StObject {
    
    var aspectRatio: js.UndefOr[String | Double] = js.undefined
    
    var borderBottomLeftRadius: js.UndefOr[String | Double] = js.undefined
    
    var borderBottomRightRadius: js.UndefOr[String | Double] = js.undefined
    
    var borderBottomWidth: js.UndefOr[String | Double] = js.undefined
    
    var borderLeftWidth: js.UndefOr[String | Double] = js.undefined
    
    var borderRadius: js.UndefOr[String | Double] = js.undefined
    
    var borderRightWidth: js.UndefOr[String | Double] = js.undefined
    
    var borderTopLeftRadius: js.UndefOr[String | Double] = js.undefined
    
    var borderTopRightRadius: js.UndefOr[String | Double] = js.undefined
    
    var borderTopWidth: js.UndefOr[String | Double] = js.undefined
    
    var borderWidth: js.UndefOr[String | Double] = js.undefined
    
    var fontSize: js.UndefOr[String | Double] = js.undefined
    
    var letterSpacing: js.UndefOr[String | Double] = js.undefined
    
    var lineHeight: js.UndefOr[String | Double] = js.undefined
    
    var rotation: js.UndefOr[String | Double] = js.undefined
    
    var scaleX: js.UndefOr[String | Double] = js.undefined
    
    var scaleY: js.UndefOr[String | Double] = js.undefined
    
    var shadowRadius: js.UndefOr[String | Double] = js.undefined
    
    var textShadowRadius: js.UndefOr[String | Double] = js.undefined
    
    var translateX: js.UndefOr[String | Double] = js.undefined
    
    var translateY: js.UndefOr[String | Double] = js.undefined
  }
  object StringifiedStyles {
    
    inline def apply(): StringifiedStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifiedStyles]
    }
    
    extension [Self <: StringifiedStyles](x: Self) {
      
      inline def setAspectRatio(value: String | Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBorderBottomLeftRadius(value: String | Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(value: String | Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomWidth(value: String | Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderLeftWidth(value: String | Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRightWidth(value: String | Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      inline def setBorderTopLeftRadius(value: String | Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(value: String | Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopWidth(value: String | Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderWidth(value: String | Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setLetterSpacing(value: String | Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setRotation(value: String | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScaleX(value: String | Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: String | Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setShadowRadius(value: String | Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
      
      inline def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
      
      inline def setTextShadowRadius(value: String | Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
      
      inline def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
      
      inline def setTranslateX(value: String | Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: String | Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    }
  }
}
