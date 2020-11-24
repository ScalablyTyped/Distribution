package typings.shouldSendSameSiteNone

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("should-send-same-site-none", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isSameSiteNoneCompatible(useragent: String): Boolean = js.native
  
  val shouldSendSameSiteNone: RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
}
