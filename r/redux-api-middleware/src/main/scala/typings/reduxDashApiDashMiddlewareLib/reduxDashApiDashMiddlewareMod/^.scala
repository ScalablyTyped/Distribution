package typings
package reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val RSAA: reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareLibStrings.`@@redux-api-middleware/RSAA` = js.native
  val apiMiddleware: reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createMiddleware(): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createMiddleware(options: CreateMiddlewareOptions): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def getJSON(res: stdLib.Response): js.Promise[_ | scala.Unit] = js.native
  def isRSAA(action: js.Object): scala.Boolean = js.native
  def isValidRSAA(action: js.Object): scala.Boolean = js.native
  def validateRSAA(action: js.Object): js.Array[java.lang.String] = js.native
}

