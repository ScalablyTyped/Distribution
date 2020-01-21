package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDectect extends js.Object {
  var autoDectect: Boolean
  var buttons: js.Array[_]
  var show: Boolean
  var title: String
  var `type`: String
}

object AnonAutoDectect {
  @scala.inline
  def apply(autoDectect: Boolean, buttons: js.Array[_], show: Boolean, title: String, `type`: String): AnonAutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDectect]
  }
}

