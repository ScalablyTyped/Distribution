package typings.reduxObservable.mod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-observable", "createEpicMiddleware")
@js.native
object createEpicMiddleware extends js.Object {
  
  def apply[T /* <: Action[_] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = js.native
  def apply[T /* <: Action[_] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = js.native
}
