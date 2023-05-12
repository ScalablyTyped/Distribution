package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Most of the reserved animation props, except `to`, `from`, `loop`,
  * and the event props.
  */
trait AnimationProps[T] extends StObject {
  
  /**
    * Override the default props with this update.
    */
  var default: js.UndefOr[Boolean | SpringProps[T]] = js.undefined
  
  /**
    * Cancel all animations by using `true`, or some animations by using a key
    * or an array of keys.
    */
  var cancel: js.UndefOr[MatchProp[T]] = js.undefined
  
  /**
    * Configure the spring behavior for each key.
    */
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])] = js.undefined
  
  /**
    * Milliseconds to wait before applying the other props.
    */
  var delay: js.UndefOr[Double | (js.Function1[/* key */ StringKeys[T], Double])] = js.undefined
  
  /**
    * When true, props jump to their goal values instead of animating.
    */
  var immediate: js.UndefOr[MatchProp[T]] = js.undefined
  
  /**
    * Pause all animations by using `true`, or some animations by using a key
    * or an array of keys.
    */
  var pause: js.UndefOr[MatchProp[T]] = js.undefined
  
  /**
    * Start the next animations at their values in the `from` prop.
    */
  var reset: js.UndefOr[MatchProp[T]] = js.undefined
  
  /**
    * Swap the `to` and `from` props.
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object AnimationProps {
  
  inline def apply[T](): AnimationProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationProps[?], T] (val x: Self & AnimationProps[T]) extends AnyVal {
    
    inline def setCancel(value: MatchProp[T]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCancelVarargs(value: StringKeys[T]*): Self = StObject.set(x, "cancel", js.Array(value*))
    
    inline def setConfig(value: SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFunction1(value: /* key */ StringKeys[T] => SpringConfig): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDefault(value: Boolean | SpringProps[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDelay(value: Double | (js.Function1[/* key */ StringKeys[T], Double])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction1(value: /* key */ StringKeys[T] => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setImmediate(value: MatchProp[T]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "immediate", js.Any.fromFunction1(value))
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setImmediateVarargs(value: StringKeys[T]*): Self = StObject.set(x, "immediate", js.Array(value*))
    
    inline def setPause(value: MatchProp[T]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPauseVarargs(value: StringKeys[T]*): Self = StObject.set(x, "pause", js.Array(value*))
    
    inline def setReset(value: MatchProp[T]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResetVarargs(value: StringKeys[T]*): Self = StObject.set(x, "reset", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
