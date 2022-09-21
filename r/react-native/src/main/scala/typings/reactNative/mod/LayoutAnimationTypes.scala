package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.easeIn
import typings.reactNative.reactNativeStrings.easeInEaseOut
import typings.reactNative.reactNativeStrings.easeOut
import typings.reactNative.reactNativeStrings.keyboard
import typings.reactNative.reactNativeStrings.linear
import typings.reactNative.reactNativeStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ type in react-native.react-native.LayoutAnimationType ]: type} */
trait LayoutAnimationTypes extends StObject {
  
  var easeIn: typings.reactNative.reactNativeStrings.easeIn
  
  var easeInEaseOut: typings.reactNative.reactNativeStrings.easeInEaseOut
  
  var easeOut: typings.reactNative.reactNativeStrings.easeOut
  
  var keyboard: typings.reactNative.reactNativeStrings.keyboard
  
  var linear: typings.reactNative.reactNativeStrings.linear
  
  var spring: typings.reactNative.reactNativeStrings.spring
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
