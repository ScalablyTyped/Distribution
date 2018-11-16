package typings
package router5Lib.coreMiddlewareMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Router extends js.Object {
  def clearMiddleware(): Router
  def useMiddleware(middlewares: router5Lib.coreMiddlewareMod.MiddlewareFactory*): Router
}

