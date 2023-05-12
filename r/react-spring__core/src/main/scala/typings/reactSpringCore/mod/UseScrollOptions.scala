package typings.reactSpringCore.mod

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @react-spring/core.@react-spring/core.Omit<@react-spring/core.@react-spring/core.SpringProps<any>, 'to' | 'from'> */
trait UseScrollOptions extends StObject {
  
  var default: js.UndefOr[Boolean | SpringProps[scala.Any]] = js.undefined
  
  var cancel: js.UndefOr[MatchProp[scala.Any]] = js.undefined
  
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ StringKeys[scala.Any], SpringConfig])] = js.undefined
  
  var container: js.UndefOr[MutableRefObject[HTMLElement]] = js.undefined
  
  var delay: js.UndefOr[Double | (js.Function1[/* key */ StringKeys[scala.Any], Double])] = js.undefined
  
  var immediate: js.UndefOr[MatchProp[scala.Any]] = js.undefined
  
  var loop: js.UndefOr[LoopProp[SpringUpdate[scala.Any]]] = js.undefined
  
  var onChange: js.UndefOr[EventProp[OnChange[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]] = js.undefined
  
  var onPause: js.UndefOr[EventProp[OnPause[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]] = js.undefined
  
  var onProps: js.UndefOr[EventProp[OnProps[scala.Any]]] = js.undefined
  
  var onRest: js.UndefOr[EventProp[OnRest[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]] = js.undefined
  
  var onResume: js.UndefOr[EventProp[OnResume[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]] = js.undefined
  
  var onStart: js.UndefOr[EventProp[OnStart[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]] = js.undefined
  
  var pause: js.UndefOr[MatchProp[scala.Any]] = js.undefined
  
  var reset: js.UndefOr[MatchProp[scala.Any]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object UseScrollOptions {
  
  inline def apply(): UseScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseScrollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseScrollOptions] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: MatchProp[scala.Any]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelFunction1(value: /* key */ StringKeys[scala.Any] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCancelVarargs(value: StringKeys[scala.Any]*): Self = StObject.set(x, "cancel", js.Array(value*))
    
    inline def setConfig(value: SpringConfig | (js.Function1[/* key */ StringKeys[scala.Any], SpringConfig])): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFunction1(value: /* key */ StringKeys[scala.Any] => SpringConfig): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setContainer(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDefault(value: Boolean | SpringProps[scala.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDelay(value: Double | (js.Function1[/* key */ StringKeys[scala.Any], Double])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction1(value: /* key */ StringKeys[scala.Any] => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setImmediate(value: MatchProp[scala.Any]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateFunction1(value: /* key */ StringKeys[scala.Any] => Boolean): Self = StObject.set(x, "immediate", js.Any.fromFunction1(value))
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setImmediateVarargs(value: StringKeys[scala.Any]*): Self = StObject.set(x, "immediate", js.Array(value*))
    
    inline def setLoop(value: LoopProp[SpringUpdate[scala.Any]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopFunction0(value: () => Boolean | SpringUpdate[scala.Any]): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnChange(value: EventProp[OnChange[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction3(
      value: (/* result */ AnimationResult[SpringValue[scala.Any]], SpringValue[scala.Any], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnPause(value: EventProp[OnPause[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseFunction3(
      value: (/* result */ AnimationResult[SpringValue[scala.Any]], SpringValue[scala.Any], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction3(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnProps(value: EventProp[OnProps[scala.Any]]): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
    
    inline def setOnPropsFunction2(value: (/* props */ SpringProps[scala.Any], /* spring */ SpringValue[scala.Any]) => Unit): Self = StObject.set(x, "onProps", js.Any.fromFunction2(value))
    
    inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
    
    inline def setOnRest(value: EventProp[OnRest[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnRestFunction3(
      value: (/* result */ AnimationResult[SpringValue[scala.Any]], SpringValue[scala.Any], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onRest", js.Any.fromFunction3(value))
    
    inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
    
    inline def setOnResume(value: EventProp[OnResume[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeFunction3(
      value: (/* result */ AnimationResult[SpringValue[scala.Any]], SpringValue[scala.Any], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onResume", js.Any.fromFunction3(value))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: EventProp[OnStart[SpringValue[scala.Any], SpringValue[scala.Any], Unit]]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartFunction3(
      value: (/* result */ AnimationResult[SpringValue[scala.Any]], SpringValue[scala.Any], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setPause(value: MatchProp[scala.Any]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseFunction1(value: /* key */ StringKeys[scala.Any] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPauseVarargs(value: StringKeys[scala.Any]*): Self = StObject.set(x, "pause", js.Array(value*))
    
    inline def setReset(value: MatchProp[scala.Any]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetFunction1(value: /* key */ StringKeys[scala.Any] => Boolean): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResetVarargs(value: StringKeys[scala.Any]*): Self = StObject.set(x, "reset", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
