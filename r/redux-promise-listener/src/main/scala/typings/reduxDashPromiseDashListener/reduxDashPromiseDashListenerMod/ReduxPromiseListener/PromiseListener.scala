package typings.reduxDashPromiseDashListener.reduxDashPromiseDashListenerMod.ReduxPromiseListener

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.MiddlewareAPI
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

