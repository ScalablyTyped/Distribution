package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerNavigationState extends NavigationState {
  var isDrawerOpen: Boolean = js.native
}

object DrawerNavigationState {
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigationState]
  }
  @scala.inline
  implicit class DrawerNavigationStateOps[Self <: DrawerNavigationState] (val x: Self) extends AnyVal {
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
    def setIsDrawerOpen(value: Boolean): Self = this.set("isDrawerOpen", value.asInstanceOf[js.Any])
  }
  
}

