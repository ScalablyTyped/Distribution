package typings.restartHooks

import typings.restartHooks.cjsUseMergeStateMod.MergeStateSetter
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseMergeStateFromPropsMod {
  
  @JSImport("@restart/hooks/cjs/useMergeStateFromProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps, TState](props: TProps, gDSFP: Mapper[TProps, TState], initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], gDSFP.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  
  type Mapper[TProps, TState] = js.Function2[/* props */ TProps, /* state */ TState, Null | Partial[TState]]
}
