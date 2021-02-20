package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideMenuSide extends StObject {
  
  /**
    * Enable or disable the side menu
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the height of the side menu
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Stretch sideMenu contents when opened past the width
    * #### (iOS specific)
    * @default true
    */
  var shouldStretchDrawer: js.UndefOr[Boolean] = js.native
  
  /**
    * Show or hide the side menu
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the width of the side menu
    */
  var width: js.UndefOr[Double] = js.native
}
object SideMenuSide {
  
  @scala.inline
  def apply(): SideMenuSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideMenuSide]
  }
  
  @scala.inline
  implicit class SideMenuSideMutableBuilder[Self <: SideMenuSide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setShouldStretchDrawer(value: Boolean): Self = StObject.set(x, "shouldStretchDrawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldStretchDrawerUndefined: Self = StObject.set(x, "shouldStretchDrawer", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
