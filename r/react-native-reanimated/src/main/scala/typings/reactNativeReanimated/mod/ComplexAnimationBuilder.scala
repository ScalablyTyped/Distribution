package typings.reactNativeReanimated.mod

import typings.reactNative.mod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "ComplexAnimationBuilder")
@js.native
open class ComplexAnimationBuilder () extends BaseAnimationBuilder {
  
  def damping(dampingFactor: Double): ComplexAnimationBuilder = js.native
  
  def easing(easingFunction: EasingFunction): ComplexAnimationBuilder = js.native
  
  def mass(mass: Double): ComplexAnimationBuilder = js.native
  
  def overshootClamping(overshootClampingFactor: Double): ComplexAnimationBuilder = js.native
  
  def restDisplacementThreshold(restDisplacementThresholdFactor: Double): ComplexAnimationBuilder = js.native
  
  def restSpeedThreshold(restSpeedThresholdFactor: Double): ComplexAnimationBuilder = js.native
  
  def springify(): ComplexAnimationBuilder = js.native
  
  def stiffness(stiffnessFactor: Double): ComplexAnimationBuilder = js.native
  
  def withInitialValues(values: StyleProps): BaseAnimationBuilder = js.native
}
/* static members */
object ComplexAnimationBuilder {
  
  @JSImport("react-native-reanimated", "ComplexAnimationBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def damping(dampingFactor: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("damping")(dampingFactor.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def delay(durationMs: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(durationMs.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def duration(durationMs: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def easing(easingFunction: EasingFunction): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("easing")(easingFunction.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def mass(mass: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("mass")(mass.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def overshootClamping(overshootClampingFactor: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("overshootClamping")(overshootClampingFactor.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def restDisplacementThreshold(restDisplacementThresholdFactor: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restDisplacementThreshold")(restDisplacementThresholdFactor.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def restSpeedThreshold(restSpeedThresholdFactor: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restSpeedThreshold")(restSpeedThresholdFactor.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def springify(): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("springify")().asInstanceOf[ComplexAnimationBuilder]
  
  inline def stiffness(stiffnessFactor: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("stiffness")(stiffnessFactor.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
  
  inline def withInitialValues(values: StyleProps): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withInitialValues")(values.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
}
