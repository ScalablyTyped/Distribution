package typings
package reduxDashObservableLib.reduxDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicMiddleware[T /* <: reduxLib.reduxMod.Action[_] */, O /* <: T */, S, D]
  extends reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] {
  def run(rootEpic: Epic[T, O, S, D]): scala.Unit = js.native
}

