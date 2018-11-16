package typings
package shrinkDashRayLib.shrinkDashRayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddleware extends js.Object {
  @JSName("filter")
  var filter_Original: shrinkDashRayLib.FilterFunction = js.native
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(options: shrinkDashRayLib.Options): expressLib.expressMod.eNs.RequestHandler = js.native
  def filter(req: stdLib.Request, res: stdLib.Response): scala.Boolean = js.native
}

