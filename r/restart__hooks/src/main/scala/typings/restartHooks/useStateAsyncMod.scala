package typings.restartHooks

import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useStateAsync", JSImport.Namespace)
@js.native
object useStateAsyncMod extends js.Object {
  
  def default[TState](initialState: TState): js.Tuple2[TState, AsyncSetState[TState]] = js.native
  def default[TState](initialState: js.Function0[TState]): js.Tuple2[TState, AsyncSetState[TState]] = js.native
  
  type AsyncSetState[TState] = js.Function1[/* stateUpdate */ SetStateAction[TState], js.Promise[TState]]
}
