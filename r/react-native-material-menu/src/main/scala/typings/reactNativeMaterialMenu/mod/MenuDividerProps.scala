package typings.reactNativeMaterialMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDividerProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object MenuDividerProps {
  @scala.inline
  def apply(color: String = null): MenuDividerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDividerProps]
  }
}

