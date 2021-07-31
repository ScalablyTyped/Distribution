package typings.sinonChrome.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chrome.cookies.Cookie
import typings.sinonChrome.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSImport("sinon-chrome", "plugins.CookiePlugin")
  @js.native
  class CookiePlugin () extends StObject {
    def this(state: js.Array[Cookie]) = this()
  }
  
  @JSImport("sinon-chrome", "plugins.I18nPlugin")
  @js.native
  class I18nPlugin () extends StObject {
    def this(translations: Translations) = this()
  }
  
  type Translations = StringDictionary[Description]
}
