package typings
package reactDashRouterDashNativeLib.reactDashRouterDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object BackButtonProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode = null): BackButtonProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackButtonProps]
  }
}

