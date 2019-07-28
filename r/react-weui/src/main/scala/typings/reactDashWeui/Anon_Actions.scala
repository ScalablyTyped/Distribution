package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.Array[_]
  var autoDectect: Boolean
  var menus: js.Array[_]
  var show: Boolean
  var `type`: String
}

object Anon_Actions {
  @scala.inline
  def apply(actions: js.Array[_], autoDectect: Boolean, menus: js.Array[_], show: Boolean, `type`: String): Anon_Actions = {
    val __obj = js.Dynamic.literal(actions = actions, autoDectect = autoDectect, menus = menus, show = show)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Actions]
  }
}

