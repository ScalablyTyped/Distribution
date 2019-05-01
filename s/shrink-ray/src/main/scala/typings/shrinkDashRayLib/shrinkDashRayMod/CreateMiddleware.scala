package typings
package shrinkDashRayLib.shrinkDashRayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddleware extends js.Object {
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(options: shrinkDashRayLib.Options): expressLib.expressMod.RequestHandler = js.native
  def filter(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Boolean = js.native
}

