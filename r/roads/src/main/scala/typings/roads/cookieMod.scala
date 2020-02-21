package typings.roads

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.roads.responseMod.default
import typings.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads/types/middleware/cookie", JSImport.Namespace)
@js.native
object cookieMod extends js.Object {
  @js.native
  class CookieResponse () extends default {
    def getCookies(): StringDictionary[String] = js.native
    def setCookie(name: String): Unit = js.native
    def setCookie(name: String, value: js.Any): Unit = js.native
    def setCookie(name: String, value: js.Any, options: CookieSerializeOptions): Unit = js.native
  }
  
  var default: Middleware = js.native
}

