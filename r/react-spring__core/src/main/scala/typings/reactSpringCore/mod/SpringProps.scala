package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `SpringUpdate` type if you need the `to` prop to exist.
  * For function types, prefer one overload per possible `to` prop
  * type (for better type inference).
  *
  * The `T` parameter can be a set of animated values (as an object type)
  * or a primitive type for a single animated value.
  */
trait SpringProps[T]
  extends StObject
     with AnimationProps[T] {
  
  var from: js.UndefOr[GoalValue[T]] = js.undefined
  
  var loop: js.UndefOr[LoopProp[SpringUpdate[scala.Any]]] = js.undefined
  
  /**
    * Called when a spring has its value changed.
    */
  var onChange: js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
  
  var onPause: js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
  
  /**
    * Called after an animation is updated by new props,
    * even if the animation remains idle.
    */
  var onProps: js.UndefOr[EventProp[OnProps[T]]] = js.undefined
  
  /**
    * Called when all animations come to a stand-still.
    */
  var onRest: js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
  
  var onResume: js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
  
  /**
    * Called when an animation moves for the first time.
    */
  var onStart: js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
}
object SpringProps {
  
  inline def apply[T](): SpringProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpringProps[?], T] (val x: Self & SpringProps[T]) extends AnyVal {
    
    inline def setFrom(value: GoalValue[T]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLoop(value: LoopProp[SpringUpdate[scala.Any]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopFunction0(value: () => Boolean | SpringUpdate[scala.Any]): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnChange(value: EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnPause(value: EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction3(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnProps(value: EventProp[OnProps[T]]): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
    
    inline def setOnPropsFunction2(value: (/* props */ SpringProps[T], /* spring */ SpringValue[T]) => Unit): Self = StObject.set(x, "onProps", js.Any.fromFunction2(value))
    
    inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
    
    inline def setOnRest(value: EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnRestFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onRest", js.Any.fromFunction3(value))
    
    inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
    
    inline def setOnResume(value: EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onResume", js.Any.fromFunction3(value))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartFunction3(
      value: (/* result */ AnimationResult[SpringValue[T]], SpringValue[T], /* item */ js.UndefOr[Unit]) => Unit
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
