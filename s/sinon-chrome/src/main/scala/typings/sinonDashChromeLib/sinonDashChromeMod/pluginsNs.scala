package typings
package sinonDashChromeLib.sinonDashChromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "plugins")
@js.native
object pluginsNs extends js.Object {
  @js.native
  class CookiePlugin ()
    extends sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.pluginsNs.CookiePlugin {
    def this(state: js.Array[chromeLib.chromeNs.cookiesNs.Cookie]) = this()
  }
  
  @js.native
  class I18nPlugin ()
    extends sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.pluginsNs.I18nPlugin {
    def this(translations: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.pluginsNs.Translations) = this()
  }
  
}

