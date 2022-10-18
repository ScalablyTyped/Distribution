package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.DelayAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationDelayMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]
  
  inline def withDelay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]
}
