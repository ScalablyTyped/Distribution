package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.DelayAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.RepeatAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.SequenceAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.StyleLayoutAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationDecayMod.DecayAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationDecayMod.DecayConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationSpringMod.SpringAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationSpringMod.SpringConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationTimingMod.TimingAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationTimingMod.TimingConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationUtilMod.AnimationToDecoration
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelAnimation[T](sharedValue: SharedValue[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")(sharedValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def defineAnimation[T /* <: AnimationObject | StyleLayoutAnimation */](starting: AnimationToDecoration[T], factory: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def initialUpdaterRun[T](updater: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("initialUpdaterRun")(updater.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def withDecay(userConfig: DecayConfig): Animation[DecayAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Animation[DecayAnimation]]
  inline def withDecay(userConfig: DecayConfig, callback: AnimationCallback): Animation[DecayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[DecayAnimation]]
  
  inline def withDelay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]
  
  inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation]): Animation[RepeatAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any]).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Double,
    reverse: Boolean,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Double,
    reverse: Unit,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Unit, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Unit,
    reverse: Boolean,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def withRepeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Unit,
    reverse: Unit,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  
  inline def withSequence(_animations: NextAnimation[AnimationObject]*): Animation[SequenceAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSequence")(_animations.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Animation[SequenceAnimation]]
  
  inline def withSpring(toValue: AnimatableValue): Animation[SpringAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  
  inline def withStyleAnimation(styleAnimations: AnimatedStyle): StyleLayoutAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyleAnimation")(styleAnimations.asInstanceOf[js.Any]).asInstanceOf[StyleLayoutAnimation]
  
  inline def withTiming(toValue: AnimatableValue): Animation[TimingAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
}
