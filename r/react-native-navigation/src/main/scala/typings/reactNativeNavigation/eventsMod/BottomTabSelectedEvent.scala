package typings.reactNativeNavigation.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomTabSelectedEvent extends js.Object {
  var selectedTabIndex: Double = js.native
  var unselectedTabIndex: Double = js.native
}

object BottomTabSelectedEvent {
  @scala.inline
  def apply(selectedTabIndex: Double, unselectedTabIndex: Double): BottomTabSelectedEvent = {
    val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any], unselectedTabIndex = unselectedTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabSelectedEvent]
  }
  @scala.inline
  implicit class BottomTabSelectedEventOps[Self <: BottomTabSelectedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedTabIndex(value: Double): Self = this.set("selectedTabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnselectedTabIndex(value: Double): Self = this.set("unselectedTabIndex", value.asInstanceOf[js.Any])
  }
  
}

