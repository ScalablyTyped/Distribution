package typings.shrinkDashRay.shrinkDashRayMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.shrinkDashRay.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddleware extends js.Object {
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary] = js.native
  def filter(req: Request[ParamsDictionary], res: Response): Boolean = js.native
}

