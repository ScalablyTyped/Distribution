package typings.reactSpringCore.mod

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @react-spring/core.@react-spring/core.Pick<@react-spring/core.@react-spring/core.SpringProps<T>, 'pause' | 'cancel' | 'immediate' | 'config'> */
/* Inlined parent @react-spring/core.@react-spring/core.PickEventFns<@react-spring/core.@react-spring/core.SpringProps<T>> */
trait DefaultSpringProps[T] extends StObject {
  
  var cancel: js.UndefOr[MatchProp[T]] = js.undefined
  
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])] = js.undefined
  
  var immediate: js.UndefOr[MatchProp[T]] = js.undefined
  
  var onChange: js.UndefOr[
    Extract[js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]], js.Function]
  ] = js.undefined
  
  var onPause: js.UndefOr[
    Extract[js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]], js.Function]
  ] = js.undefined
  
  var onProps: js.UndefOr[Extract[js.UndefOr[EventProp[OnProps[T]]], js.Function]] = js.undefined
  
  var onRest: js.UndefOr[
    Extract[js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]], js.Function]
  ] = js.undefined
  
  var onResume: js.UndefOr[
    Extract[js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]], js.Function]
  ] = js.undefined
  
  var onStart: js.UndefOr[
    Extract[js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]], js.Function]
  ] = js.undefined
  
  var pause: js.UndefOr[MatchProp[T]] = js.undefined
}
object DefaultSpringProps {
  
  inline def apply[T](): DefaultSpringProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSpringProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSpringProps[?], T] (val x: Self & DefaultSpringProps[T]) extends AnyVal {
    
    inline def setCancel(value: MatchProp[T]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCancelVarargs(value: StringKeys[T]*): Self = StObject.set(x, "cancel", js.Array(value*))
    
    inline def setConfig(value: SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFunction1(value: /* key */ StringKeys[T] => SpringConfig): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setImmediate(value: MatchProp[T]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "immediate", js.Any.fromFunction1(value))
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setImmediateVarargs(value: StringKeys[T]*): Self = StObject.set(x, "immediate", js.Array(value*))
    
    inline def setOnChange(value: Extract[js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnPause(value: Extract[js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction3(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnProps(value: Extract[js.UndefOr[EventProp[OnProps[T]]], js.Function]): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
    
    inline def setOnPropsFunction2(value: (/* props */ SpringProps[T], /* spring */ SpringValue[T]) => Unit): Self = StObject.set(x, "onProps", js.Any.fromFunction2(value))
    
    inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
    
    inline def setOnRest(value: Extract[js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnRestFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onRest", js.Any.fromFunction3(value))
    
    inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
    
    inline def setOnResume(value: Extract[js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onResume", js.Any.fromFunction3(value))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: Extract[js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setPause(value: MatchProp[T]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPauseVarargs(value: StringKeys[T]*): Self = StObject.set(x, "pause", js.Array(value*))
  }
}
