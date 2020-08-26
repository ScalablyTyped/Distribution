package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.Array[_] = js.native
  var autoDectect: Boolean = js.native
  var menus: js.Array[_] = js.native
  var show: Boolean = js.native
  var `type`: String = js.native
}

object Actions {
  @scala.inline
  def apply(actions: js.Array[_], autoDectect: Boolean, menus: js.Array[_], show: Boolean, `type`: String): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], autoDectect = autoDectect.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: js.Any*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[_]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoDectect(value: Boolean): Self = this.set("autoDectect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenusVarargs(value: js.Any*): Self = this.set("menus", js.Array(value :_*))
    @scala.inline
    def setMenus(value: js.Array[_]): Self = this.set("menus", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

