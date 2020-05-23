package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveIcon extends js.Object {
  var active: Boolean
  var icon: Boolean
  var label: String
}

object ActiveIcon {
  @scala.inline
  def apply(active: Boolean, icon: Boolean, label: String): ActiveIcon = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIcon]
  }
}

