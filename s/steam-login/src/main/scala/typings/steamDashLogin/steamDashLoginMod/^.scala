package typings.steamDashLogin.steamDashLoginMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(): RequestHandler = js.native
  def enforceLogin(redirect: String): RequestHandler = js.native
  def middleware(opts: MiddlewareOptions): RequestHandler = js.native
  def verify(): RequestHandler = js.native
}

