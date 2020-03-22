package typings.reduxDoghouse.mod

import typings.redux.mod.Dispatch
import typings.reduxDoghouse.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindScopedActionFactories")
@js.native
object bindScopedActionFactories extends js.Object {
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = js.native
}

