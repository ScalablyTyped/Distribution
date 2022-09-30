package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.AnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseAnimationBuilderMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder/BaseAnimationBuilder", "BaseAnimationBuilder")
  @js.native
  open class BaseAnimationBuilder () extends StObject {
    
    def build(): EntryExitAnimationFunction | LayoutAnimationFunction = js.native
    
    var callbackV: js.UndefOr[js.Function1[/* finished */ Boolean, Unit]] = js.native
    
    def delay(delayMs: Double): BaseAnimationBuilder = js.native
    
    var delayV: js.UndefOr[Double] = js.native
    
    def duration(durationMs: Double): BaseAnimationBuilder = js.native
    
    var durationV: js.UndefOr[Double] = js.native
    
    def getDelay(): Double = js.native
    
    def getDelayFunction(): AnimationFunction = js.native
    
    def getDuration(): Double = js.native
    
    def randomDelay(): BaseAnimationBuilder = js.native
    
    var randomizeDelay: Boolean = js.native
    
    def withCallback(callback: js.Function1[/* finsihed */ Boolean, Unit]): BaseAnimationBuilder = js.native
  }
  /* static members */
  object BaseAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder/BaseAnimationBuilder", "BaseAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): EntryExitAnimationFunction | LayoutAnimationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[EntryExitAnimationFunction | LayoutAnimationFunction]
    
    inline def createInstance(): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[BaseAnimationBuilder]
    
    inline def delay(delayMs: Double): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
    
    inline def duration(durationMs: Double): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
    
    inline def getDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")().asInstanceOf[Double]
    
    inline def randomDelay(): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDelay")().asInstanceOf[BaseAnimationBuilder]
    
    inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
  }
}
