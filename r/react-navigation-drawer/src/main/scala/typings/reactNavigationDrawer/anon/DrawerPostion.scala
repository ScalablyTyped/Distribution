package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerPostion extends StObject {
  
  var drawerPostion: String
  
  var drawerType: String
  
  var gestureEnabled: Boolean
  
  var hideStatusBar: Boolean
  
  var keyboardDismissMode: String
  
  var statusBarAnimation: String
  
  var swipeEdgeWidth: Double
  
  var swipeVelocityThreshold: Double
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
  implicit class DrawerPostionMutableBuilder[Self <: DrawerPostion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawerPostion(value: String): Self = StObject.set(x, "drawerPostion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawerType(value: String): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDismissMode(value: String): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarAnimation(value: String): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeEdgeWidth(value: Double): Self = StObject.set(x, "swipeEdgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeVelocityThreshold(value: Double): Self = StObject.set(x, "swipeVelocityThreshold", value.asInstanceOf[js.Any])
  }
}
