package typings.statsdDashClient

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.statsdDashClient.statsdDashClientMod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary] = js.native
  def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
}

