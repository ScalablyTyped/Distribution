package typings.steamLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", "middleware")
@js.native
object middleware extends js.Object {
  def apply(opts: MiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
}

