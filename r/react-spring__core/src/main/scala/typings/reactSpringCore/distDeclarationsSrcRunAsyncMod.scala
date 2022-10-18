package typings.reactSpringCore

import typings.reactSpringCore.anon.CallId
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.SpringToFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StartFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StopFn
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationTarget
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferProps
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.InferState
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringChain
import typings.reactSpringTypes.utilMod.Falsy
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcRunAsyncMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/runAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/runAsync", "BailSignal")
  @js.native
  open class BailSignal ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var result: AnimationResult[Any] = js.native
  }
  
  @JSImport("@react-spring/core/dist/declarations/src/runAsync", "SkipAniamtionSignal")
  @js.native
  open class SkipAniamtionSignal ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var result: AnimationResult[Any] = js.native
  }
  
  inline def runAsync[T /* <: AnimationTarget[Any] */](to: AsyncTo[InferState[T]], props: RunAsyncProps[T], state: RunAsyncState[T], target: T): js.Promise[AnimationResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAsync")(to.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnimationResult[T]]]
  
  inline def stopAsync(state: RunAsyncState[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAsync")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stopAsync(state: RunAsyncState[Any], cancelId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopAsync")(state.asInstanceOf[js.Any], cancelId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stopAsync(state: RunAsyncState[Any], cancelId: Falsy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopAsync")(state.asInstanceOf[js.Any], cancelId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AsyncTo[T] = SpringChain[T] | SpringToFn[T]
  
  type RunAsyncProps[T /* <: AnimationTarget[Any] */] = InferProps[T] & CallId
  
  trait RunAsyncState[T /* <: AnimationTarget[Any] */] extends StObject {
    
    var asyncId: js.UndefOr[Double] = js.undefined
    
    var asyncTo: js.UndefOr[AsyncTo[InferState[T]]] = js.undefined
    
    var cancelId: js.UndefOr[Double] = js.undefined
    
    var delayed: js.UndefOr[Boolean] = js.undefined
    
    var pauseQueue: Set[js.Function0[Unit]]
    
    var paused: Boolean
    
    var promise: js.UndefOr[js.Promise[AnimationResult[T]]] = js.undefined
    
    var resumeQueue: Set[js.Function0[Unit]]
    
    var timeouts: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timeout */ Any
      ]
  }
  object RunAsyncState {
    
    inline def apply[T /* <: AnimationTarget[Any] */](
      pauseQueue: Set[js.Function0[Unit]],
      paused: Boolean,
      resumeQueue: Set[js.Function0[Unit]],
      timeouts: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timeout */ Any
        ]
    ): RunAsyncState[T] = {
      val __obj = js.Dynamic.literal(pauseQueue = pauseQueue.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], resumeQueue = resumeQueue.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunAsyncState[T]]
    }
    
    extension [Self <: RunAsyncState[?], T /* <: AnimationTarget[Any] */](x: Self & RunAsyncState[T]) {
      
      inline def setAsyncId(value: Double): Self = StObject.set(x, "asyncId", value.asInstanceOf[js.Any])
      
      inline def setAsyncIdUndefined: Self = StObject.set(x, "asyncId", js.undefined)
      
      inline def setAsyncTo(value: AsyncTo[InferState[T]]): Self = StObject.set(x, "asyncTo", value.asInstanceOf[js.Any])
      
      inline def setAsyncToFunction2(
        value: (/* start */ StartFn[InferState[T]], /* stop */ StopFn[InferState[T]]) => js.Promise[Any] | Unit
      ): Self = StObject.set(x, "asyncTo", js.Any.fromFunction2(value))
      
      inline def setAsyncToUndefined: Self = StObject.set(x, "asyncTo", js.undefined)
      
      inline def setAsyncToVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringTo<T> | @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<T> */ js.Any)*
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
      
      inline def setTimeouts(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timeout */ Any
            ]
      ): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    }
  }
}
