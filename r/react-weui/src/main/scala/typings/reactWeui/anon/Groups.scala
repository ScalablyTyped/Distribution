package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var actions: js.Array[_]
  var groups: js.Array[_]
  var lang: LeftBtn
  var show: Boolean
}

object Groups {
  @scala.inline
  def apply(actions: js.Array[_], groups: js.Array[_], lang: LeftBtn, show: Boolean): Groups = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

