package typings.reactNativeSizeMatters

import org.scalablytyped.runtime.TopLevel
import typings.reactNativeSizeMatters.mod.NamedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendMod {
  
  object ScaledSheet {
    
    @JSImport("react-native-size-matters/extend", "ScaledSheet.create")
    @js.native
    def create[T /* <: NamedStyles[_ | T] */](stylesObject: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: react-native.react-native.RegisteredStyle<T[P] & std.Record<std.Extract<keyof T[P], 'fontSize' | 'letterSpacing' | 'lineHeight' | 'textShadowRadius' | 'borderBottomLeftRadius' | 'borderBottomRightRadius' | 'borderTopLeftRadius' | 'borderTopRightRadius' | 'borderBottomWidth' | 'borderTopWidth' | 'borderRightWidth' | 'borderLeftWidth' | 'borderRadius' | 'shadowRadius' | 'borderWidth' | 'aspectRatio' | 'rotation' | 'scaleX' | 'scaleY' | 'translateX' | 'translateY'>, number>>}
      */ typings.reactNativeSizeMatters.reactNativeSizeMattersStrings.create with TopLevel[T] = js.native
  }
  
  @JSImport("react-native-size-matters/extend", "moderateScale")
  @js.native
  def moderateScale(size: Double): Double = js.native
  @JSImport("react-native-size-matters/extend", "moderateScale")
  @js.native
  def moderateScale(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "moderateVerticalScale")
  @js.native
  def moderateVerticalScale(size: Double): Double = js.native
  @JSImport("react-native-size-matters/extend", "moderateVerticalScale")
  @js.native
  def moderateVerticalScale(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "ms")
  @js.native
  def ms(size: Double): Double = js.native
  @JSImport("react-native-size-matters/extend", "ms")
  @js.native
  def ms(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "mvs")
  @js.native
  def mvs(size: Double): Double = js.native
  @JSImport("react-native-size-matters/extend", "mvs")
  @js.native
  def mvs(size: Double, factor: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "s")
  @js.native
  def s(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "scale")
  @js.native
  def scale(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "verticalScale")
  @js.native
  def verticalScale(size: Double): Double = js.native
  
  @JSImport("react-native-size-matters/extend", "vs")
  @js.native
  def vs(size: Double): Double = js.native
}
