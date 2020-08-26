package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var actions: js.Array[_] = js.native
  var groups: js.Array[_] = js.native
  var lang: LeftBtn = js.native
  var show: Boolean = js.native
}

object Groups {
  @scala.inline
  def apply(actions: js.Array[_], groups: js.Array[_], lang: LeftBtn, show: Boolean): Groups = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: js.Any*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[_]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: LeftBtn): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

