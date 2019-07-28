package typings.sinonDashChrome.sinonDashChromeMod

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chromeNs.cookiesNs.Cookie
import typings.sinonDashChrome.Anon_Description
import typings.sinonDashChrome.sinonDashChromeMod.pluginsNs.Translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "plugins")
@js.native
object pluginsNs extends js.Object {
  @js.native
  class CookiePlugin () extends js.Object {
    def this(state: js.Array[Cookie]) = this()
  }
  
  @js.native
  class I18nPlugin () extends js.Object {
    def this(translations: Translations) = this()
  }
  
  type Translations = StringDictionary[Anon_Description]
}

