package typings.sinonChrome.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chrome.cookies.Cookie
import typings.sinonChrome.AnonDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "plugins")
@js.native
object plugins extends js.Object {
  @js.native
  class CookiePlugin () extends js.Object {
    def this(state: js.Array[Cookie]) = this()
  }
  
  @js.native
  class I18nPlugin () extends js.Object {
    def this(translations: Translations) = this()
  }
  
  type Translations = StringDictionary[AnonDescription]
}

