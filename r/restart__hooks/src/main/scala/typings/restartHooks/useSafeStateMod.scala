package typings.restartHooks

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.restartHooks.useStateAsyncMod.AsyncSetState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSafeStateMod {
  
  @JSImport("@restart/hooks/cjs/useSafeState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `useSafeState` takes the return value of a `useState` hook and wraps the
    * setter to prevent updates onces the component has unmounted. Can used
    * with `useMergeState` and `useStateAsync` as well
    *
    * @param state The return value of a useStateHook
    *
    * ```ts
    * const [show, setShow] = useSafeState(useState(true));
    * ```
    */
  @scala.inline
  def default[TState](state: js.Tuple2[TState, AsyncSetState[TState] | StateSetter[TState]]): js.Tuple2[TState, StateSetter[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, StateSetter[TState]]]
  
  type StateSetter[TState] = Dispatch[SetStateAction[TState]]
}
