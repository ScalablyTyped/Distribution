package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.RequestContext
import typings.remixRunRouter.anon.RouteId
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteObject
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticHandler extends StObject {
  
  var dataRoutes: js.Array[AgnosticDataRouteObject] = js.native
  
  def query(request: Request): js.Promise[StaticHandlerContext | Response] = js.native
  def query(request: Request, opts: RequestContext): js.Promise[StaticHandlerContext | Response] = js.native
  
  def queryRoute(request: Request): js.Promise[Any] = js.native
  def queryRoute(request: Request, opts: RouteId): js.Promise[Any] = js.native
}
