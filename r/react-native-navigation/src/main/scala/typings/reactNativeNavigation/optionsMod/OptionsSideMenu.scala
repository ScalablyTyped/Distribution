package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.bezel
import typings.reactNativeNavigation.reactNativeNavigationStrings.entireScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSideMenu extends js.Object {
  /**
    * Configure the left side menu
    */
  var left: js.UndefOr[SideMenuSide] = js.native
  /**
    * Configure how a user is allowed to open a drawer using gestures
    * #### (iOS specific)
    * @default 'entireScreen'
    */
  var openGestureMode: js.UndefOr[entireScreen | bezel] = js.native
  /**
    * Configure the right side menu
    */
  var right: js.UndefOr[SideMenuSide] = js.native
}

object OptionsSideMenu {
  @scala.inline
  def apply(): OptionsSideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSideMenu]
  }
  @scala.inline
  implicit class OptionsSideMenuOps[Self <: OptionsSideMenu] (val x: Self) extends AnyVal {
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
    def setLeft(value: SideMenuSide): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOpenGestureMode(value: entireScreen | bezel): Self = this.set("openGestureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenGestureMode: Self = this.set("openGestureMode", js.undefined)
    @scala.inline
    def setRight(value: SideMenuSide): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

