package typings.statsdClient

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.statsdClient.mod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

