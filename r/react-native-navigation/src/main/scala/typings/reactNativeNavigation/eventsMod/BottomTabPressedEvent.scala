package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomTabPressedEvent extends js.Object {
  var tabIndex: Double
}

object BottomTabPressedEvent {
  @scala.inline
  def apply(tabIndex: Double): BottomTabPressedEvent = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabPressedEvent]
  }
}

