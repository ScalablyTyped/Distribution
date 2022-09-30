package typings.reactNativeReanimated.reanimated2Mod

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated/lib/types/reanimated2", "BaseAnimationBuilder")
@js.native
open class BaseAnimationBuilder ()
  extends typings.reactNativeReanimated.layoutReanimationMod.BaseAnimationBuilder
/* static members */
object BaseAnimationBuilder {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2", "BaseAnimationBuilder")
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
