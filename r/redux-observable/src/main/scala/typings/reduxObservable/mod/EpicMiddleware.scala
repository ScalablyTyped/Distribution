package typings.reduxObservable.mod

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  
  def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
}
