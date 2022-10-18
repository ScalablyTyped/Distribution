package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.RepeatAnimation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationRepeatMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loop(nextAnimation: NextAnimation[RepeatAnimation]): Animation[RepeatAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(nextAnimation.asInstanceOf[js.Any]).asInstanceOf[Animation[RepeatAnimation]]
  inline def loop(nextAnimation: NextAnimation[RepeatAnimation], numberOfLoops: Double): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(nextAnimation.asInstanceOf[js.Any], numberOfLoops.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  
  inline def repeat(_nextAnimation: NextAnimation[RepeatAnimation]): Animation[RepeatAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any]).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Double,
    reverse: Boolean,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Double,
    reverse: Unit,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Unit, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Unit,
    reverse: Boolean,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  inline def repeat(
    _nextAnimation: NextAnimation[RepeatAnimation],
    numberOfReps: Unit,
    reverse: Unit,
    callback: AnimationCallback
  ): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
  
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
  
  /* Inlined parent std.Omit<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation, 'toValue' | 'startValue'> */
  trait InnerRepeatAnimation extends StObject {
    
    var __prefix: js.UndefOr[String] = js.undefined
    
    var __suffix: js.UndefOr[String] = js.undefined
    
    var callback: AnimationCallback
    
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    var current: js.UndefOr[AnimatableValue] = js.undefined
    
    var finished: js.UndefOr[Boolean] = js.undefined
    
    var isHigherOrder: js.UndefOr[Boolean] = js.undefined
    
    var onFrame: js.Function2[/* animation */ RepeatAnimation, /* timestamp */ Timestamp, Boolean]
    
    var onStart: js.Function4[
        /* nextAnimation */ RepeatAnimation, 
        /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, 
        /* timestamp */ Timestamp, 
        /* previousAnimation */ RepeatAnimation, 
        Unit
      ]
    
    var previousAnimation: js.UndefOr[RepeatAnimation] = js.undefined
    
    var reps: Double
    
    var startValue: Double
    
    var strippedCurrent: js.UndefOr[Double] = js.undefined
    
    var toValue: Double
  }
  object InnerRepeatAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      onFrame: (/* animation */ RepeatAnimation, /* timestamp */ Timestamp) => Boolean,
      onStart: (/* nextAnimation */ RepeatAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ RepeatAnimation) => Unit,
      reps: Double,
      startValue: Double,
      toValue: Double
    ): InnerRepeatAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), reps = reps.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerRepeatAnimation]
    }
    
    extension [Self <: InnerRepeatAnimation](x: Self) {
      
      inline def setCallback(value: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
      
      inline def setIsHigherOrder(value: Boolean): Self = StObject.set(x, "isHigherOrder", value.asInstanceOf[js.Any])
      
      inline def setIsHigherOrderUndefined: Self = StObject.set(x, "isHigherOrder", js.undefined)
      
      inline def setOnFrame(value: (/* animation */ RepeatAnimation, /* timestamp */ Timestamp) => Boolean): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      inline def setOnStart(
        value: (/* nextAnimation */ RepeatAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ RepeatAnimation) => Unit
      ): Self = StObject.set(x, "onStart", js.Any.fromFunction4(value))
      
      inline def setPreviousAnimation(value: RepeatAnimation): Self = StObject.set(x, "previousAnimation", value.asInstanceOf[js.Any])
      
      inline def setPreviousAnimationUndefined: Self = StObject.set(x, "previousAnimation", js.undefined)
      
      inline def setReps(value: Double): Self = StObject.set(x, "reps", value.asInstanceOf[js.Any])
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStrippedCurrent(value: Double): Self = StObject.set(x, "strippedCurrent", value.asInstanceOf[js.Any])
      
      inline def setStrippedCurrentUndefined: Self = StObject.set(x, "strippedCurrent", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def set__prefix(value: String): Self = StObject.set(x, "__prefix", value.asInstanceOf[js.Any])
      
      inline def set__prefixUndefined: Self = StObject.set(x, "__prefix", js.undefined)
      
      inline def set__suffix(value: String): Self = StObject.set(x, "__suffix", value.asInstanceOf[js.Any])
      
      inline def set__suffixUndefined: Self = StObject.set(x, "__suffix", js.undefined)
    }
  }
}
