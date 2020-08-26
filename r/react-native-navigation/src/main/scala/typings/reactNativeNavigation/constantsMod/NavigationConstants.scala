package typings.reactNativeNavigation.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationConstants extends js.Object {
  var backButtonId: String = js.native
  var bottomTabsHeight: Double = js.native
  var statusBarHeight: Double = js.native
  var topBarHeight: Double = js.native
}

object NavigationConstants {
  @scala.inline
  def apply(backButtonId: String, bottomTabsHeight: Double, statusBarHeight: Double, topBarHeight: Double): NavigationConstants = {
    val __obj = js.Dynamic.literal(backButtonId = backButtonId.asInstanceOf[js.Any], bottomTabsHeight = bottomTabsHeight.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationConstants]
  }
  @scala.inline
  implicit class NavigationConstantsOps[Self <: NavigationConstants] (val x: Self) extends AnyVal {
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
    def setBackButtonId(value: String): Self = this.set("backButtonId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomTabsHeight(value: Double): Self = this.set("bottomTabsHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBarHeight(value: Double): Self = this.set("topBarHeight", value.asInstanceOf[js.Any])
  }
  
}

