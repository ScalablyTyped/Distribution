package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerPostion extends js.Object {
  var drawerPostion: String = js.native
  var drawerType: String = js.native
  var gestureEnabled: Boolean = js.native
  var hideStatusBar: Boolean = js.native
  var keyboardDismissMode: String = js.native
  var statusBarAnimation: String = js.native
  var swipeEdgeWidth: Double = js.native
  var swipeVelocityThreshold: Double = js.native
}

object DrawerPostion {
  @scala.inline
  def apply(
    drawerPostion: String,
    drawerType: String,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: String,
    statusBarAnimation: String,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): DrawerPostion = {
    val __obj = js.Dynamic.literal(drawerPostion = drawerPostion.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerPostion]
  }
  @scala.inline
  implicit class DrawerPostionOps[Self <: DrawerPostion] (val x: Self) extends AnyVal {
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
    def setDrawerPostion(value: String): Self = this.set("drawerPostion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerType(value: String): Self = this.set("drawerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDismissMode(value: String): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusBarAnimation(value: String): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeEdgeWidth(value: Double): Self = this.set("swipeEdgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeVelocityThreshold(value: Double): Self = this.set("swipeVelocityThreshold", value.asInstanceOf[js.Any])
  }
  
}

