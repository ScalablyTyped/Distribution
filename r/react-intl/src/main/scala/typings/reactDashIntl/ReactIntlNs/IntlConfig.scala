package typings.reactDashIntl.ReactIntlNs

import typings.react.reactMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlConfig extends js.Object {
  var defaultFormats: Requireable[_]
  var defaultLocale: Requireable[_]
  var formats: Requireable[_]
  var locale: Requireable[_]
  var messages: Requireable[_]
  var onError: Requireable[_]
}

object IntlConfig {
  @scala.inline
  def apply(
    defaultFormats: Requireable[_],
    defaultLocale: Requireable[_],
    formats: Requireable[_],
    locale: Requireable[_],
    messages: Requireable[_],
    onError: Requireable[_]
  ): IntlConfig = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats, defaultLocale = defaultLocale, formats = formats, locale = locale, messages = messages, onError = onError)
  
    __obj.asInstanceOf[IntlConfig]
  }
}

