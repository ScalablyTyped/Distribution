package typings.reactDashIntlDashRedux.reactDashIntlDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlState extends js.Object {
  var locale: String
  var messages: js.Any
}

object IntlState {
  @scala.inline
  def apply(locale: String, messages: js.Any): IntlState = {
    val __obj = js.Dynamic.literal(locale = locale, messages = messages)
  
    __obj.asInstanceOf[IntlState]
  }
}

