package typings.reactIntl.anon

import typings.intlMessageformatParser.mod.MessageFormatElement
import typings.reactIntl.typesMod.CustomFormats
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
trait PickIntlConfigformatsmess extends js.Object {
  var defaultFormats: CustomFormats
  var defaultLocale: String
  var formats: CustomFormats
  var messages: Record[String, js.Array[MessageFormatElement] | String]
  var onError: js.Function1[/* err */ String, Unit]
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object PickIntlConfigformatsmess {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ String => Unit,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any = null,
    timeZone: String = null
  ): PickIntlConfigformatsmess = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntlConfigformatsmess]
  }
}

