package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: js.Array[_]
  var autoDectect: Boolean
  var menus: js.Array[_]
  var show: Boolean
  var `type`: String
}

object AnonActions {
  @scala.inline
  def apply(actions: js.Array[_], autoDectect: Boolean, menus: js.Array[_], show: Boolean, `type`: String): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], autoDectect = autoDectect.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

