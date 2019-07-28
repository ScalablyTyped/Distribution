package typings.requestDashIp.requestDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-ip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getClientIp(req: Request): String = js.native
  def mw(): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, _] = js.native
  def mw(options: Options): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, _] = js.native
}

