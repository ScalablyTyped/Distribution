package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import typings.reactNativeReanimated.libTypesReanimated2EasingMod.EasingFactoryFn
import typings.reactNativeReanimated.libTypesReanimated2EasingMod.EasingFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationTimingMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/timing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTiming(toValue: AnimatableValue): Animation[TimingAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
  inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
  
  /* Inlined parent std.Omit<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/timing.TimingAnimation, 'toValue' | 'current'> */
  trait InnerTimingAnimation extends StObject {
    
    var __prefix: js.UndefOr[String] = js.undefined
    
    var __suffix: js.UndefOr[String] = js.undefined
    
    var callback: AnimationCallback
    
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    var current: Double
    
    var easing: EasingFn
    
    var finished: js.UndefOr[Boolean] = js.undefined
    
    var onFrame: js.Function2[/* animation */ TimingAnimation, /* timestamp */ Timestamp, Boolean]
    
    var onStart: js.Function4[
        /* nextAnimation */ TimingAnimation, 
        /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/timing.TimingAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, 
        /* timestamp */ Timestamp, 
        /* previousAnimation */ TimingAnimation, 
        Unit
      ]
    
    var progress: Double
    
    var startTime: Timestamp
    
    var startValue: AnimatableValue
    
    var strippedCurrent: js.UndefOr[Double] = js.undefined
    
    var toValue: Double
    
    var `type`: String
  }
  object InnerTimingAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      current: Double,
      easing: /* t */ Double => Double,
      onFrame: (/* animation */ TimingAnimation, /* timestamp */ Timestamp) => Boolean,
      onStart: (/* nextAnimation */ TimingAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/timing.TimingAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ TimingAnimation) => Unit,
      progress: Double,
      startTime: Timestamp,
      startValue: AnimatableValue,
      toValue: Double,
      `type`: String
    ): InnerTimingAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), current = current.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), progress = progress.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerTimingAnimation]
    }
    
    extension [Self <: InnerTimingAnimation](x: Self) {
      
      inline def setCallback(value: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
      
      inline def setOnFrame(value: (/* animation */ TimingAnimation, /* timestamp */ Timestamp) => Boolean): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      inline def setOnStart(
        value: (/* nextAnimation */ TimingAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/timing.TimingAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ TimingAnimation) => Unit
      ): Self = StObject.set(x, "onStart", js.Any.fromFunction4(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartValue(value: AnimatableValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueVarargs(value: Double*): Self = StObject.set(x, "startValue", js.Array(value*))
      
      inline def setStrippedCurrent(value: Double): Self = StObject.set(x, "strippedCurrent", value.asInstanceOf[js.Any])
      
      inline def setStrippedCurrentUndefined: Self = StObject.set(x, "strippedCurrent", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set__prefix(value: String): Self = StObject.set(x, "__prefix", value.asInstanceOf[js.Any])
      
      inline def set__prefixUndefined: Self = StObject.set(x, "__prefix", js.undefined)
      
      inline def set__suffix(value: String): Self = StObject.set(x, "__suffix", value.asInstanceOf[js.Any])
      
      inline def set__suffixUndefined: Self = StObject.set(x, "__suffix", js.undefined)
    }
  }
  
  trait TimingAnimation
    extends StObject
       with Animation[TimingAnimation] {
    
    @JSName("current")
    var current_TimingAnimation: AnimatableValue
    
    var easing: EasingFn
    
    var progress: Double
    
    var startTime: Timestamp
    
    @JSName("startValue")
    var startValue_TimingAnimation: AnimatableValue
    
    @JSName("toValue")
    var toValue_TimingAnimation: AnimatableValue
    
    var `type`: String
  }
  object TimingAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      current: AnimatableValue,
      easing: /* t */ Double => Double,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (TimingAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, TimingAnimation) => Unit,
      progress: Double,
      startTime: Timestamp,
      startValue: AnimatableValue,
      toValue: AnimatableValue,
      `type`: String
    ): TimingAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), current = current.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), progress = progress.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingAnimation]
    }
    
    extension [Self <: TimingAnimation](x: Self) {
      
      inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartValue(value: AnimatableValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueVarargs(value: Double*): Self = StObject.set(x, "startValue", js.Array(value*))
      
      inline def setToValue(value: AnimatableValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueVarargs(value: Double*): Self = StObject.set(x, "toValue", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimingConfig extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFn | EasingFactoryFn] = js.undefined
  }
  object TimingConfig {
    
    inline def apply(): TimingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimingConfig]
    }
    
    extension [Self <: TimingConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: EasingFn | EasingFactoryFn): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
