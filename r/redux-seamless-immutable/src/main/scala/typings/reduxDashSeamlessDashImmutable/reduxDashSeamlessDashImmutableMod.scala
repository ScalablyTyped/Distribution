package typings.reduxDashSeamlessDashImmutable

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.seamlessDashImmutable.seamlessDashImmutableMod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-seamless-immutable", JSImport.Namespace)
@js.native
object reduxDashSeamlessDashImmutableMod extends js.Object {
  def combineReducers(reducers: SeamlessReducers): Reducer[_, AnyAction] = js.native
  def routerReducer[T /* <: Reducer[_, AnyAction] */](state: T, action: Action[_]): T = js.native
  def stateTransformer[T](state: Immutable[T, js.Object]): T = js.native
  type SeamlessReducers = StringDictionary[Reducer[js.Any, js.Any]]
}

