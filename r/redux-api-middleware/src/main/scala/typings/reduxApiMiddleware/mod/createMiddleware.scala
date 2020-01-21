package typings.reduxApiMiddleware.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "createMiddleware")
@js.native
object createMiddleware extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: CreateMiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

