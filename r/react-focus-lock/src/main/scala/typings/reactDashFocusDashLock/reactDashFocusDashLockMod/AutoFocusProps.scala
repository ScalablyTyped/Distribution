package typings.reactDashFocusDashLock.reactDashFocusDashLockMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocusProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
}

object AutoFocusProps {
  @scala.inline
  def apply(children: ReactNode, className: String = null): AutoFocusProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[AutoFocusProps]
  }
}

