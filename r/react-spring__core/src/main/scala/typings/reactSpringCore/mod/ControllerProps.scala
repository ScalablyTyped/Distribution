package typings.reactSpringCore.mod

import typings.reactSpringTypes.mod.Falsy
import typings.reactSpringTypes.mod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Props for `Controller` methods and constructor.
  */
trait ControllerProps[State /* <: Lookup[scala.Any] */, Item]
  extends StObject
     with AnimationProps[State] {
  
  var from: js.UndefOr[GoalValues[State] | Falsy] = js.undefined
  
  var loop: js.UndefOr[LoopProp[ControllerUpdate[Lookup[scala.Any], Unit]]] = js.undefined
  
  /**
    * Called once per frame when animations are active
    *
    * Also accepts an object for per-key events
    */
  var onChange: js.UndefOr[
    (OnChange[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnChange<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
  ] = js.undefined
  
  var onPause: js.UndefOr[
    (OnPause[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnPause<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
  ] = js.undefined
  
  /**
    * Called after an animation is updated by new props.
    * Useful for manipulation
    *
    * Also accepts an object for per-key events
    */
  var onProps: js.UndefOr[
    OnProps[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnProps<State[P]>} */ js.Any)
  ] = js.undefined
  
  /**
    * Called when the promise for this update is resolved.
    */
  var onResolve: js.UndefOr[OnResolve[SpringValue[State], Controller[State], Item]] = js.undefined
  
  /**
    * Called when the # of animating values hits 0
    *
    * Also accepts an object for per-key events
    */
  var onRest: js.UndefOr[
    (OnRest[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnRest<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
  ] = js.undefined
  
  var onResume: js.UndefOr[
    (OnResume[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnResume<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
  ] = js.undefined
  
  /**
    * Called when the # of animating values exceeds 0
    *
    * Also accepts an object for per-key events
    */
  var onStart: js.UndefOr[
    (OnStart[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnStart<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
  ] = js.undefined
  
  var ref: js.UndefOr[SpringRef[State]] = js.undefined
}
object ControllerProps {
  
  inline def apply[State /* <: Lookup[scala.Any] */, Item](): ControllerProps[State, Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerProps[State, Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControllerProps[?, ?], State /* <: Lookup[scala.Any] */, Item] (val x: Self & (ControllerProps[State, Item])) extends AnyVal {
    
    inline def setFrom(value: GoalValues[State] | Falsy): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLoop(value: LoopProp[ControllerUpdate[Lookup[scala.Any], Unit]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopFunction0(value: () => Boolean | (ControllerUpdate[Lookup[scala.Any], Unit])): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnChange(
      value: (OnChange[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnChange<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction3(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnPause(
      value: (OnPause[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnPause<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
    ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseFunction3(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction3(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnProps(
      value: OnProps[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnProps<State[P]>} */ js.Any)
    ): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
    
    inline def setOnPropsFunction2(value: (/* props */ SpringProps[State], /* spring */ SpringValue[State]) => Unit): Self = StObject.set(x, "onProps", js.Any.fromFunction2(value))
    
    inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
    
    inline def setOnResolve(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onResolve", js.Any.fromFunction3(value))
    
    inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    inline def setOnRest(
      value: (OnRest[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnRest<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
    ): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnRestFunction3(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onRest", js.Any.fromFunction3(value))
    
    inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
    
    inline def setOnResume(
      value: (OnResume[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnResume<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
    ): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeFunction3(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onResume", js.Any.fromFunction3(value))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(
      value: (OnStart[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core.OnStart<@react-spring/core.@react-spring/core.SpringValue<State[P]>, @react-spring/core.@react-spring/core.Controller<State>, Item>} */ js.Any)
    ): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartFunction3(
      value: (/* result */ AnimationResult[SpringValue[State]], Controller[State], /* item */ js.UndefOr[Item]) => Unit
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setRef(value: SpringRef[State]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
