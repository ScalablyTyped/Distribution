package typings.reactNavigationDrawer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerIconProps extends js.Object {
  var focused: Boolean
  var tintColor: js.UndefOr[String] = js.undefined
}

object DrawerIconProps {
  @scala.inline
  def apply(focused: Boolean, tintColor: String = null): DrawerIconProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerIconProps]
  }
}

