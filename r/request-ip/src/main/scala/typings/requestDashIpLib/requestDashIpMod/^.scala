package typings
package requestDashIpLib.requestDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-ip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getClientIp(req: requestDashIpLib.requestDashIpMod.Request): java.lang.String = js.native
  def mw(): js.Function3[
    /* req */ requestDashIpLib.requestDashIpMod.Request, 
    /* res */ js.Any, 
    /* next */ js.Any, 
    _
  ] = js.native
  def mw(options: requestDashIpLib.requestDashIpMod.Options): js.Function3[
    /* req */ requestDashIpLib.requestDashIpMod.Request, 
    /* res */ js.Any, 
    /* next */ js.Any, 
    _
  ] = js.native
}

