package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Show extends js.Object {
  var icon: String
  var show: Boolean
}

object Show {
  @scala.inline
  def apply(icon: String, show: Boolean): Show = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
}

