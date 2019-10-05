package typings.reduxDashDoghouse.reduxDashDoghouseMod

import typings.redux.reduxMod.Dispatch
import typings.reduxDashDoghouse.Fn_ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindScopedActionFactories")
@js.native
object bindScopedActionFactories extends js.Object {
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: Fn_ActionCreator): M = js.native
}

