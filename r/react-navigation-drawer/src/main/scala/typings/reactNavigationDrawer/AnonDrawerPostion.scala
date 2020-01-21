package typings.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrawerPostion extends js.Object {
  var drawerPostion: String
  var drawerType: String
  var hideStatusBar: Boolean
  var keyboardDismissMode: String
  var locked: Boolean
  var statusBarAnimation: String
  var swipeEdgeWidth: Double
  var swipeVelocityThreshold: Double
}

object AnonDrawerPostion {
  @scala.inline
  def apply(
    drawerPostion: String,
    drawerType: String,
    hideStatusBar: Boolean,
    keyboardDismissMode: String,
    locked: Boolean,
    statusBarAnimation: String,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): AnonDrawerPostion = {
    val __obj = js.Dynamic.literal(drawerPostion = drawerPostion.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDrawerPostion]
  }
}

