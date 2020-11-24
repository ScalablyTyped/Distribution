package typings.steamLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steam-login", "enforceLogin")
@js.native
object enforceLogin extends js.Object {
  
  def apply(redirect: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
