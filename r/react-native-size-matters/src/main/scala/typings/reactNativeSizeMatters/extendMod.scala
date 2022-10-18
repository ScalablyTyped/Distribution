package typings.reactNativeSizeMatters

import typings.reactNativeSizeMatters.mod.NamedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendMod {
  
  @JSImport("react-native-size-matters/extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ScaledSheet {
    
    @JSImport("react-native-size-matters/extend", "ScaledSheet")
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
}
