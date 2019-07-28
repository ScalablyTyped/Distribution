package typings.statsdDashClient

import typings.express.expressMod.RequestHandler
import typings.statsdDashClient.statsdDashClientMod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): RequestHandler = js.native
  def getExpressMiddleware(prefix: String): RequestHandler = js.native
  def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler = js.native
}

