package typings
package steamDashLoginLib.steamDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(): expressLib.expressMod.RequestHandler = js.native
  def enforceLogin(redirect: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def middleware(opts: MiddlewareOptions): expressLib.expressMod.RequestHandler = js.native
  def verify(): expressLib.expressMod.RequestHandler = js.native
}

