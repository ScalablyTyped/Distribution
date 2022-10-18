package typings.roads

import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.roads.typesCoreRoadMod.Context
import typings.roads.typesCoreRoadMod.IncomingHeaders
import typings.roads.typesCoreRoadMod.NextCallback
import typings.roads.typesCoreRoadMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareSimpleRouterMod {
  
  @JSImport("roads/types/middleware/simpleRouter", "SimpleRouter")
  @js.native
  /**
    * @param {Road} [road] - The road that will receive the SimpleRouter middleware
    */
  open class SimpleRouter () extends StObject {
    def this(road: default) = this()
    
    /**
      * Slightly non-standard roads middleware to execute the functions in this router when requests are received by the road
      * The first method is the routes to ensure that we can properly use this router once we loose the "this" value
      * from the roads context
      *
      * @todo there might be a better way to do this
      */
    /* protected */ def _middleware(
      routes: js.Array[RouteDetails],
      request_method: String,
      request_url: String,
      request_body: String,
      request_headers: IncomingHeaders,
      next: NextCallback
    ): js.Promise[typings.roads.typesCoreResponseMod.default | String] = js.native
    
    /* protected */ var _routes: js.Array[RouteDetails] = js.native
    
    /**
      * Adds a route to this router. The route is a function that will match the standard roads request signature.
      * It will be associated with one HTTP method, and one or many HTTP paths
      *
      * @param {string} method - The HTTP method that will trigger the provided function
      * @param {(string|array)} paths - One or many URL paths that will trigger the provided function
      * @param {function} fn - The function containing all of your route logic
      */
    def addRoute[ContextType /* <: Context */](method: String, paths: String, fn: Route[ContextType]): Unit = js.native
    def addRoute[ContextType /* <: Context */](method: String, paths: js.Array[String], fn: Route[ContextType]): Unit = js.native
    
    /**
      * Add an entire file worth of routes.
      *
      * The file should be a node module that exposes an object.
      * Each key should be an HTTP path, each value should be an object.
      * In that object, each key should be an HTTP method, and the value should be your route function.
      *
      * @param {string} filePath - The file path
      * @param {string} [prefix] - A string that will help namespace this file. e.g. if you call this on a file
      * 		with a route of "/posts", and the prefix "/users", the route will be assigned to "/users/posts"
      */
    def addRouteFile(filePath: String): js.Promise[Unit] = js.native
    def addRouteFile(filePath: String, prefix: String): js.Promise[Unit] = js.native
    
    /**
      * Assigns the middleware to the provided road
      *
      * @param  {Road} road - The road that will receive the SimpleRouter middleware
      */
    def applyMiddleware(road: default): Unit = js.native
  }
  
  type Route[ContextType /* <: Context */] = js.ThisFunction4[
    /* this */ ContextType, 
    /* path */ SimpleRouterURL, 
    /* body */ String, 
    /* headers */ IncomingHeaders, 
    /* next */ NextCallback, 
    js.Promise[typings.roads.typesCoreResponseMod.default]
  ]
  
  trait RouteDetails extends StObject {
    
    var method: String
    
    var path: String
    
    def route(path: SimpleRouterURL, body: String, headers: IncomingHeaders, next: NextCallback): js.Promise[typings.roads.typesCoreResponseMod.default]
    @JSName("route")
    var route_Original: Route[Context]
  }
  object RouteDetails {
    
    inline def apply(method: String, path: String, route: Route[Context]): RouteDetails = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDetails]
    }
    
    extension [Self <: RouteDetails](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route[Context]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleRouterURL
    extends StObject
       with UrlWithParsedQuery {
    
    var args: js.UndefOr[Record[String, String | Double]] = js.undefined
  }
  object SimpleRouterURL {
    
    inline def apply(href: String, query: ParsedUrlQuery): SimpleRouterURL = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, search = null, slashes = null)
      __obj.asInstanceOf[SimpleRouterURL]
    }
    
    extension [Self <: SimpleRouterURL](x: Self) {
      
      inline def setArgs(value: Record[String, String | Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
}
