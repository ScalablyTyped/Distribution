package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideMenuSide extends StObject {
  
  /**
    * Enable or disable the side menu
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the height of the side menu
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Stretch sideMenu contents when opened past the width
    * #### (iOS specific)
    * @default true
    */
  var shouldStretchDrawer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show or hide the side menu
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the width of the side menu
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SideMenuSide {
  
  inline def apply(): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideMenuSide]
  }
  
  extension [Self <: SideMenuSide](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setShouldStretchDrawer(value: Boolean): Self = StObject.set(x, "shouldStretchDrawer", value.asInstanceOf[js.Any])
    
    inline def setShouldStretchDrawerUndefined: Self = StObject.set(x, "shouldStretchDrawer", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
