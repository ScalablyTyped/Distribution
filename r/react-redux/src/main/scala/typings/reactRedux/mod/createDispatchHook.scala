package typings.reactRedux.mod

import typings.react.mod.Context
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux", "createDispatchHook")
@js.native
object createDispatchHook extends js.Object {
  
  def apply[S, A /* <: Action[_] */](): js.Function0[Dispatch[A]] = js.native
  def apply[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = js.native
}
