package typings.reactIntl.providerMod

import typings.intlMessageformatParser.mod.MessageFormatElement
import typings.reactIntl.typesMod.CustomFormats
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-intl.react-intl/lib/types.Omit<react-intl.react-intl/lib/types.IntlConfig, keyof std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
trait OptionalIntlConfig extends js.Object {
  var defaultFormats: js.UndefOr[CustomFormats] = js.undefined
  var defaultLocale: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[CustomFormats] = js.undefined
  var locale: String
  var messages: js.UndefOr[Record[String, js.Array[MessageFormatElement] | String]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ String, Unit]] = js.undefined
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object OptionalIntlConfig {
  @scala.inline
  def apply(
    locale: String,
    defaultFormats: CustomFormats = null,
    defaultLocale: String = null,
    formats: CustomFormats = null,
    messages: Record[String, js.Array[MessageFormatElement] | String] = null,
    onError: /* err */ String => Unit = null,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any = null,
    timeZone: String = null
  ): OptionalIntlConfig = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (defaultFormats != null) __obj.updateDynamic("defaultFormats")(defaultFormats.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalIntlConfig]
  }
}

