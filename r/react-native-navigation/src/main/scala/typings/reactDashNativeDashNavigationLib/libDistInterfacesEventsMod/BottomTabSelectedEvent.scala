package typings
package reactDashNativeDashNavigationLib.libDistInterfacesEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomTabSelectedEvent extends js.Object {
  var selectedTabIndex: scala.Double
  var unselectedTabIndex: scala.Double
}

object BottomTabSelectedEvent {
  @scala.inline
  def apply(selectedTabIndex: scala.Double, unselectedTabIndex: scala.Double): BottomTabSelectedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectedTabIndex")(selectedTabIndex)
    __obj.updateDynamic("unselectedTabIndex")(unselectedTabIndex)
    __obj.asInstanceOf[BottomTabSelectedEvent]
  }
}

