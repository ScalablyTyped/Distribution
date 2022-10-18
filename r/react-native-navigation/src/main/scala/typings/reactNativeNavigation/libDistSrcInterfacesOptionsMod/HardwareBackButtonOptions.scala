package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.exit
import typings.reactNativeNavigation.reactNativeNavigationStrings.first
import typings.reactNativeNavigation.reactNativeNavigationStrings.previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardwareBackButtonOptions extends StObject {
  
  /**
    * Controls hardware back button bottom tab selection behaviour
    */
  var bottomTabsOnPress: js.UndefOr[exit | first | previous] = js.undefined
  
  /**
    * Controls whether the hardware back button should dismiss modal or not
    * #### (Android specific)
    * @default true
    */
  var dismissModalOnPress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether the hardware back button should pop the Stack or not
    * #### (Android specific)
    * @default true
    */
  var popStackOnPress: js.UndefOr[Boolean] = js.undefined
}
object HardwareBackButtonOptions {
  
  inline def apply(): HardwareBackButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HardwareBackButtonOptions]
  }
  
  extension [Self <: HardwareBackButtonOptions](x: Self) {
    
    inline def setBottomTabsOnPress(value: exit | first | previous): Self = StObject.set(x, "bottomTabsOnPress", value.asInstanceOf[js.Any])
    
    inline def setBottomTabsOnPressUndefined: Self = StObject.set(x, "bottomTabsOnPress", js.undefined)
    
    inline def setDismissModalOnPress(value: Boolean): Self = StObject.set(x, "dismissModalOnPress", value.asInstanceOf[js.Any])
    
    inline def setDismissModalOnPressUndefined: Self = StObject.set(x, "dismissModalOnPress", js.undefined)
    
    inline def setPopStackOnPress(value: Boolean): Self = StObject.set(x, "popStackOnPress", value.asInstanceOf[js.Any])
    
    inline def setPopStackOnPressUndefined: Self = StObject.set(x, "popStackOnPress", js.undefined)
  }
}
