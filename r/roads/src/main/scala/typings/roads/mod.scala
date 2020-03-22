package typings.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.roads.buildMod.RoadsBuildOptions
import typings.roads.requestMod.default
import typings.roads.roadMod.ResponseMiddleware
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Request protected () extends default {
    /**
      * @todo: port should just be part of the host
      *
      * @param {boolean} secure - Whether or not this request should use HTTPS
      * @param {string} host - The hostname of all requests made by this function
      * @param {number} port - The post of all requests made by this function
      */
    def this(secure: Boolean, host: String, port: Double) = this()
  }
  
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
  }
  
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class Road ()
    extends typings.roads.roadMod.default
  
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
    def this(road: typings.roads.roadMod.default, container_element: HTMLElement, window: Window_) = this()
  }
  
  def build(input_file: String, output_file: String, options: RoadsBuildOptions): Unit = js.native
  @js.native
  object Middleware extends js.Object {
    @js.native
    /**
      * @param {Road} [road] - The road that will receive the SimpleRouter middleware
      */
    class SimpleRouter ()
      extends typings.roads.simpleRouterMod.default {
      def this(road: typings.roads.roadMod.default) = this()
    }
    
    @JSName("applyToContext")
    var applyToContext_Original: js.Function2[/* key */ String, /* val */ js.Any, typings.roads.roadMod.Middleware] = js.native
    @JSName("cookie")
    var cookie_Original: typings.roads.roadMod.Middleware = js.native
    @JSName("cors")
    var cors_Original: js.Function1[/* options */ AnonCacheMaxAge, typings.roads.roadMod.Middleware] = js.native
    @JSName("killSlash")
    var killSlash_Original: typings.roads.roadMod.Middleware = js.native
    @JSName("parseBody")
    var parseBody_Original: typings.roads.roadMod.Middleware = js.native
    @JSName("reroute")
    var reroute_Original: js.Function2[
        /* key */ String, 
        /* road */ typings.roads.roadMod.default, 
        typings.roads.roadMod.Middleware
      ] = js.native
    @JSName("setTitle")
    var setTitle_Original: typings.roads.roadMod.Middleware = js.native
    def applyToContext(key: String, `val`: js.Any): typings.roads.roadMod.Middleware = js.native
    def cookie(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = js.native
    def cors(options: AnonCacheMaxAge): typings.roads.roadMod.Middleware = js.native
    def killSlash(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = js.native
    def parseBody(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = js.native
    def reroute(key: String, road: typings.roads.roadMod.default): typings.roads.roadMod.Middleware = js.native
    def setTitle(
      method: String,
      path: String,
      body: String,
      headers: StringDictionary[js.Any],
      next: ResponseMiddleware
    ): js.Promise[typings.roads.responseMod.default] = js.native
    @js.native
    object SimpleRouter
      extends TopLevel[
              Instantiable1[
                js.UndefOr[/* road */ typings.roads.roadMod.default], 
                typings.roads.simpleRouterMod.default
              ]
            ]
    
  }
  
}

