package typings.reactIntl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl/lib/types.IntlConfig, 'locale' | 'onError'> */
trait PickIntlConfiglocaleonErr extends js.Object {
  var locale: String
  var onError: js.Function1[/* err */ String, Unit]
}

object PickIntlConfiglocaleonErr {
  @scala.inline
  def apply(locale: String, onError: /* err */ String => Unit): PickIntlConfiglocaleonErr = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfiglocaleonErr]
  }
}

