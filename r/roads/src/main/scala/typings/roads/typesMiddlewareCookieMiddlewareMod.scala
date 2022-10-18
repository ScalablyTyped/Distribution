package typings.roads

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.roads.anon.Options
import typings.roads.typesCoreRoadMod.Middleware
import typings.std.Document
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareCookieMiddlewareMod {
  
  @JSImport("roads/types/middleware/cookieMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildClientMiddleware(pageDocument: Document): Middleware[CookieContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientMiddleware")(pageDocument.asInstanceOf[js.Any]).asInstanceOf[Middleware[CookieContext]]
  
  @JSImport("roads/types/middleware/cookieMiddleware", "serverMiddleware")
  @js.native
  val serverMiddleware: Middleware[CookieContext] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ @js.native
  trait CookieContext extends StObject {
    
    /**
      * Returns an object with all the cookies. It defaults to
      * 	all the request cookies, but merges anything applied via
      * 	setCookie on top (i.e. setCookie will override the request cookie)
      */
    def getCookies(): Record[String, String] = js.native
    
    var newCookies: NewCookies = js.native
    
    /**
      * Calling this function will store your new cookies.
      * 	The parameters directly map to the [cookie](https://github.com/jshttp/cookie) module.
      */
    def setCookie(name: String): Unit = js.native
    def setCookie(name: String, value: String): Unit = js.native
    def setCookie(name: String, value: String, options: CookieSerializeOptions): Unit = js.native
    def setCookie(name: String, value: Unit, options: CookieSerializeOptions): Unit = js.native
  }
  
  type NewCookies = StringDictionary[Options]
}
