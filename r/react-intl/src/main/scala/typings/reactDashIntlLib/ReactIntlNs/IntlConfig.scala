package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlConfig extends js.Object {
  var defaultFormats: reactLib.reactMod.Requireable[_]
  var defaultLocale: reactLib.reactMod.Requireable[_]
  var formats: reactLib.reactMod.Requireable[_]
  var locale: reactLib.reactMod.Requireable[_]
  var messages: reactLib.reactMod.Requireable[_]
  var onError: reactLib.reactMod.Requireable[_]
}

object IntlConfig {
  @scala.inline
  def apply(
    defaultFormats: reactLib.reactMod.Requireable[_],
    defaultLocale: reactLib.reactMod.Requireable[_],
    formats: reactLib.reactMod.Requireable[_],
    locale: reactLib.reactMod.Requireable[_],
    messages: reactLib.reactMod.Requireable[_],
    onError: reactLib.reactMod.Requireable[_]
  ): IntlConfig = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats, defaultLocale = defaultLocale, formats = formats, locale = locale, messages = messages, onError = onError)
  
    __obj.asInstanceOf[IntlConfig]
  }
}

