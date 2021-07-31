package typings.roads

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.roads.responseMod.default
import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookieMod {
  
  @JSImport("roads/types/middleware/cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("roads/types/middleware/cookie", JSImport.Default)
  @js.native
  def default: Middleware = js.native
  
  @JSImport("roads/types/middleware/cookie", "CookieResponse")
  @js.native
  class CookieResponse protected () extends default {
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
    
    def getCookies(): StringDictionary[String] = js.native
    
    def setCookie(name: String): Unit = js.native
    def setCookie(name: String, value: js.Any): Unit = js.native
    def setCookie(name: String, value: js.Any, options: CookieSerializeOptions): Unit = js.native
    def setCookie(name: String, value: Unit, options: CookieSerializeOptions): Unit = js.native
  }
  
  @scala.inline
  def default_=(x: Middleware): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
