package typings.restartHooks

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseMergeStateMod {
  
  @JSImport("@restart/hooks/cjs/useMergeState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TState /* <: js.Object */](initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  inline def default[TState /* <: js.Object */](initialState: js.Function0[TState]): js.Tuple2[TState, MergeStateSetter[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  
  type MergeStateSetter[TState] = js.Function1[/* update */ Updater[TState] | Partial[TState] | Null, Unit]
  
  type Updater[TState] = js.Function1[/* state */ TState, Partial[TState] | Null]
}
