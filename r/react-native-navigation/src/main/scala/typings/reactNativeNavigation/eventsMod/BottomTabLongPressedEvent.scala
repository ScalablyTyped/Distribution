package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomTabLongPressedEvent extends js.Object {
  var selectedTabIndex: Double
}

object BottomTabLongPressedEvent {
  @scala.inline
  def apply(selectedTabIndex: Double): BottomTabLongPressedEvent = {
    val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BottomTabLongPressedEvent]
  }
}

