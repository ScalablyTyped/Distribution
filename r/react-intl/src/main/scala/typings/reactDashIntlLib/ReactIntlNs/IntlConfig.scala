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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultFormats")(defaultFormats)
    __obj.updateDynamic("defaultLocale")(defaultLocale)
    __obj.updateDynamic("formats")(formats)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[IntlConfig]
  }
}

