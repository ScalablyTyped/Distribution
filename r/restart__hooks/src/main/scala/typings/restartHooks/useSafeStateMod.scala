package typings.restartHooks

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.restartHooks.useStateAsyncMod.AsyncSetState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSafeStateMod {
  
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
  @JSImport("@restart/hooks/cjs/useSafeState", JSImport.Default)
  @js.native
  def default[TState](state: js.Tuple2[TState, AsyncSetState[TState] | StateSetter[TState]]): js.Tuple2[TState, StateSetter[TState]] = js.native
  
  type StateSetter[TState] = Dispatch[SetStateAction[TState]]
}
