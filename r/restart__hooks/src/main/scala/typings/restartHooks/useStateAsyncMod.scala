package typings.restartHooks

import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStateAsyncMod {
  
  @JSImport("@restart/hooks/cjs/useStateAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[TState](initialState: TState): js.Tuple2[TState, AsyncSetState[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, AsyncSetState[TState]]]
  @scala.inline
  def default[TState](initialState: js.Function0[TState]): js.Tuple2[TState, AsyncSetState[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, AsyncSetState[TState]]]
  
  type AsyncSetState[TState] = js.Function1[/* stateUpdate */ SetStateAction[TState], js.Promise[TState]]
}
