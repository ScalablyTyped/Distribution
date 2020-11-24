package typings.roads

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.roads.responseMod.default
import typings.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads/types/middleware/cookie", JSImport.Namespace)
@js.native
object cookieMod extends js.Object {
  
  var default: Middleware = js.native
  
  @js.native
  class CookieResponse () extends default {
    
    def getCookies(): StringDictionary[String] = js.native
    
    def setCookie(name: String): Unit = js.native
    def setCookie(name: String, value: js.UndefOr[scala.Nothing], options: CookieSerializeOptions): Unit = js.native
    def setCookie(name: String, value: js.Any): Unit = js.native
    def setCookie(name: String, value: js.Any, options: CookieSerializeOptions): Unit = js.native
  }
}
