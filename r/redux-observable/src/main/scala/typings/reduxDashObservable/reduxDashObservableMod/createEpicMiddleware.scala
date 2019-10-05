package typings.reduxDashObservable.reduxDashObservableMod

import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "createEpicMiddleware")
@js.native
object createEpicMiddleware extends js.Object {
  def apply[T /* <: Action[_] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = js.native
  def apply[T /* <: Action[_] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = js.native
}

