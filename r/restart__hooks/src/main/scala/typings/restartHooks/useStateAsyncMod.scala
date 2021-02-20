package typings.restartHooks

import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStateAsyncMod {
  
  @JSImport("@restart/hooks/cjs/useStateAsync", JSImport.Default)
  @js.native
  def default[TState](initialState: TState): js.Tuple2[TState, AsyncSetState[TState]] = js.native
  @JSImport("@restart/hooks/cjs/useStateAsync", JSImport.Default)
  @js.native
  def default[TState](initialState: js.Function0[TState]): js.Tuple2[TState, AsyncSetState[TState]] = js.native
  
  type AsyncSetState[TState] = js.Function1[/* stateUpdate */ SetStateAction[TState], js.Promise[TState]]
}
