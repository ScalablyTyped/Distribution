package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.AnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationAndConfig
import typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder
import typings.reactNativeReanimated.easingMod.EasingFn
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexAnimationBuilderMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder/ComplexAnimationBuilder", "ComplexAnimationBuilder")
  @js.native
  open class ComplexAnimationBuilder () extends BaseAnimationBuilder {
    
    def damping(damping: Double): ComplexAnimationBuilder = js.native
    
    var dampingV: js.UndefOr[Double] = js.native
    
    def easing(easingFunction: EasingFn): ComplexAnimationBuilder = js.native
    
    var easingV: js.UndefOr[EasingFn] = js.native
    
    def getAnimationAndConfig(): LayoutAnimationAndConfig = js.native
    
    var initialValues: js.UndefOr[StyleProps] = js.native
    
    def mass(mass: Double): ComplexAnimationBuilder = js.native
    
    var massV: js.UndefOr[Double] = js.native
    
    def overshootClamping(overshootClamping: Double): ComplexAnimationBuilder = js.native
    
    var overshootClampingV: js.UndefOr[Double] = js.native
    
    def restDisplacementThreshold(restDisplacementThreshold: Double): ComplexAnimationBuilder = js.native
    
    var restDisplacementThresholdV: js.UndefOr[Double] = js.native
    
    def restSpeedThreshold(restSpeedThreshold: Double): ComplexAnimationBuilder = js.native
    
    var restSpeedThresholdV: js.UndefOr[Double] = js.native
    
    def rotate(degree: String): ComplexAnimationBuilder = js.native
    
    var rotateV: js.UndefOr[String] = js.native
    
    def springify(): ComplexAnimationBuilder = js.native
    
    def stiffness(stiffness: Double): ComplexAnimationBuilder = js.native
    
    var stiffnessV: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[AnimationFunction] = js.native
    
    def withInitialValues(values: StyleProps): BaseAnimationBuilder = js.native
  }
  /* static members */
  object ComplexAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder/ComplexAnimationBuilder", "ComplexAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[ComplexAnimationBuilder]
    
    inline def damping(damping: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("damping")(damping.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def easing(easingFunction: EasingFn): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("easing")(easingFunction.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def mass(mass: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("mass")(mass.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def overshootClamping(overshootClamping: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("overshootClamping")(overshootClamping.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def restDisplacementThreshold(restDisplacementThreshold: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def restSpeedThreshold(restSpeedThreshold: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def rotate(degree: String): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(degree.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def springify(): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("springify")().asInstanceOf[ComplexAnimationBuilder]
    
    inline def stiffness(stiffness: Double): ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("stiffness")(stiffness.asInstanceOf[js.Any]).asInstanceOf[ComplexAnimationBuilder]
    
    inline def withInitialValues(values: StyleProps): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withInitialValues")(values.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
  }
}
