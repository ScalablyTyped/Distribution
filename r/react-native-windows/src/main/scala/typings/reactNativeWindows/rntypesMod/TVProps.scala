package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TVProps extends StObject {
  
  /**
    * *(Apple TV only)* TV preferred focus (see documentation for the View component).
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Designates the next view to receive focus when the user navigates down. See the Android documentation.
    *
    * @platform android
    */
  var nextFocusDown: js.UndefOr[Double] = js.undefined
  
  /**
    * Designates the next view to receive focus when the user navigates forward. See the Android documentation.
    *
    * @platform android
    */
  var nextFocusForward: js.UndefOr[Double] = js.undefined
  
  /**
    * Designates the next view to receive focus when the user navigates left. See the Android documentation.
    *
    * @platform android
    */
  var nextFocusLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Designates the next view to receive focus when the user navigates right. See the Android documentation.
    *
    * @platform android
    */
  var nextFocusRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Designates the next view to receive focus when the user navigates up. See the Android documentation.
    *
    * @platform android
    */
  var nextFocusUp: js.UndefOr[Double] = js.undefined
}
object TVProps {
  
  inline def apply(): TVProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVProps]
  }
  
  extension [Self <: TVProps](x: Self) {
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setNextFocusDown(value: Double): Self = StObject.set(x, "nextFocusDown", value.asInstanceOf[js.Any])
    
    inline def setNextFocusDownUndefined: Self = StObject.set(x, "nextFocusDown", js.undefined)
    
    inline def setNextFocusForward(value: Double): Self = StObject.set(x, "nextFocusForward", value.asInstanceOf[js.Any])
    
    inline def setNextFocusForwardUndefined: Self = StObject.set(x, "nextFocusForward", js.undefined)
    
    inline def setNextFocusLeft(value: Double): Self = StObject.set(x, "nextFocusLeft", value.asInstanceOf[js.Any])
    
    inline def setNextFocusLeftUndefined: Self = StObject.set(x, "nextFocusLeft", js.undefined)
    
    inline def setNextFocusRight(value: Double): Self = StObject.set(x, "nextFocusRight", value.asInstanceOf[js.Any])
    
    inline def setNextFocusRightUndefined: Self = StObject.set(x, "nextFocusRight", js.undefined)
    
    inline def setNextFocusUp(value: Double): Self = StObject.set(x, "nextFocusUp", value.asInstanceOf[js.Any])
    
    inline def setNextFocusUpUndefined: Self = StObject.set(x, "nextFocusUp", js.undefined)
  }
}
