package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareStrings.`@@redux-api-middleware/RSAA`
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RSAA: `@@redux-api-middleware/RSAA` = js.native
  val apiMiddleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  def createMiddleware(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createMiddleware(options: CreateMiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def getJSON(res: Response): js.Promise[_ | Unit] = js.native
  def isRSAA(action: js.Object): Boolean = js.native
  def isValidRSAA(action: js.Object): Boolean = js.native
  def validateRSAA(action: js.Object): js.Array[String] = js.native
}

