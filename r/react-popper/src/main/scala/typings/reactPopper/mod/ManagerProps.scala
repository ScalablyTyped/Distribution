package typings.reactPopper.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagerProps extends js.Object {
  var children: ReactNode
}

object ManagerProps {
  @scala.inline
  def apply(children: ReactNode = null): ManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerProps]
  }
}

