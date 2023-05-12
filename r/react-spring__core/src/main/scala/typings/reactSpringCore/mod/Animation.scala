package typings.reactSpringCore.mod

import typings.reactSpringAnimated.mod.AnimatedValue
import typings.reactSpringShared.mod.FluidValue
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An animation being executed by the frameloop */
/* Inlined parent @react-spring/core.@react-spring/core.PickEventFns<@react-spring/core.@react-spring/core.SpringProps<T>> */
trait Animation[T] extends StObject {
  
  var changed: Boolean
  
  var config: AnimationConfig
  
  var from: T | (FluidValue[T, scala.Any])
  
  var fromValues: js.Array[Double]
  
  var immediate: Boolean
  
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
  
  var to: T | (FluidValue[T, scala.Any])
  
  var toValues: js.Array[Double] | Null
  
  var values: js.Array[AnimatedValue[scala.Any]]
}
object Animation {
  
  inline def apply[T](
    changed: Boolean,
    config: AnimationConfig,
    from: T | (FluidValue[T, scala.Any]),
    fromValues: js.Array[Double],
    immediate: Boolean,
    to: T | (FluidValue[T, scala.Any]),
    values: js.Array[AnimatedValue[scala.Any]]
  ): Animation[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fromValues = fromValues.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], toValues = null)
    __obj.asInstanceOf[Animation[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation[?], T] (val x: Self & Animation[T]) extends AnyVal {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: AnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: T | (FluidValue[T, scala.Any])): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromValues(value: js.Array[Double]): Self = StObject.set(x, "fromValues", value.asInstanceOf[js.Any])
    
    inline def setFromValuesVarargs(value: Double*): Self = StObject.set(x, "fromValues", js.Array(value*))
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
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
    
    inline def setTo(value: T | (FluidValue[T, scala.Any])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToValues(value: js.Array[Double]): Self = StObject.set(x, "toValues", value.asInstanceOf[js.Any])
    
    inline def setToValuesNull: Self = StObject.set(x, "toValues", null)
    
    inline def setToValuesVarargs(value: Double*): Self = StObject.set(x, "toValues", js.Array(value*))
    
    inline def setValues(value: js.Array[AnimatedValue[scala.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: AnimatedValue[scala.Any]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
