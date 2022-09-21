package typings.roads

import typings.node.bufferMod.global.Buffer
import typings.roads.anon.CacheMaxAge
import typings.roads.cookieMiddlewareMod.CookieContext
import typings.roads.modifiedSinceMod.ModifiedSinceContext
import typings.roads.responseMod.OutgoingHeaders
import typings.roads.roadMod.Context
import typings.roads.roadMod.Middleware
import typings.roads.roadMod.default
import typings.roads.storeValsMod.StoreValsContext
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ApplyToContextMiddleware {
    
    @JSImport("roads", "ApplyToContextMiddleware")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(key: String, `val`: Any): Middleware[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Middleware[Context]]
  }
  
  object BasicRouterMiddleware {
    
    @JSImport("roads", "BasicRouterMiddleware.BasicRouter")
    @js.native
    /**
      * @param {Road} [road] - The road that will receive the BasicRouter middleware
      */
    open class BasicRouter ()
      extends typings.roads.basicRouterMod.BasicRouter {
      def this(road: default) = this()
    }
  }
  
  object CookieMiddleware {
    
    @JSImport("roads", "CookieMiddleware")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildClientMiddleware(pageDocument: Document): Middleware[CookieContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientMiddleware")(pageDocument.asInstanceOf[js.Any]).asInstanceOf[Middleware[CookieContext]]
    
    @JSImport("roads", "CookieMiddleware.serverMiddleware")
    @js.native
    val serverMiddleware: Middleware[CookieContext] = js.native
  }
  
  object CorsMiddleware {
    
    @JSImport("roads", "CorsMiddleware")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(options: CacheMaxAge): Middleware[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[Context]]
  }
  
  object ModifiedSinceMiddleware {
    
    @JSImport("roads", "ModifiedSinceMiddleware.middleware")
    @js.native
    val middleware: Middleware[ModifiedSinceContext] = js.native
  }
  
  object ParseBodyMiddleware {
    
    @JSImport("roads", "ParseBodyMiddleware.middleware")
    @js.native
    val middleware: Middleware[Context] = js.native
  }
  
  object RemoveTrailingSlashMiddleware {
    
    @JSImport("roads", "RemoveTrailingSlashMiddleware.middleware")
    @js.native
    val middleware: Middleware[Context] = js.native
  }
  
  @JSImport("roads", "Request")
  @js.native
  open class Request protected ()
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
  
  object RerouteMiddleware {
    
    @JSImport("roads", "RerouteMiddleware")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(key: String, road: default): Middleware[Context] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(key.asInstanceOf[js.Any], road.asInstanceOf[js.Any])).asInstanceOf[Middleware[Context]]
  }
  
  @JSImport("roads", "Response")
  @js.native
  open class Response protected ()
    extends typings.roads.responseMod.default {
    /**
      * Creates a new Response object.
      *
      * @param {string | Buffer} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: Buffer) = this()
    def this(body: String, status: Double) = this()
    def this(body: Buffer, status: Double) = this()
    def this(body: String, status: Double, headers: OutgoingHeaders) = this()
    def this(body: String, status: Unit, headers: OutgoingHeaders) = this()
    def this(body: Buffer, status: Double, headers: OutgoingHeaders) = this()
    def this(body: Buffer, status: Unit, headers: OutgoingHeaders) = this()
  }
  
  @JSImport("roads", "Road")
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road object
    */
  open class Road () extends default
  
  @JSImport("roads", "RoadsPJAX")
  @js.native
  open class RoadsPJAX protected ()
    extends typings.roads.pjaxMod.default {
    /**
      * Creates a new RoadsPjax instance. PJAX looks in the containerElement at each
      * anchor tag with the  `data-roads-pjax="link"` attribute and changes it from a
      * normal link into a link that uses the road.
      *
      * @param {Road} road - The road that will be used when clicking links
      * @param {HTMLElement} containerElement - The element that will be filled with your roads output
      * @param {Window} window - The page's window object to help set page title url
      */
    def this(road: default, containerElement: HTMLElement, window: Window) = this()
  }
  
  object StoreValsMiddleware {
    
    @JSImport("roads", "StoreValsMiddleware.middleware")
    @js.native
    val middleware: Middleware[StoreValsContext] = js.native
  }
}
