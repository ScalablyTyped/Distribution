package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: js.Array[_]
  var autoDectect: Boolean
  var menus: js.Array[_]
  var show: Boolean
  var `type`: String
}

object Actions {
  @scala.inline
  def apply(actions: js.Array[_], autoDectect: Boolean, menus: js.Array[_], show: Boolean, `type`: String): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], autoDectect = autoDectect.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

