package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoDectect extends js.Object {
  var autoDectect: Boolean
  var buttons: js.Array[_]
  var show: Boolean
  var title: String
  var `type`: String
}

object AutoDectect {
  @scala.inline
  def apply(autoDectect: Boolean, buttons: js.Array[_], show: Boolean, title: String, `type`: String): AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDectect]
  }
}

