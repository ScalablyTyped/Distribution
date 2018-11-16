package typings
package restifyDashCorsDashMiddlewareLib.restifyDashCorsDashMiddlewareMod.corsMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsMiddleware extends js.Object {
  @JSName("actual")
  var actual_Original: restifyLib.restifyMod.RequestHandler = js.native
  @JSName("preflight")
  var preflight_Original: restifyLib.restifyMod.RequestHandler = js.native
  def actual(
    req: restifyLib.restifyMod.Request,
    res: restifyLib.restifyMod.Response,
    next: restifyLib.restifyMod.Next
  ): js.Any = js.native
  def preflight(
    req: restifyLib.restifyMod.Request,
    res: restifyLib.restifyMod.Response,
    next: restifyLib.restifyMod.Next
  ): js.Any = js.native
}

