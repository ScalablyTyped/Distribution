package typings.shouldSendSameSiteNone

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("should-send-same-site-none", "isSameSiteNoneCompatible")
  @js.native
  def isSameSiteNoneCompatible(useragent: String): Boolean = js.native
  
  @JSImport("should-send-same-site-none", "shouldSendSameSiteNone")
  @js.native
  val shouldSendSameSiteNone: RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
}
