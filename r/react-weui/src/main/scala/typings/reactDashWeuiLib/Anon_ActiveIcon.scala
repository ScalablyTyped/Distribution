package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIcon extends js.Object {
  var active: scala.Boolean
  var icon: scala.Boolean
  var label: java.lang.String
}

object Anon_ActiveIcon {
  @scala.inline
  def apply(active: scala.Boolean, icon: scala.Boolean, label: java.lang.String): Anon_ActiveIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ActiveIcon]
  }
}

