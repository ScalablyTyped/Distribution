package typings.restartHooks

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useMergeState", JSImport.Namespace)
@js.native
object useMergeStateMod extends js.Object {
  
  def default[TState /* <: js.Object */](initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  def default[TState /* <: js.Object */](initialState: js.Function0[TState]): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  
  type MergeStateSetter[TState] = js.Function1[/* update */ Updater[TState] | Partial[TState] | Null, Unit]
  
  type Updater[TState] = js.Function1[/* state */ TState, Partial[TState] | Null]
}
