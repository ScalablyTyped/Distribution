package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object Anon_Icon {
  @scala.inline
  def apply(icon: String = null, label: String = null): Anon_Icon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Icon]
  }
}

