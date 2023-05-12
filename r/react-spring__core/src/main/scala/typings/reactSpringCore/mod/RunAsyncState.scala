package typings.reactSpringCore.mod

import typings.reactSpringRafz.mod.Timeout
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait RunAsyncState[T /* <: AnimationTarget[scala.Any] */] extends StObject {
  
  var asyncId: js.UndefOr[Double] = js.undefined
  
  var asyncTo: js.UndefOr[AsyncTo[InferState[T]]] = js.undefined
  
  var cancelId: js.UndefOr[Double] = js.undefined
  
  var delayed: js.UndefOr[Boolean] = js.undefined
  
  var pauseQueue: Set[js.Function0[Unit]]
  
  var paused: Boolean
  
  var promise: js.UndefOr[js.Promise[AnimationResult[T]]] = js.undefined
  
  var resumeQueue: Set[js.Function0[Unit]]
  
  var timeouts: Set[Timeout]
}
object RunAsyncState {
  
  inline def apply[T /* <: AnimationTarget[scala.Any] */](
    pauseQueue: Set[js.Function0[Unit]],
    paused: Boolean,
    resumeQueue: Set[js.Function0[Unit]],
    timeouts: Set[Timeout]
  ): RunAsyncState[T] = {
    val __obj = js.Dynamic.literal(pauseQueue = pauseQueue.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], resumeQueue = resumeQueue.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsyncState[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunAsyncState[?], T /* <: AnimationTarget[scala.Any] */] (val x: Self & RunAsyncState[T]) extends AnyVal {
    
    inline def setAsyncId(value: Double): Self = StObject.set(x, "asyncId", value.asInstanceOf[js.Any])
    
    inline def setAsyncIdUndefined: Self = StObject.set(x, "asyncId", js.undefined)
    
    inline def setAsyncTo(value: AsyncTo[InferState[T]]): Self = StObject.set(x, "asyncTo", value.asInstanceOf[js.Any])
    
    inline def setAsyncToFunction2(
      value: (/* start */ StartFn[InferState[T]], /* stop */ StopFn[InferState[T]]) => js.Promise[scala.Any] | Unit
    ): Self = StObject.set(x, "asyncTo", js.Any.fromFunction2(value))
    
    inline def setAsyncToUndefined: Self = StObject.set(x, "asyncTo", js.undefined)
    
    inline def setAsyncToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core.SpringTo<T> | @react-spring/core.@react-spring/core.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "asyncTo", js.Array(value*))
    
    inline def setCancelId(value: Double): Self = StObject.set(x, "cancelId", value.asInstanceOf[js.Any])
    
    inline def setCancelIdUndefined: Self = StObject.set(x, "cancelId", js.undefined)
    
    inline def setDelayed(value: Boolean): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    
    inline def setPauseQueue(value: Set[js.Function0[Unit]]): Self = StObject.set(x, "pauseQueue", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: js.Promise[AnimationResult[T]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setResumeQueue(value: Set[js.Function0[Unit]]): Self = StObject.set(x, "resumeQueue", value.asInstanceOf[js.Any])
    
    inline def setTimeouts(value: Set[Timeout]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
  }
}
