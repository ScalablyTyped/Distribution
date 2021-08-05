package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarPropsIOS extends StObject {
  
  /**
    * Sets the color of the status bar text.
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  
  /**
    * If the network activity indicator should be visible.
    */
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    */
  var showHideTransition: js.UndefOr[fade | slide] = js.undefined
}
object StatusBarPropsIOS {
  
  inline def apply(): StatusBarPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsIOS]
  }
  
  extension [Self <: StatusBarPropsIOS](x: Self) {
    
    inline def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setNetworkActivityIndicatorVisible(value: Boolean): Self = StObject.set(x, "networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    inline def setNetworkActivityIndicatorVisibleUndefined: Self = StObject.set(x, "networkActivityIndicatorVisible", js.undefined)
    
    inline def setShowHideTransition(value: fade | slide): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    inline def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
  }
}
