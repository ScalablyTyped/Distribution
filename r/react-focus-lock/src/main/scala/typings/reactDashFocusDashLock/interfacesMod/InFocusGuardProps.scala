package typings.reactDashFocusDashLock.interfacesMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InFocusGuardProps extends js.Object {
  var children: ReactNode
}

object InFocusGuardProps {
  @scala.inline
  def apply(children: ReactNode = null): InFocusGuardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[InFocusGuardProps]
  }
}

