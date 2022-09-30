package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "CurvedTransition")
@js.native
open class CurvedTransition () extends BaseAnimationBuilder {
  
  def easingHeight(easing: EasingFn): CurvedTransition = js.native
  
  def easingWidth(easing: EasingFn): CurvedTransition = js.native
  
  def easingX(easing: EasingFn): CurvedTransition = js.native
  
  def easingY(easing: EasingFn): CurvedTransition = js.native
}
/* static members */
object CurvedTransition {
  
  @JSImport("react-native-reanimated", "CurvedTransition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(durationMs: Double): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(durationMs.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
  
  inline def easingHeight(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingHeight")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
  
  inline def easingWidth(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingWidth")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
  
  inline def easingX(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingX")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
  
  inline def easingY(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingY")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
}
