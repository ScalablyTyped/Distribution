package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlConfig extends js.Object {
  var defaultFormats: reactLib.reactMod.ReactNs.Requireable[_]
  var defaultLocale: reactLib.reactMod.ReactNs.Requireable[_]
  var formats: reactLib.reactMod.ReactNs.Requireable[_]
  var locale: reactLib.reactMod.ReactNs.Requireable[_]
  var messages: reactLib.reactMod.ReactNs.Requireable[_]
  var onError: reactLib.reactMod.ReactNs.Requireable[_]
}

object IntlConfig {
  @scala.inline
  def apply(
    defaultFormats: reactLib.reactMod.ReactNs.Requireable[_],
    defaultLocale: reactLib.reactMod.ReactNs.Requireable[_],
    formats: reactLib.reactMod.ReactNs.Requireable[_],
    locale: reactLib.reactMod.ReactNs.Requireable[_],
    messages: reactLib.reactMod.ReactNs.Requireable[_],
    onError: reactLib.reactMod.ReactNs.Requireable[_]
  ): IntlConfig = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats, defaultLocale = defaultLocale, formats = formats, locale = locale, messages = messages, onError = onError)
  
    __obj.asInstanceOf[IntlConfig]
  }
}

