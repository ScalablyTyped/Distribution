package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  /**
    * The name of the menu.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(label: java.lang.String = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[MenuProps]
  }
}

