package typings.reactDashFocusDashLock.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeFocusProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object FreeFocusProps {
  @scala.inline
  def apply(className: String = null): FreeFocusProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeFocusProps]
  }
}

