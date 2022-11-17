package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarPropsIOS extends StObject {
  
  /**
    * If the network activity indicator should be visible.
    *
    * @platform ios
    */
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    *
    * @platform ios
    */
  var showHideTransition: js.UndefOr[Null | "fade" | "slide" | "none"] = js.undefined
}
object StatusBarPropsIOS {
  
  inline def apply(): StatusBarPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsIOS]
  }
  
  extension [Self <: StatusBarPropsIOS](x: Self) {
    
    inline def setNetworkActivityIndicatorVisible(value: Boolean): Self = StObject.set(x, "networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    inline def setNetworkActivityIndicatorVisibleUndefined: Self = StObject.set(x, "networkActivityIndicatorVisible", js.undefined)
    
    inline def setShowHideTransition(value: "fade" | "slide" | "none"): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    inline def setShowHideTransitionNull: Self = StObject.set(x, "showHideTransition", null)
    
    inline def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
  }
}
