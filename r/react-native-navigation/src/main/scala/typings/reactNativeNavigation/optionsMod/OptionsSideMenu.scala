package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.bezel
import typings.reactNativeNavigation.reactNativeNavigationStrings.entireScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSideMenu extends StObject {
  
  /**
    * Configure the left side menu
    */
  var left: js.UndefOr[SideMenuSide] = js.undefined
  
  /**
    * Configure how a user is allowed to open a drawer using gestures
    * #### (iOS specific)
    * @default 'entireScreen'
    */
  var openGestureMode: js.UndefOr[entireScreen | bezel] = js.undefined
  
  /**
    * Configure the right side menu
    */
  var right: js.UndefOr[SideMenuSide] = js.undefined
}
object OptionsSideMenu {
  
  inline def apply(): OptionsSideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSideMenu]
  }
  
  extension [Self <: OptionsSideMenu](x: Self) {
    
    inline def setLeft(value: SideMenuSide): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOpenGestureMode(value: entireScreen | bezel): Self = StObject.set(x, "openGestureMode", value.asInstanceOf[js.Any])
    
    inline def setOpenGestureModeUndefined: Self = StObject.set(x, "openGestureMode", js.undefined)
    
    inline def setRight(value: SideMenuSide): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
