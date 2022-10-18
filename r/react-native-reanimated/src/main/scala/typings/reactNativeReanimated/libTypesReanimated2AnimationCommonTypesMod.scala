package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationCommonTypesMod {
  
  trait DelayAnimation
    extends StObject
       with Animation[DelayAnimation]
       with HigherOrderAnimation {
    
    @JSName("current")
    var current_DelayAnimation: AnimatableValue
    
    var previousAnimation: DelayAnimation | Null
    
    var startTime: Timestamp
    
    var started: Boolean
  }
  object DelayAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      current: AnimatableValue,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (DelayAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, DelayAnimation) => Unit,
      startTime: Timestamp,
      started: Boolean
    ): DelayAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), current = current.asInstanceOf[js.Any], onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), startTime = startTime.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], previousAnimation = null)
      __obj.asInstanceOf[DelayAnimation]
    }
    
    extension [Self <: DelayAnimation](x: Self) {
      
      inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setPreviousAnimation(value: DelayAnimation): Self = StObject.set(x, "previousAnimation", value.asInstanceOf[js.Any])
      
      inline def setPreviousAnimationNull: Self = StObject.set(x, "previousAnimation", null)
      
      inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    }
  }
  
  trait HigherOrderAnimation extends StObject {
    
    var isHigherOrder: js.UndefOr[Boolean] = js.undefined
  }
  object HigherOrderAnimation {
    
    inline def apply(): HigherOrderAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HigherOrderAnimation]
    }
    
    extension [Self <: HigherOrderAnimation](x: Self) {
      
      inline def setIsHigherOrder(value: Boolean): Self = StObject.set(x, "isHigherOrder", value.asInstanceOf[js.Any])
      
      inline def setIsHigherOrderUndefined: Self = StObject.set(x, "isHigherOrder", js.undefined)
    }
  }
  
  type NextAnimation[T /* <: AnimationObject */] = T | js.Function0[T]
  
  trait RepeatAnimation
    extends StObject
       with Animation[RepeatAnimation]
       with HigherOrderAnimation {
    
    var previousAnimation: js.UndefOr[RepeatAnimation] = js.undefined
    
    var reps: Double
    
    @JSName("startValue")
    var startValue_RepeatAnimation: AnimatableValue
  }
  object RepeatAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (RepeatAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, RepeatAnimation) => Unit,
      reps: Double,
      startValue: AnimatableValue
    ): RepeatAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), reps = reps.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepeatAnimation]
    }
    
    extension [Self <: RepeatAnimation](x: Self) {
      
      inline def setPreviousAnimation(value: RepeatAnimation): Self = StObject.set(x, "previousAnimation", value.asInstanceOf[js.Any])
      
      inline def setPreviousAnimationUndefined: Self = StObject.set(x, "previousAnimation", js.undefined)
      
      inline def setReps(value: Double): Self = StObject.set(x, "reps", value.asInstanceOf[js.Any])
      
      inline def setStartValue(value: AnimatableValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueVarargs(value: Double*): Self = StObject.set(x, "startValue", js.Array(value*))
    }
  }
  
  trait SequenceAnimation
    extends StObject
       with Animation[SequenceAnimation]
       with HigherOrderAnimation {
    
    var animationIndex: Double
  }
  object SequenceAnimation {
    
    inline def apply(
      animationIndex: Double,
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (SequenceAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, SequenceAnimation) => Unit
    ): SequenceAnimation = {
      val __obj = js.Dynamic.literal(animationIndex = animationIndex.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart))
      __obj.asInstanceOf[SequenceAnimation]
    }
    
    extension [Self <: SequenceAnimation](x: Self) {
      
      inline def setAnimationIndex(value: Double): Self = StObject.set(x, "animationIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleLayoutAnimation
    extends StObject
       with HigherOrderAnimation {
    
    var callback: js.UndefOr[AnimationCallback] = js.undefined
    
    var current: StyleProps
    
    def onFrame(animation: StyleLayoutAnimation, timestamp: Timestamp): Boolean
    
    def onStart(
      nextAnimation: StyleLayoutAnimation,
      current: AnimatedStyle,
      timestamp: Timestamp,
      previousAnimation: StyleLayoutAnimation
    ): Unit
    
    var styleAnimations: AnimatedStyle
  }
  object StyleLayoutAnimation {
    
    inline def apply(
      current: StyleProps,
      onFrame: (StyleLayoutAnimation, Timestamp) => Boolean,
      onStart: (StyleLayoutAnimation, AnimatedStyle, Timestamp, StyleLayoutAnimation) => Unit,
      styleAnimations: AnimatedStyle
    ): StyleLayoutAnimation = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart), styleAnimations = styleAnimations.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleLayoutAnimation]
    }
    
    extension [Self <: StyleLayoutAnimation](x: Self) {
      
      inline def setCallback(value: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCurrent(value: StyleProps): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setOnFrame(value: (StyleLayoutAnimation, Timestamp) => Boolean): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      inline def setOnStart(value: (StyleLayoutAnimation, AnimatedStyle, Timestamp, StyleLayoutAnimation) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction4(value))
      
      inline def setStyleAnimations(value: AnimatedStyle): Self = StObject.set(x, "styleAnimations", value.asInstanceOf[js.Any])
    }
  }
}
