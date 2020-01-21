package typings.steamLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", "enforceLogin")
@js.native
object enforceLogin extends js.Object {
  def apply(redirect: String): RequestHandler[ParamsDictionary] = js.native
}

