package typings
package statsdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetExpressMiddleware extends js.Object {
  def getExpressMiddleware(): expressLib.expressMod.RequestHandler = js.native
  def getExpressMiddleware(prefix: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def getExpressMiddleware(
    prefix: java.lang.String,
    options: statsdDashClientLib.statsdDashClientMod.ExpressMiddlewareOptions
  ): expressLib.expressMod.RequestHandler = js.native
}

