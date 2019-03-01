package typings
package reactDashIntlDashReduxLib.reactDashIntlDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlState extends js.Object {
  var locale: java.lang.String
  var messages: js.Any
}

object IntlState {
  @scala.inline
  def apply(locale: java.lang.String, messages: js.Any): IntlState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("messages")(messages)
    __obj.asInstanceOf[IntlState]
  }
}

