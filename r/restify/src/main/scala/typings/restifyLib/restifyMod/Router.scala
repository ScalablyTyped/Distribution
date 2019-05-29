package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "Router")
@js.native
class Router protected () extends js.Object {
  def this(options: RouterOptions) = this()
  var log: js.UndefOr[bunyanLib.bunyanMod.^] = js.native
  var name: java.lang.String = js.native
  var onceNext: scala.Boolean = js.native
  var strictNext: scala.Boolean = js.native
  /**
    * Default route, when no route found
    */
  def defaultRoute(req: Request, res: Response, next: Next): scala.Unit = js.native
  /**
    * Return information about the routes registered in the router.
    * @returns The routes in the router.
    */
  def getDebugInfo(): js.Any = js.native
  /**
    * Return mounted routes.
    */
  def getRoutes(): js.Array[Route] = js.native
  /**
    * Lookup for route
    */
  def lookup(req: Request, res: Response): js.UndefOr[Chain] = js.native
  /**
    * Lookup by name
    */
  def lookupByName(name: java.lang.String, req: Request, res: Response): js.UndefOr[Chain] = js.native
  /**
    * adds a route.
    * @param    options an options object
    * @returns  returns the route name if creation is successful.
    */
  def mount(options: RouteOptions, handlers: RequestHandlerType*): java.lang.String = js.native
  /**
    * takes an object of route params and query params, and 'renders' a URL.
    * @param    routeName the route name
    * @param    params    an object of route params
    * @param    query     an object of query params
    */
  def render(routeName: java.lang.String, params: js.Object): java.lang.String = js.native
  def render(routeName: java.lang.String, params: js.Object, query: js.Object): java.lang.String = js.native
  /**
    * unmounts a route.
    * @param    name the route name
    * @returns       the name of the deleted route.
    */
  def unmount(name: java.lang.String): java.lang.String = js.native
}

