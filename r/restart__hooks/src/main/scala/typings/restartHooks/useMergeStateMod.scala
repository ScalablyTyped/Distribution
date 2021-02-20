package typings.restartHooks

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergeStateMod {
  
  @JSImport("@restart/hooks/cjs/useMergeState", JSImport.Default)
  @js.native
  def default[TState /* <: js.Object */](initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  @JSImport("@restart/hooks/cjs/useMergeState", JSImport.Default)
  @js.native
  def default[TState /* <: js.Object */](initialState: js.Function0[TState]): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  
  type MergeStateSetter[TState] = js.Function1[/* update */ Updater[TState] | Partial[TState] | Null, Unit]
  
  type Updater[TState] = js.Function1[/* state */ TState, Partial[TState] | Null]
}
