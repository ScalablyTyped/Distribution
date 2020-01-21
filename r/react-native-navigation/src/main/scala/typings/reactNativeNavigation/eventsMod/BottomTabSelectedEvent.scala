package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomTabSelectedEvent extends js.Object {
  var selectedTabIndex: Double
  var unselectedTabIndex: Double
}

object BottomTabSelectedEvent {
  @scala.inline
  def apply(selectedTabIndex: Double, unselectedTabIndex: Double): BottomTabSelectedEvent = {
    val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any], unselectedTabIndex = unselectedTabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BottomTabSelectedEvent]
  }
}

