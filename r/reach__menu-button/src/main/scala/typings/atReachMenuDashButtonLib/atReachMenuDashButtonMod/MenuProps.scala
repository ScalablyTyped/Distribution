package typings
package atReachMenuDashButtonLib.atReachMenuDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

