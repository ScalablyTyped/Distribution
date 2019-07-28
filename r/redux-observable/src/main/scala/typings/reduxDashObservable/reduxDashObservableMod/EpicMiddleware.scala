package typings.reduxDashObservable.reduxDashObservableMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
}

