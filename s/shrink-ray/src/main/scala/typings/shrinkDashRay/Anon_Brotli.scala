package typings.shrinkDashRay

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.shrinkDashRay.shrinkDashRayMod.FilterFunction
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Brotli extends js.Object {
  var brotli: Anon_01 = js.native
  var cacheSize: Double = js.native
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  var threshold: Double = js.native
  var zlib: Partial[Anon_0] = js.native
  def cache(req: Request[ParamsDictionary], res: Response): Boolean = js.native
  def filter(req: Request[ParamsDictionary], res: Response): Boolean = js.native
}

