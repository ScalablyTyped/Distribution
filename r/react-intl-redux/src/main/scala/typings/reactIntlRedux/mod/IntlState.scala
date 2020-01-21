package typings.reactIntlRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlState extends js.Object {
  var formats: js.UndefOr[js.Any] = js.undefined
  var locale: String
  var messages: js.Any
}

object IntlState {
  @scala.inline
  def apply(locale: String, messages: js.Any, formats: js.Any = null): IntlState = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlState]
  }
}

