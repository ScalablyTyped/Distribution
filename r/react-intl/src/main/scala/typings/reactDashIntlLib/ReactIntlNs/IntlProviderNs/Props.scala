package typings
package reactDashIntlLib.ReactIntlNs.IntlProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var defaultFormats: js.UndefOr[js.Any] = js.undefined
  var defaultLocale: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Any] = js.undefined
  var initialNow: js.UndefOr[js.Any] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var messages: js.UndefOr[js.Any] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
  var textComponent: js.UndefOr[js.Any] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    defaultFormats: js.Any = null,
    defaultLocale: java.lang.String = null,
    formats: js.Any = null,
    initialNow: js.Any = null,
    locale: java.lang.String = null,
    messages: js.Any = null,
    onError: js.Function1[/* error */ java.lang.String, scala.Unit] = null,
    textComponent: js.Any = null,
    timeZone: java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (defaultFormats != null) __obj.updateDynamic("defaultFormats")(defaultFormats)
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (initialNow != null) __obj.updateDynamic("initialNow")(initialNow)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Props]
  }
}

