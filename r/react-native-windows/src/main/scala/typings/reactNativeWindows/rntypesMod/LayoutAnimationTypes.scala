package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.easeIn
import typings.reactNativeWindows.reactNativeWindowsStrings.easeInEaseOut
import typings.reactNativeWindows.reactNativeWindowsStrings.easeOut
import typings.reactNativeWindows.reactNativeWindowsStrings.keyboard
import typings.reactNativeWindows.reactNativeWindowsStrings.linear
import typings.reactNativeWindows.reactNativeWindowsStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ type in react-native-windows.react-native-windows/rntypes.LayoutAnimationType ]: type} */
trait LayoutAnimationTypes extends StObject {
  
  var easeIn: typings.reactNativeWindows.reactNativeWindowsStrings.easeIn
  
  var easeInEaseOut: typings.reactNativeWindows.reactNativeWindowsStrings.easeInEaseOut
  
  var easeOut: typings.reactNativeWindows.reactNativeWindowsStrings.easeOut
  
  var keyboard: typings.reactNativeWindows.reactNativeWindowsStrings.keyboard
  
  var linear: typings.reactNativeWindows.reactNativeWindowsStrings.linear
  
  var spring: typings.reactNativeWindows.reactNativeWindowsStrings.spring
}
object LayoutAnimationTypes {
  
  inline def apply(): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = "easeIn", easeInEaseOut = "easeInEaseOut", easeOut = "easeOut", keyboard = "keyboard", linear = "linear", spring = "spring")
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
  
  extension [Self <: LayoutAnimationTypes](x: Self) {
    
    inline def setEaseIn(value: easeIn): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    inline def setEaseInEaseOut(value: easeInEaseOut): Self = StObject.set(x, "easeInEaseOut", value.asInstanceOf[js.Any])
    
    inline def setEaseOut(value: easeOut): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: linear): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setSpring(value: spring): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
  }
}
