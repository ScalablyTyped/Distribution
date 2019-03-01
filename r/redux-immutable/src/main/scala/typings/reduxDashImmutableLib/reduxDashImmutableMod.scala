package typings
package reduxDashImmutableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-immutable", JSImport.Namespace)
@js.native
object reduxDashImmutableMod extends js.Object {
  def combineReducers[S](reducers: reduxLib.reduxMod.ReducersMapObject[S, _]): reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction] = js.native
  def combineReducers[S](
    reducers: reduxLib.reduxMod.ReducersMapObject[S, _],
    getDefaultState: js.Function0[immutableLib.immutableMod.CollectionNs.Indexed[S]]
  ): reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SAAction[S, A /* <: reduxLib.reduxMod.Action[_] */](reducers: reduxLib.reduxMod.ReducersMapObject[S, A]): reduxLib.reduxMod.Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SAAction[S, A /* <: reduxLib.reduxMod.Action[_] */](
    reducers: reduxLib.reduxMod.ReducersMapObject[S, A],
    getDefaultState: js.Function0[immutableLib.immutableMod.CollectionNs.Indexed[S]]
  ): reduxLib.reduxMod.Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SAActionT[S, A /* <: reduxLib.reduxMod.Action[_] */, T](reducers: reduxLib.reduxMod.ReducersMapObject[S, A]): reduxLib.reduxMod.Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SAActionT[S, A /* <: reduxLib.reduxMod.Action[_] */, T](
    reducers: reduxLib.reduxMod.ReducersMapObject[S, A],
    getDefaultState: js.Function0[immutableLib.immutableMod.CollectionNs.Keyed[T, S]]
  ): reduxLib.reduxMod.Reducer[S, A] = js.native
}

