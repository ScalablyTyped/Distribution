package typings.reactNativeResponsiveDimensions

import typings.reactNative.mod.ScaledSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-responsive-dimensions", "responsiveFontSize")
  @js.native
  def responsiveFontSize(f: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "responsiveHeight")
  @js.native
  def responsiveHeight(h: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "responsiveScreenFontSize")
  @js.native
  def responsiveScreenFontSize(f: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "responsiveScreenHeight")
  @js.native
  def responsiveScreenHeight(h: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "responsiveScreenWidth")
  @js.native
  def responsiveScreenWidth(w: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "responsiveWidth")
  @js.native
  def responsiveWidth(w: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useDimensionsChange")
  @js.native
  def useDimensionsChange(effect: EffectCallback): Unit = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveFontSize")
  @js.native
  def useResponsiveFontSize(f: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveHeight")
  @js.native
  def useResponsiveHeight(h: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveScreenFontSize")
  @js.native
  def useResponsiveScreenFontSize(f: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveScreenHeight")
  @js.native
  def useResponsiveScreenHeight(h: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveScreenWidth")
  @js.native
  def useResponsiveScreenWidth(w: Double): Double = js.native
  
  @JSImport("react-native-responsive-dimensions", "useResponsiveWidth")
  @js.native
  def useResponsiveWidth(w: Double): Double = js.native
  
  type EffectCallback = js.Function1[/* opts */ EffectParams, js.UndefOr[js.Function0[js.Any] | Unit]]
  
  @js.native
  trait EffectParams extends StObject {
    
    var screen: ScaledSize = js.native
    
    var window: ScaledSize = js.native
  }
  object EffectParams {
    
    @scala.inline
    def apply(screen: ScaledSize, window: ScaledSize): EffectParams = {
      val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[EffectParams]
    }
    
    @scala.inline
    implicit class EffectParamsMutableBuilder[Self <: EffectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScreen(value: ScaledSize): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: ScaledSize): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
