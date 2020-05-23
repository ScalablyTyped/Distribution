package typings.reduxDoghouse.mod

import typings.redux.mod.ActionCreator
import typings.redux.mod.Dispatch
import typings.reduxDoghouse.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindScopedActionFactories")
@js.native
object bindScopedActionFactories extends js.Object {
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = js.native
}

