package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.KeyframeProps
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.easingMod.EasingFn
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationBuilderMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
  @js.native
  open class BaseAnimationBuilder ()
    extends typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder
  /* static members */
  object BaseAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): EntryExitAnimationFunction | LayoutAnimationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[EntryExitAnimationFunction | LayoutAnimationFunction]
    
    inline def createInstance(): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def delay(delayMs: Double): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def duration(durationMs: Double): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def getDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")().asInstanceOf[Double]
    
    inline def randomDelay(): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDelay")().asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
  @js.native
  open class ComplexAnimationBuilder ()
    extends typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder
  /* static members */
  object ComplexAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def damping(damping: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("damping")(damping.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def easing(easingFunction: EasingFn): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("easing")(easingFunction.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def mass(mass: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("mass")(mass.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def overshootClamping(overshootClamping: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("overshootClamping")(overshootClamping.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restDisplacementThreshold(restDisplacementThreshold: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restSpeedThreshold(restSpeedThreshold: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def rotate(degree: String): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(degree.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def springify(): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("springify")().asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def stiffness(stiffness: Double): typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("stiffness")(stiffness.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def withInitialValues(values: StyleProps): typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withInitialValues")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.baseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "Keyframe")
  @js.native
  open class Keyframe protected ()
    extends typings.reactNativeReanimated.keyframeMod.Keyframe {
    def this(definitions: Record[String, KeyframeProps]) = this()
  }
}
