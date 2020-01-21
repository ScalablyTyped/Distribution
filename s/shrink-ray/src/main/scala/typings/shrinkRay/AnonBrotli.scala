package typings.shrinkRay

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.shrinkRay.mod.FilterFunction
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrotli extends js.Object {
  var brotli: Anon01 = js.native
  var cacheSize: Double = js.native
  @JSName("filter")
  var filter_Original: FilterFunction = js.native
  var threshold: Double = js.native
  var zlib: Partial[Anon0] = js.native
  def cache(req: Request_[ParamsDictionary], res: Response_): Boolean = js.native
  def filter(req: Request_[ParamsDictionary], res: Response_): Boolean = js.native
}

