package typings
package reactDashPopperLib.reactDashPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagerProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
}

object ManagerProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode): ManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerProps]
  }
}

