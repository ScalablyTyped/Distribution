package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: ReactNode = null, location: Location[LocationState] = null): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[SwitchProps]
  }
}

