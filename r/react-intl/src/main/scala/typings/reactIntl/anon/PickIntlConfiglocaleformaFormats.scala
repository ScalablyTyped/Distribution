package typings.reactIntl.anon

import typings.reactIntl.typesMod.CustomFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'formats' | 'onError'> */
trait PickIntlConfiglocaleformaFormats extends js.Object {
  var formats: CustomFormats
  var locale: String
  var onError: js.Function1[/* err */ String, Unit]
}

object PickIntlConfiglocaleformaFormats {
  @scala.inline
  def apply(formats: CustomFormats, locale: String, onError: /* err */ String => Unit): PickIntlConfiglocaleformaFormats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleformaFormats]
  }
}

