package typings.reactNativeResponsiveDimensions

import typings.reactNative.mod.ScaledSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-responsive-dimensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def responsiveFontSize(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSize")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def responsiveHeight(h: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveHeight")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def responsiveScreenFontSize(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveScreenFontSize")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def responsiveScreenHeight(h: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveScreenHeight")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def responsiveScreenWidth(w: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveScreenWidth")(w.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def responsiveWidth(w: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveWidth")(w.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useDimensionsChange(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDimensionsChange")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def useResponsiveFontSize(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveFontSize")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useResponsiveHeight(h: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveHeight")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useResponsiveScreenFontSize(f: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveScreenFontSize")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useResponsiveScreenHeight(h: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveScreenHeight")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useResponsiveScreenWidth(w: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveScreenWidth")(w.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useResponsiveWidth(w: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveWidth")(w.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type EffectCallback = js.Function1[/* opts */ EffectParams, js.Function0[js.Any] | Unit]
  
  trait EffectParams extends StObject {
    
    var screen: ScaledSize
    
    var window: ScaledSize
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
