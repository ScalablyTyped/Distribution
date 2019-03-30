package typings
package reactDashFocusDashLockLib.reactDashFocusDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocusProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object AutoFocusProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode, className: java.lang.String = null): AutoFocusProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[AutoFocusProps]
  }
}

