package typings.reactNativeReanimated

import typings.reactNativeReanimated.commonTypesMod.DelayAnimation
import typings.reactNativeReanimated.commonTypesMod.NextAnimation
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]
  
  inline def withDelay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]
}
