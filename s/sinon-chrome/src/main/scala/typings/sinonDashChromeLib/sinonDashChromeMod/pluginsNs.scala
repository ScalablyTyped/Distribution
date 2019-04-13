package typings
package sinonDashChromeLib.sinonDashChromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "plugins")
@js.native
object pluginsNs extends js.Object {
  @js.native
  class CookiePlugin () extends js.Object {
    def this(state: js.Array[chromeLib.chromeNs.cookiesNs.Cookie]) = this()
  }
  
  @js.native
  class I18nPlugin () extends js.Object {
    def this(translations: Translations) = this()
  }
  
  type Translations = org.scalablytyped.runtime.StringDictionary[sinonDashChromeLib.Anon_Description]
}

