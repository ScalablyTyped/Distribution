package typings.reactRedux.mod

import typings.react.mod.Context
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux", "createSelectorHook")
@js.native
object createSelectorHook extends js.Object {
  
  def apply[S, A /* <: Action[_] */](): js.Function2[
    /* selector */ js.Function1[/* state */ S, _], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    _
  ] = js.native
  def apply[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function2[
    /* selector */ js.Function1[/* state */ S, _], 
    /* equalityFn */ js.UndefOr[js.Function2[/* previous */ js.Any, /* next */ js.Any, Boolean]], 
    _
  ] = js.native
}
