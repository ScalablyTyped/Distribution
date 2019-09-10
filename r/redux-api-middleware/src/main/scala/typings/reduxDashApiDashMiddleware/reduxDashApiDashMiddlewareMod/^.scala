package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.MiddlewareAPI
import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareStrings.`@@redux-api-middleware/RSAA`
import typings.std.Response
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RSAA: `@@redux-api-middleware/RSAA` = js.native
  def apiMiddleware(api: MiddlewareAPI[Dispatch[AnyAction], _]): ReturnType[Middleware[js.Object, _, Dispatch[AnyAction]]] = js.native
  def createMiddleware(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createMiddleware(options: CreateMiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def getJSON(res: Response): js.Promise[_ | Unit] = js.native
  def isRSAA(action: js.Object): Boolean = js.native
  def isValidRSAA(action: js.Object): Boolean = js.native
  def validateRSAA(action: js.Object): js.Array[String] = js.native
}

