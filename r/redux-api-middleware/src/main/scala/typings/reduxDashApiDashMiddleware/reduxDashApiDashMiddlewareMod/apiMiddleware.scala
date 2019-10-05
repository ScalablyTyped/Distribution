package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.MiddlewareAPI
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "apiMiddleware")
@js.native
object apiMiddleware extends js.Object {
  def apply(api: MiddlewareAPI[Dispatch[AnyAction], _]): ReturnType[Middleware[js.Object, _, Dispatch[AnyAction]]] = js.native
}

