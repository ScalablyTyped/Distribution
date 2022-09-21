package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "Router")
@js.native
open class Router protected () extends StObject {
  def this(options: RouterOptions) = this()
  
  /**
    * Default route, when no route found
    */
  def defaultRoute(req: Request, res: Response, next: Next): Unit = js.native
  
  /**
    * Return information about the routes registered in the router.
    * @returns The routes in the router.
    */
  def getDebugInfo(): Any = js.native
  
  /**
    * Return mounted routes.
    */
  def getRoutes(): js.Array[Route] = js.native
  
  var log: js.UndefOr[typings.bunyan.mod.^] = js.native
  
  /**
    * Lookup for route
    */
  def lookup(req: Request, res: Response): js.UndefOr[Chain] = js.native
  
  /**
    * Lookup by name
    */
  def lookupByName(name: String, req: Request, res: Response): js.UndefOr[Chain] = js.native
  
  /**
    * adds a route.
    * @param    options an options object
    * @returns  returns the route name if creation is successful.
    */
  def mount(options: MountOptions, handlers: RequestHandlerType*): String = js.native
  
  var name: String = js.native
  
  var onceNext: Boolean = js.native
  
  /**
    * takes an object of route params and query params, and 'renders' a URL.
    * @param    routeName the route name
    * @param    params    an object of route params
    * @param    query     an object of query params
    */
  def render(routeName: String, params: js.Object): String = js.native
  def render(routeName: String, params: js.Object, query: js.Object): String = js.native
  
  var strictNext: Boolean = js.native
  
  /**
    * unmounts a route.
    * @param    name the route name
    * @returns       the name of the deleted route.
    */
  def unmount(name: String): String = js.native
}
