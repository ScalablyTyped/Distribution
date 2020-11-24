package typings.restartHooks

import typings.restartHooks.useMergeStateMod.MergeStateSetter
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useMergeStateFromProps", JSImport.Namespace)
@js.native
object useMergeStateFromPropsMod extends js.Object {
  
  def default[TProps, TState](props: TProps, gDSFP: Mapper[TProps, TState], initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  
  type Mapper[TProps, TState] = js.Function2[/* props */ TProps, /* state */ TState, Null | Partial[TState]]
}
