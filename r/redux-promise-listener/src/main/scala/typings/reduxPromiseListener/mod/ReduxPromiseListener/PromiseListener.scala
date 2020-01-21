package typings.reduxPromiseListener.mod.ReduxPromiseListener

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseListener extends js.Object {
  @JSName("middleware")
  var middleware_Original: Middleware[js.Object, AnyAction, Dispatch[AnyAction]] = js.native
  def createAsyncFunction(config: Config): AsyncFunction = js.native
  def middleware(api: MiddlewareAPI[Dispatch[AnyAction], AnyAction]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ _, _]] = js.native
}

