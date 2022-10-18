package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.libTypesReanimated2EasingMod.EasingFn
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.KeyframeProps
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2LayoutReanimationAnimationBuilderMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
  @js.native
  open class BaseAnimationBuilder ()
    extends typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder
  /* static members */
  object BaseAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): EntryExitAnimationFunction | LayoutAnimationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[EntryExitAnimationFunction | LayoutAnimationFunction]
    
    inline def createInstance(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def delay(delayMs: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def duration(durationMs: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def getDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")().asInstanceOf[Double]
    
    inline def randomDelay(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDelay")().asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
  @js.native
  open class ComplexAnimationBuilder ()
    extends typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder
  /* static members */
  object ComplexAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def damping(damping: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("damping")(damping.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def easing(easingFunction: EasingFn): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("easing")(easingFunction.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def mass(mass: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("mass")(mass.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def overshootClamping(overshootClamping: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("overshootClamping")(overshootClamping.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restDisplacementThreshold(restDisplacementThreshold: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restSpeedThreshold(restSpeedThreshold: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def rotate(degree: String): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(degree.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def springify(): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("springify")().asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def stiffness(stiffness: Double): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("stiffness")(stiffness.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def withInitialValues(values: StyleProps): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withInitialValues")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "Keyframe")
  @js.native
  open class Keyframe protected ()
    extends typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderKeyframeMod.Keyframe {
    def this(definitions: Record[String, KeyframeProps]) = this()
  }
}
