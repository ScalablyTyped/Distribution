package typings.protonDashNative.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  /**
    * The name of the menu.
    */
  var label: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(label: String = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

