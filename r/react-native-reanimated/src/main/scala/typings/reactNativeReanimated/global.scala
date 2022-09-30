package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Back
import typings.reactNativeReanimated.anon.CLAMP
import typings.reactNativeReanimated.anon.Current
import typings.reactNativeReanimated.anon.PageX
import typings.reactNativeReanimated.anon.ValueAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def ID(t: Any): Any = js.Dynamic.global.applyDynamic("ID")(t.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def IMMEDIATE_CB_INVOCATION(cb: js.Function0[Any]): Any = js.Dynamic.global.applyDynamic("IMMEDIATE_CB_INVOCATION")(cb.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def NOOP(): Unit = js.Dynamic.global.applyDynamic("NOOP")().asInstanceOf[Unit]
  
  object ReanimatedV2 {
    
    @JSGlobal("ReanimatedV2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReanimatedV2.Easing")
    @js.native
    def Easing: Back = js.native
    inline def Easing_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easing")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ReanimatedV2.Extrapolation")
    @js.native
    def Extrapolation: CLAMP = js.native
    inline def Extrapolation_=(x: CLAMP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Extrapolation")(x.asInstanceOf[js.Any])
    
    inline def cancelAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")().asInstanceOf[Unit]
    
    inline def measure(): PageX = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")().asInstanceOf[PageX]
    
    inline def runOnJS(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def runOnUI(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def useAnimatedGestureHandler(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")().asInstanceOf[js.Function0[Unit]]
    
    inline def useAnimatedProps(cb: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(cb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def useAnimatedReaction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")().asInstanceOf[Unit]
    
    inline def useAnimatedRef(): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedRef")().asInstanceOf[Current]
    
    inline def useAnimatedScrollHandler(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")().asInstanceOf[js.Function0[Unit]]
    
    inline def useAnimatedStyle(cb: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(cb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def useDerivedValue(a: Any): ValueAny = ^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(a.asInstanceOf[js.Any]).asInstanceOf[ValueAny]
    
    inline def useSharedValue(v: Any): ValueAny = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(v.asInstanceOf[js.Any]).asInstanceOf[ValueAny]
    
    inline def withDecay(_underscore: Any, cb: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(_underscore.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def withDelay(_underscore: Any, animationValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(_underscore.asInstanceOf[js.Any], animationValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def withRepeat(animation: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def withSequence(_animations: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withSequence")(_animations.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def withSpring(toValue: Any, _underscore: Any, cb: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def withTiming(toValue: Any, _underscore: Any, cb: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
