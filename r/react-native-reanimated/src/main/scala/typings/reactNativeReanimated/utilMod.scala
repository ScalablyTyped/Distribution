package typings.reactNativeReanimated

import typings.reactNativeReanimated.commonTypesMod.DelayAnimation
import typings.reactNativeReanimated.commonTypesMod.NextAnimation
import typings.reactNativeReanimated.commonTypesMod.RepeatAnimation
import typings.reactNativeReanimated.commonTypesMod.SequenceAnimation
import typings.reactNativeReanimated.commonTypesMod.StyleLayoutAnimation
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelAnimation[T](sharedValue: SharedValue[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")(sharedValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def defineAnimation[T /* <: AnimationObject | StyleLayoutAnimation */](starting: AnimationToDecoration[T], factory: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def initialUpdaterRun[T](updater: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("initialUpdaterRun")(updater.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def withStartValue(startValue: AnimatableValue, animation: NextAnimation[AnimationObject]): Animation[AnimationObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStartValue")(startValue.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Animation[AnimationObject]]
  
  type AnimationToDecoration[T /* <: AnimationObject | StyleLayoutAnimation */] = AnimatableValue | T | (NextAnimation[DelayAnimation | RepeatAnimation | SequenceAnimation]) | (Record[String, Any])
  
  type UserUpdater = js.Function0[AnimatedStyle]
}
