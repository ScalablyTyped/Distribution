package typings.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.roads.anon.CacheMaxAge
import typings.roads.buildMod.RoadsBuildOptions
import typings.roads.roadMod.ResponseMiddleware
import typings.roads.simpleRouterMod.default
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Middleware {
    
    @JSImport("roads", "Middleware")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("roads", "Middleware.SimpleRouter")
    @js.native
    /**
      * @param {Road} [road] - The road that will receive the SimpleRouter middleware
      */
    class SimpleRouter () extends default {
      def this(road: typings.roads.roadMod.default) = this()
    }
    @JSImport("roads", "Middleware.SimpleRouter")
    @js.native
    def SimpleRouter: Instantiable1[/* road */ js.UndefOr[typings.roads.roadMod.default], default] = js.native
    inline def SimpleRouter_=(x: Instantiable1[/* road */ js.UndefOr[typings.roads.roadMod.default], default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SimpleRouter")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.applyToContext")
    @js.native
    def applyToContext: js.Function2[/* key */ String, /* val */ js.Any, typings.roads.roadMod.Middleware] = js.native
    inline def applyToContext(key: String, `val`: js.Any): typings.roads.roadMod.Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToContext")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.roads.roadMod.Middleware]
    inline def applyToContext_=(x: js.Function2[/* key */ String, /* val */ js.Any, typings.roads.roadMod.Middleware]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyToContext")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.cookie")
    @js.native
    def cookie: typings.roads.roadMod.Middleware = js.native
    inline def cookie(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.roads.responseMod.default]]
    inline def cookie_=(x: typings.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.cors")
    @js.native
    def cors: js.Function1[/* options */ CacheMaxAge, typings.roads.roadMod.Middleware] = js.native
    inline def cors(options: CacheMaxAge): typings.roads.roadMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("cors")(options.asInstanceOf[js.Any]).asInstanceOf[typings.roads.roadMod.Middleware]
    inline def cors_=(x: js.Function1[/* options */ CacheMaxAge, typings.roads.roadMod.Middleware]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cors")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.killSlash")
    @js.native
    def killSlash: typings.roads.roadMod.Middleware = js.native
    inline def killSlash(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("killSlash")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.roads.responseMod.default]]
    inline def killSlash_=(x: typings.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("killSlash")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.parseBody")
    @js.native
    def parseBody: typings.roads.roadMod.Middleware = js.native
    inline def parseBody(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.roads.responseMod.default]]
    inline def parseBody_=(x: typings.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseBody")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.reroute")
    @js.native
    def reroute: js.Function2[
        /* key */ String, 
        /* road */ typings.roads.roadMod.default, 
        typings.roads.roadMod.Middleware
      ] = js.native
    inline def reroute(key: String, road: typings.roads.roadMod.default): typings.roads.roadMod.Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("reroute")(key.asInstanceOf[js.Any], road.asInstanceOf[js.Any])).asInstanceOf[typings.roads.roadMod.Middleware]
    inline def reroute_=(
      x: js.Function2[
          /* key */ String, 
          /* road */ typings.roads.roadMod.default, 
          typings.roads.roadMod.Middleware
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reroute")(x.asInstanceOf[js.Any])
    
    @JSImport("roads", "Middleware.setTitle")
    @js.native
    def setTitle: typings.roads.roadMod.Middleware = js.native
    inline def setTitle(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.roads.responseMod.default]]
    inline def setTitle_=(x: typings.roads.roadMod.Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("roads", "Request")
  @js.native
  class Request protected ()
    extends typings.roads.requestMod.default {
    /**
      * @todo: port should just be part of the host
      *
      * @param {boolean} secure - Whether or not this request should use HTTPS
      * @param {string} host - The hostname of all requests made by this function
      * @param {number} port - The post of all requests made by this function
      */
    def this(secure: Boolean, host: String, port: Double) = this()
  }
  
  @JSImport("roads", "Response")
  @js.native
  class Response protected ()
    extends typings.roads.responseMod.default {
    /**
      * Creates a new Response object.
      *
      * @param {string} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: String, status: Double) = this()
    def this(body: String, status: Double, headers: js.Object) = this()
    def this(body: String, status: Unit, headers: js.Object) = this()
  }
  
  @JSImport("roads", "Road")
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class Road ()
    extends typings.roads.roadMod.default
  
  @JSImport("roads", "RoadsPJAX")
  @js.native
  class RoadsPJAX protected ()
    extends typings.roads.pjaxMod.default {
    /**
      * Creates a new RoadsPjax instance. The road provided to this constructor will be the backbone of your PJAX requests.
      *
      * @param {Road} road - The road that will turn your pjax requests into HTML
      * @param {HTMLElement} container_element - The element that will be filled with your roads output
      * @param {Window} window - The pages window object to help set page title and other items
      */
    def this(road: typings.roads.roadMod.default, container_element: HTMLElement, window: Window) = this()
  }
  
  inline def build(input_file: String, output_file: String, options: RoadsBuildOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(input_file.asInstanceOf[js.Any], output_file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
