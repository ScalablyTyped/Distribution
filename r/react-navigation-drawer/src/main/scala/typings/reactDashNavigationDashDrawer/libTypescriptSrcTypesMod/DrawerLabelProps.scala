package typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLabelProps extends js.Object {
  var focused: Boolean
  var tintColor: js.UndefOr[String] = js.undefined
}

object DrawerLabelProps {
  @scala.inline
  def apply(focused: Boolean, tintColor: String = null): DrawerLabelProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLabelProps]
  }
}

