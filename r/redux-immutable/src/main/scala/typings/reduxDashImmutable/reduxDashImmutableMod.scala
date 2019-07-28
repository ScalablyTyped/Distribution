package typings.reduxDashImmutable

import typings.immutable.immutableMod.CollectionNs.Indexed
import typings.immutable.immutableMod.CollectionNs.Keyed
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-immutable", JSImport.Namespace)
@js.native
object reduxDashImmutableMod extends js.Object {
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Keyed[T, S]]): Reducer[S, A] = js.native
}

