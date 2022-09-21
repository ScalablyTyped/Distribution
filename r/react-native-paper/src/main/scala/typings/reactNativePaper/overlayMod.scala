package typings.reactNativePaper

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-native-paper/lib/typescript/styles/overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elevation: Double): (AnimatedInterpolation[Double | String]) | String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[(AnimatedInterpolation[Double | String]) | String]
  inline def default(elevation: Double, surfaceColor: String): (AnimatedInterpolation[Double | String]) | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any], surfaceColor.asInstanceOf[js.Any])).asInstanceOf[(AnimatedInterpolation[Double | String]) | String]
  inline def default(elevation: Value): (AnimatedInterpolation[Double | String]) | String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[(AnimatedInterpolation[Double | String]) | String]
  inline def default(elevation: Value, surfaceColor: String): (AnimatedInterpolation[Double | String]) | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any], surfaceColor.asInstanceOf[js.Any])).asInstanceOf[(AnimatedInterpolation[Double | String]) | String]
}
