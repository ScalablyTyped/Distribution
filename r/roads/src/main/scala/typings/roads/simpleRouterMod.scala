package typings.roads

import org.scalablytyped.runtime.StringDictionary
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.roads.roadMod.Context
import typings.roads.roadMod.ResponseMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleRouterMod {
  
  @JSImport("roads/types/middleware/simpleRouter", JSImport.Default)
  @js.native
  /**
    * @param {Road} [road] - The road that will receive the SimpleRouter middleware
    */
  class default ()
    extends StObject
       with SimpleRouter {
    def this(road: typings.roads.roadMod.default) = this()
  }
  
  type Route = js.ThisFunction4[
    /* this */ Context, 
    /* path */ SimpleRouterURL, 
    /* body */ String, 
    /* headers */ StringDictionary[js.Any], 
    /* next */ ResponseMiddleware, 
    js.Promise[typings.roads.responseMod.default]
  ]
  
  trait RouteDetails extends StObject {
    
    var method: String
    
    var path: String
    
    def route(path: SimpleRouterURL, body: String, headers: StringDictionary[js.Any], next: ResponseMiddleware): js.Promise[typings.roads.responseMod.default]
    @JSName("route")
    var route_Original: Route
  }
  object RouteDetails {
    
    inline def apply(method: String, path: String, route: Route): RouteDetails = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDetails]
    }
    
    extension [Self <: RouteDetails](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimpleRouter extends StObject {
    
    /**
      * Slightly non-standar roads middleware to execute the functions in this router when requests are received by the road
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
      request_headers: js.Object,
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = js.native
    
    /* protected */ var _routes: js.Array[RouteDetails] = js.native
    
    /**
      * Adds a route to this router. The route is a function that will match the standard roads request signature.
      * It will be associated with one HTTP method, and one or many HTTP paths
      *
      * @param {string} method - The HTTP method that will trigger the provided function
      * @param {(string|array)} paths - One or many URL paths that will trigger the provided function
      * @param {function} fn - The function containing all of your route logic
      */
    def addRoute(method: String, paths: String, fn: Route): Unit = js.native
    def addRoute(method: String, paths: js.Array[String], fn: Route): Unit = js.native
    
    /**
      * Add an entire file worth of routes.
      *
      * The file should be a node module that exposes an object.
      * Each key should be an HTTP path, each value should be an object.
      * In that object, each key should be an HTTP method, and the value should be your route function.
      *
      * @param {string} file_path - The file path
      * @param {string} [prefix] - A string that will help namespace this file. e.g. if you call this on a file with a route of "/posts", and the prefix "/users", the route will be assigned to "/users/posts"
      */
    def addRouteFile(file_path: String): js.Promise[Unit] = js.native
    def addRouteFile(file_path: String, prefix: String): js.Promise[Unit] = js.native
    
    /**
      * Assigns the middleware to the provided road
      *
      * @param  {Road} road - The road that will receive the SimpleRouter middleware
      */
    def applyMiddleware(road: typings.roads.roadMod.default): Unit = js.native
  }
  
  trait SimpleRouterURL
    extends StObject
       with UrlWithParsedQuery {
    
    var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object SimpleRouterURL {
    
    inline def apply(href: String, query: ParsedUrlQuery): SimpleRouterURL = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, search = null, slashes = null)
      __obj.asInstanceOf[SimpleRouterURL]
    }
    
    extension [Self <: SimpleRouterURL](x: Self) {
      
      inline def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
}
