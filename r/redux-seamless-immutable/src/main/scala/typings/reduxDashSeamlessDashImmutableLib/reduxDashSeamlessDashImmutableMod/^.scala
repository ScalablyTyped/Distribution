package typings
package reduxDashSeamlessDashImmutableLib.reduxDashSeamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-seamless-immutable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineReducers(reducers: SeamlessReducers): reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction] = js.native
  def routerReducer[T /* <: reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction] */](state: T, action: reduxLib.reduxMod.Action[_]): T = js.native
  def stateTransformer[T](state: seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object]): T = js.native
}

