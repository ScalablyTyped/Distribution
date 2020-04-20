package typings.shouldSendSameSiteNone

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("should-send-same-site-none", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val shouldSendSameSiteNone: RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  def isSameSiteNoneCompatible(useragent: String): Boolean = js.native
}

